package br.com.laçoscondicionais;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int numero;
		double raiz, elevado;

		System.out.println("Digite um número inteiro:");
		numero = entrada.nextInt();

		if(numero%2==0) {
			System.out.println("Par....");
			raiz = Math.sqrt(numero);
			System.out.println("A raiz do número é: " + raiz);
		}
		else if(numero%2==1) {
			System.out.println("Impar....");
			elevado = Math.pow(numero, 2);
			System.out.println("O quadrado do número é: " + elevado);
		}
	}

}