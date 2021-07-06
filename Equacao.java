import java.util.Scanner;
public class Equacao {
	public static void main(String args[]) {
		Scanner leia = new Scanner(System.in);
		double a, b, c, delta, r1, r2;
		
		System.out.println("Digite o valor de A:");
		a = leia.nextDouble();
		System.out.println("Digite o valor de B:");
		b = leia.nextDouble();
		System.out.println("Digite o valor de C:");
		c = leia.nextDouble();
		
		delta = (b*b)-(4*a*c);
		if (delta<0) {
			System.out.println("Não existem raízes reais.");
		}
		else if (delta==0) {
			System.out.println("Existe apenas uma raíz real.");
			r1 = -b/(2*a);
			System.out.println("O valor da raíz é: "+r1);
		}
		else {
			System.out.println("Exite duas raízes reais.");
			r1 = (-b + Math.sqrt(delta))/(2*a);
			r2 = (-b - Math.sqrt(delta))/(2*a);
			System.out.println("O valor da primeira raíz é: "+r1+" e o valor da segunda raíz é: "+r2);
		}
		leia.close();
	}

}
