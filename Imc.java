import java.util.Scanner;
public class Imc {
	public static void main(String args[]) {
		Scanner leia = new Scanner(System.in);
		
		double p, a, imc;
		
		System.out.println("Digite o peso:");
		p = leia.nextDouble();
		
		System.out.println("Digite a altura:");
		a = leia.nextDouble();
		
		imc = p/(a*a);
		
		System.out.println("O imc é: "+imc);
		if (imc<18.5) {
			System.out.println("Excesso de magreza");
		}
		else if (imc<25) {
			System.out.println("Peso normal");
		}
		else if (imc<30) {
			System.out.println("Excesso de peso");
		}
		else if (imc<35) {
			System.out.println("Obesidade (Grau 1)");
		}
		else if (imc<40) {
			System.out.println("Obesidade (Grau 2)");
		}
		else {
			System.out.println("Obesidade (Grau 3)");
		}
		leia.close();
	}

}
