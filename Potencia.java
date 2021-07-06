import java.util.Scanner;
public class Potencia {
	public static void main(String args[]) {
		Scanner leia = new Scanner(System.in);
		int i = 0, p = 1, b, e;
		System.out.println("Digite a base:");
		b = leia.nextInt();
		System.out.println("Digite o expoente:");
		e = leia.nextInt();
		do {
			p = b*p;
			i++;
		}while (i<e);
		System.out.println(p);
		leia.close();
	}

}
