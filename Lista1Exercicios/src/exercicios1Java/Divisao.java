package exercicios1Java;
import java.util.Scanner;
public class Divisao{
	public static void main (String[]args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Digite um numero");
		int numero1 = sc.nextInt();
		System.out.println("Digite o segundo valor");
		int numero2 = sc.nextInt();
		int resultado = numero1/numero2;
		System.out.println("o Resultado da divisaoé " + resultado);
		sc.close();
		
	}

}

