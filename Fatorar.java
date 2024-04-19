package estruturaRepeticao;

import java.util.Scanner;

public class Fatorar {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.print("Digite um número: ");
		int num = ler.nextInt();

		int fat = 1;


		for (int i = 1; i <= num; i++) {
			fat *= i;
		}

		System.out.println("O fatorial de " + num + " é: " + fat);

		ler.close();
	}

}
