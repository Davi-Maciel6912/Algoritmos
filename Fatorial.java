import java.util.Scanner;
public class Fatorial {
	public static void main(String args[]) {
		Scanner leia = new Scanner(System.in);
		int i = 1, fat = 1, n;
		System.out.println("Digite um n�mero inteiro:");
		n = leia.nextInt();
		while(i<=n) {
			fat = fat*i;
			i++;
		}
		System.out.println("O n�mero fatorado � "+fat);
		leia.close();
	}

}
