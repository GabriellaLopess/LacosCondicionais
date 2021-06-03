package br.com.laçoscondicionais;
import java.util.Scanner;
public class Exercicio1 {

	public static void main(String[] args){
		Scanner leia = new Scanner(System.in);
		int numero1, numero2, numero3 ;
		
		System.out.println("Digite o primeiro numero: ");
		numero1 = leia.nextInt(); 
		
		System.out.println("Digite o segundo numero: ");
		numero2 = leia.nextInt(); 
		
		System.out.println("Digite o terceiro numero: ");
		numero3 = leia.nextInt(); 
		
		
		 if(numero1 > numero2 && numero1 > numero3) {
				System.out.printf(" O numero maior é :" +  numero1) ;
				}
		 
		 else if(numero1 < numero2 && numero2 > numero3) {
				System.out.printf(" O numero maior é :" +  numero2) ;
				}
		 
		 else if(numero3 > numero2 && numero3 > numero1) {
				System.out.printf(" O numero maior é :" +  numero3) ;
				}
	} }
				
		
		
		
		


