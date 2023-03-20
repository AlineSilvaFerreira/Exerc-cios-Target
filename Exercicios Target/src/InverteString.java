import java.util.Scanner;

public class InverteString {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com a string:");
		String palavra = scan.next();
		
		String novaPalavra = "";		
		
		for(int i = palavra.length() -1; i >= 0; i--) {
			novaPalavra = novaPalavra + Character.toString(palavra.charAt(i));
		}
		
		System.out.println(" ");
		System.out.println("String invertida: " +novaPalavra);

		scan.close();
	}

}
