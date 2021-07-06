import java.util.Scanner;
public class Fibonacci {
	public static void main(String args[]) {
		Scanner leia = new Scanner(System.in);
		int i = 1, n, ant = 0, atual = 1, prox;
		System.out.println("Digite o número de termos:");
		n = leia.nextInt();
		do {
			System.out.println(atual);
			prox = atual + ant;
			ant = atual;
			atual = prox;
			i++;
		}while (i<=n);
		leia.close();
	}

}
