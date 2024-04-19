package estruturaRepeticao;

import java.util.Scanner;

public class ImparPar {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int inicial, fim;

		System.out.println("Informe o número");
		inicial = ler.nextInt();

		System.out.println("Informe o número");
		fim = ler.nextInt();

		for(int i =inicial; i <=fim; i++) {
			System.out.println();

			if (i %2 == 0) {
				System.out.println("O número " + i + "é par");
			}

			else  {
				System.out.println("O número " + i + "é ímpar");

			}
		}
		ler.close();

	}

}
