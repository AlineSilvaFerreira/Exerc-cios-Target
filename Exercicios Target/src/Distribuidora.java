
public class Distribuidora {

	public static void main(String[] args) {
		double SP = 67836.43, RJ = 36678.66, MG = 29229.88;
		double ES = 27165.48, outros = 19849.53;
		
		double total = SP + RJ + MG + ES + outros;
		System.out.printf("Faturamento mensal total: R$%.2f %n",total);
	
		System.out.println(" ");
		System.out.println("|     Estado     |   %   |");
		System.out.println(" ");
		double percSP = (SP * 100) / total;
		System.out.printf("|   São Paulo    | %.2f |%n",percSP);
		
		double percRJ = (RJ * 100) / total;
		System.out.printf("| Rio de Janeiro | %.2f | %n",percRJ);
		
		double percMG = (MG * 100) / total;
		System.out.printf("|  Minas Gerais  | %.2f |%n",percMG);
		
		double percES = (ES * 100) / total;
		System.out.printf("| Espírito Santo | %.2f |%n",percES);
		
		double percOutros = (outros * 100) / total;
		System.out.printf("|     Outros     | %.2f |",percOutros);
		
	}

}
