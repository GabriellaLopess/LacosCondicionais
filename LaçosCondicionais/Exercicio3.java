package br.com.laçoscondicionais;
 import java.util.Scanner ;
public class Exercicio3 {

	public static void main(String[] args) {
	Scanner idade = new Scanner(System.in);
	int numero ; 
	
	System.out.println("Escreva sua idade:");
	numero = idade.nextInt() ;
	
	if (numero >= 10 && numero <= 14) {
		System.out.println("Você faz parte do infantil");}
	
	else if (numero >= 15 && numero <= 17) {
		System.out.println(" Você faz parte do Juvenil");}
	
	else if (numero >= 18 && numero <= 25) {
		System.out.println("Você faz parte do Adulto"); }
	}
	
	

	}


