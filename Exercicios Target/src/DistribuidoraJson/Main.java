package DistribuidoraJson;

import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class Main {

	public static void main(String[] args) {

		Distribuidora distribuidora = new Distribuidora();
		ArrayList<Distribuidora> dados = new ArrayList<Distribuidora>();

		double menor = 0, maior = 0;
		double soma = 0, media = 0;
		int dias = 0, diasMaior = 0;

		JsonParser parser = new JsonParser();

		try {
			JsonArray dadosDistrib = (JsonArray) parser
					.parse(new InputStreamReader(new FileInputStream("dados.json"), "UTF-8"));
			for (Object o : dadosDistrib) {
				JsonObject dados_ = (JsonObject) o;
				Integer dia = Integer.parseInt(dados_.get("dia").toString());
				Double valor = Double.parseDouble(dados_.get("valor").toString());

				distribuidora = new Distribuidora();
				distribuidora.setDia(dia);
				distribuidora.setValor(valor);
				dados.add(distribuidora);

				if (valor < menor) {
					menor = valor;
				}

				if (valor > maior) {
					maior = valor;
				}

				if (valor != 0) {
					soma = soma + valor;
					dias += 1;
				}

				media = soma / dias;
				if (valor > media) {
					diasMaior += 1;
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("O menor valor de faturamento ocorrido em um dia foi de: R$" + menor);
		System.out.println(" ");
		System.out.printf("O maior valor de faturamento ocorrido em um dia foi de: R$%.2f. %n", maior);
		System.out.println(" ");
		System.out.println("Por " + diasMaior + " dias o valor de faturamento diário foi superior à média mensal.");

	}
}
