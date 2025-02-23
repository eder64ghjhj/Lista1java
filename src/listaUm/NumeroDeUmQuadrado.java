package listaUm;
import java.util.Scanner;
public class NumeroDeUmQuadrado {
	public static void main (String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o numero do quadrado");
		
		int numero = sc.nextInt();
		
		int Quadrado = numero*numero;
		System.out.println("O numero do quadrado é " + numero + " é " + Quadrado );
		
	sc.close();
	}
}