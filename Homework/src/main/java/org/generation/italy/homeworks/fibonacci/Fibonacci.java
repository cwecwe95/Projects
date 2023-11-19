package org.generation.italy.homeworks.fibonacci;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = 0, first=1, second=1, fibonacci=0,choice;
		
		System.out.println("Inserisci 1 per ritornare il valore della sequenza ad un indice indicato\n" +
				"2 per ritornare il valore della sequenza subito prima del numero in input");
		do {
			choice= scanner.nextInt();
			if(choice!=1 && choice!=2){ System.out.println("Scrivere 1 o 2");}
		}while(choice!=1 && choice!=2);
		
		System.out.println("Indicare il valore/indice");
		do {
			n = scanner.nextInt();
			if(n<=2) {
				System.out.println("Inserisci un valore più grande di 2");
			}
		} while (n <= 2);
		switch (choice) {
			case 1:
				//Versione 1: ritorna il valore all'indice della sequenza indicato (valori iniziali inclusi)
				System.out.printf("[1]: %d\n[2]: %d\n", first, second);
				for (int i = 3; i <= n; i++) {
					fibonacci = first + second;
					first = second;
					second = fibonacci;
					System.out.printf("[%d]: %d\n", i, fibonacci);
				}
				System.out.printf("\nIl valore della sequenza di fibonacci all'indice %d vale %d\n", n, fibonacci);
				
				//Versione ricorsiva
				fibonacci=recursiveFibonacci(n);
				System.out.printf("\nRicorsione\nIl valore della sequenza di fibonacci all'indice %d vale %d",n,fibonacci);
				break;
			case 2:
				//Versione 2: ritorna il valore della sequenza subito prima del valore digitato
				first = 1;
				second = 1;                //reset valori
				fibonacci = 0;
				System.out.printf("[1]: %d\n[2]: %d\n", first, second);
				
				for (int i = 3; (first + second) <= n; i++) {
					fibonacci = first + second;
					first = second;
					second = fibonacci;
					System.out.printf("[%d]: %d\n", i, fibonacci);
				}
				System.out.printf("\nIl valore della sequenza di fibonacci più vicino e minore del valore digitato è %d\n", fibonacci);
				
				//Versione ricorsiva
				first=1;
				second=1;
				fibonacci=recursiveFibonacciClosestValue(n,first,second);
				System.out.printf("\nIl valore della sequenza di fibonacci più vicino e minore del valore digitato è %d\n",fibonacci);
				break;
			default:
				System.out.println("Err");
				break;
		}
	}
	
	
	public static int recursiveFibonacci(int n) {
		if(n<=2){
			return 1;
		}
		return recursiveFibonacci(n-1)+recursiveFibonacci(n-2);
	}
	
	public static int recursiveFibonacciClosestValue(int n,int first, int second){
		int temp=second;
		if(first+second+temp>n)
			return first+second;
		second+=first;
		first=temp;
		return recursiveFibonacciClosestValue(n,first,second);
		
	}
}

