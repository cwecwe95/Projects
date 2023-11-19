package org.generation.italy.homeworks.binarySearch;

import java.util.Random;

public class BinarySearch {
	public static void main(String[] args) {
		final int DIM = 100, RAND_RANGE = 40;	//Cambia Dim per cambiare la dimensione dell'array. Cambia RAND_RANGE per modificare la grandezza dei valori
		int[] array = new int[DIM];
		int low = 0, high = array.length - 1, pivot = 0;
		Random rand = new Random();
		
		System.out.println("Array Costituito dai seguenti valori:");
		for (int i = 0; i < DIM; i++) {
			if (i == 0) {
				array[i] = rand.nextInt(RAND_RANGE);
			} else {
				array[i] = array[i - 1] + rand.nextInt(RAND_RANGE);
			}
			System.out.print(" " + array[i]);
		}
		int target = array[rand.nextInt(array.length)];
		
		System.out.printf("\nIl valore da trovare sarà %d\n\n", target);
		
		while (low < high) {
			pivot=low+(high-low)/2;
			System.out.printf("Pivot: %d\tLow: %d\tHigh: %d\n",pivot,low,high);
			binarySearchVisualization_CurrentStatus(array,pivot,low,high);		//visualizzazione step binary search (commentabile)
			System.out.println("\n");
			if(array[pivot]==target){
				System.out.printf("Valore trovato all'indice %d\n",pivot);
				break;
			} else if(array[pivot]>target){
				high=pivot-1;
			}else {
				low = pivot+1;
			}
		}
		
	}
	public static void binarySearchVisualization_CurrentStatus(int[] array,int pivot, int low, int high){
		for(int i=0; i< array.length;i++) {
			if (pivot == i) {
				System.out.print(" P");
			} else if (low == i) {
				System.out.print(" L");
			} else if (high == i) {
				System.out.print(" H");
			} else {
				System.out.print(" ■");
			}
		}
	}
}
