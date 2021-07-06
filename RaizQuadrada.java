import java.util.Scanner;
public class RaizQuadrada {
	public static void main(String args[]) {
		Scanner leia = new Scanner(System.in);
		final int TAM=5;
		int i, a[];
		double b[];
		a = new int[TAM];
		b = new double [TAM];
		for(i=0; i<TAM; i++) {
			System.out.println("Digite o "+(i+1)+" elemento do vetor A:");
			a[i] = leia.nextInt();
			b[i] = Math.sqrt(a[i]);
		}
		System.out.print("\nVetor A: ");
		for (i=0; i<TAM; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.print("\nVetor B: ");
		for (i=0; i<TAM; i++) {
			System.out.print(b[i]+" ");
		}
		leia.close();
	}

}
