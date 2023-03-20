import java.util.Scanner; 

public class Fibonacci {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		int numero, pertence = 0;
		
		System.out.println("Informe um número: (entre 0 e 524229)");
		numero = scan.nextInt();

		int n1 = 1;
		int n2 = 0;		

		System.out.println(" ");
		System.out.println("Primeiros 20 elementos da Sequência de Fibonacci:");
		System.out.print(n2 + " ");
		System.out.print(n1 + " ");

		for (int i = 0; i < 28; i++) {			
			
			n1 = n1 + n2;
			n2 = n1 - n2;
			System.out.print(n1 + " ");			

			if (numero == n1) {
				pertence = +1;
			}
		}
		
		System.out.println(" ");
		System.out.println(" ");

		if (pertence != 0) {
			System.out.println("O número " + numero + " pertence a Sequência de Fibonacci.");
		} else {
			System.out.println(("O numero " + numero + " não pertence a Sequência de Fibonacci."));
		}

		scan.close();
	}
	}
