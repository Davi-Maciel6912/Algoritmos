import java.util.Scanner;
public class AlturaPeso {
	public static void main(String args[]) {
		Scanner leia = new Scanner(System.in);
		int i = 1;
		double a, p, imc, media, alturaTotal = 0;
		for(i=1; i<15; i++) {
			System.out.println("Digite a altura do usuário:");
			a = leia.nextDouble();
			System.out.println("Digite o peso do usuário:");
			p = leia.nextDouble();
			
			imc = p/a;
			
			System.out.println("O IMC é "+imc);
			
			alturaTotal = alturaTotal + a;
		}
		media = alturaTotal/15;
		System.out.println("A média das alturas é "+media);
		leia.close();
	}

}
