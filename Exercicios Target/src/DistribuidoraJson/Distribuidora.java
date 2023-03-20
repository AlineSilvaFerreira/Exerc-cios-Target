package DistribuidoraJson;

import java.util.ArrayList;

public class Distribuidora {
	
	private int dia;
	private Double valor;
	
	public int getDia() {
		return dia;
	}
	
	public void setDia(int dia) {
		this.dia = dia;
	}
	
	public Double getValor() {
		return valor;
	}
	
	public void setValor(Double valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "Distribuidora [dia=" + dia + ", valor=" + valor + "]";
	}

	
	
	
	

}
