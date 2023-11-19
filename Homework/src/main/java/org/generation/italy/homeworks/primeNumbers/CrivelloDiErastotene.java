package org.generation.italy.homeworks.primeNumbers;

import java.util.Scanner;

import static org.generation.italy.homeworks.primeNumbers.PrimeNumbers.isPrime;

public class CrivelloDiErastotene {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double n = 0,div=2;
		int cont=0;
		System.out.println("Numero limite per l'array da riempire");
		do {
			n= scanner.nextInt();
			if(n<2){ System.out.println("Scrivere un numero maggiore di 1");}
		}while(n<2);
		boolean[] primesArray= primeErastotene(n,div);

		for(int i=0; i<n+1;i++){
			if(primesArray[i])
				System.out.printf("[%d]: Primo\n",i);
			else
				System.out.printf("[%d]: Non Primo\n",i);
		}
	}
	public static boolean[] primeErastotene(double n, double div){
		boolean[] array=new boolean[(int)(n+1)];
		for(int i=2; i<n; i++){
			array[i]=true;
		}
		for(int i=2; i<n+1;i++){
			if(isPrime(i,div)) {
				for (int j = i * i; j < n+1; j += i) {
					array[j] = false;
				}
			}
		}
		return array;
	}
}
