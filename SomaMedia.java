package estruturaRepeticao;

import java.util.Scanner;

public class SomaMedia {

	public static void main(String[] args) {
		double num, soma=0, media;

		Scanner ler = new Scanner(System.in);

		for(Double i = 1.0; i <=5.0; i++) {
			System.out.println ("Número:" );
			num = ler.nextDouble();

			soma += num;
		}
			media = soma/5;

			System.out.println("Soma =" +soma +" e Média =" +media);
			ler.close();

		

	}
}