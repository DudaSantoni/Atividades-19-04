package estruturaRepeticao;

import java.util.Scanner;

public class DezNumeros {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int num = 0, impar = 0, par = 0;

		for(int i = 1; i <=10; i++) {
			System.out.println ("Número:" );
			num = ler.nextInt();


			if (num %2 == 0) {
				par ++;
			}

			else  {
				impar ++;
			}
		}
		System.out.println("A quantidade de números pares é: " + par);
		System.out.println("A quantidade de números ímpares é: " + impar);

		ler.close();

	}

}
