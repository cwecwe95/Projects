package org.generation.italy.homeworks.primeNumbers;

import java.util.Scanner;

public class PrimeNumbers {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double n = 0,div=2;
		System.out.println("Numero primo da verificare");
		do {
			n= scanner.nextInt();
			if(n<2){ System.out.println("Scrivere un numero maggiore di 1");}
		}while(n<2);

		if(isPrime(n,div)){
			System.out.printf("%.0f,0 è un numero primo\n",n);
		} else {
			System.out.printf("%.0f,0 NON è un numero primo\n",n);
		}
	}
	public static boolean isPrime(double n, double div){
		if(n<2){ return false; }
		if(div>Math.sqrt(n)){ return true; }
		if(n%div==0){ return false; }
		return isPrime(n,div+1);		//div viene usato sia come indice che come divisore
	}
}
