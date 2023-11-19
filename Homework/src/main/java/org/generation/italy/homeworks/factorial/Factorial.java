package org.generation.italy.homeworks.factorial;

import java.util.Scanner;

public class Factorial {
	public static void main (String[] args){
		Scanner scanner = new Scanner(System.in);
		int n = 0,factorial;
		
		System.out.println("Inserisci il numero di cui calcolare il fattoriale");
		do {
			n= scanner.nextInt();
			if(n<2){ System.out.println("Scrivere un numero maggiore di 1");}
		}while(n<2);
		factorial=n;
		for(int i=n-1;i>0;i--){
			factorial*=i;
		}
		System.out.printf("Il fattoriale di %d equivale a %d\nm",n,factorial);
		
		//Versione ricorsiva
		factorial=recursiveFactorial(n);
		System.out.printf("\nRICORSIONE\nIl fattoriale di %d equivale a %d\n",n,factorial);
	}
	
	public static int recursiveFactorial(int n){
		if (n<2) return 1;
		return recursiveFactorial(n-1)*n;
	}
}
