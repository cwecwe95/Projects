package org.generation.italy.homeworks.primeNumbers;

import java.util.Scanner;

import static org.generation.italy.homeworks.primeNumbers.PrimeNumbers.isPrime;

public class FillArrayWithPrimeNumbers {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double n = 0,div=2;
		int cont=0;
		System.out.println("Numero limite per l'array da riempire");
		do {
			n= scanner.nextInt();
			if(n<2){ System.out.println("Scrivere un numero maggiore di 1");}
		}while(n<2);
		
		for(int i=2; i<=n;i++) {
			if (isPrime(i, div)) {
				cont++;
			}
		}
		int[] primeArray=new int[cont];
		for(int i=2,j=0; i<=n; i++){
			if(isPrime(i,div)) {
				primeArray[j] = i;
				j++;
			}
		}
		for(int i=0; i<cont; i++){
			System.out.printf("[%d]->%d\n",i,primeArray[i]);
		}
		
	}
}
