import java.util.Random;															//provo ad usare nextint

public class BinarySearch {

	public static void main (String[] args) {
	
		//int[] array= new int [] {1,4,5,7,12,21,30,44,57,72,91,100,112,127};		//l'algoritmo di ricerca binaria ha bisogno di un array ordinato
		final int dim=20;															//dimensione array
		final int randRange=40;														//massima differenza tra due valori consecutivi
		int[] array=new int[dim];
		Random rand = new Random();

		System.out.print("Array costituito dai seguenti valori:\n\n");
		for(int i=0; i<dim ; i++){													//generazione casuale di array ordinato
			if(i==0){
				array[0]=rand.nextInt(randRange);
			} else { 
				array[i]=array[i-1]+(rand.nextInt(randRange))+1;						
			}
			System.out.print(" "+array[i]);
		}
		System.out.println("\n");
		int low=0,high=array.length-1;												//dichiaro gli estremi per l'algoritmo di ricerca

		Random rand2 = new Random();												//voglio generare casualmente il valore da trovare
		int target =array[rand2.nextInt(array.length-1)];

		System.out.println("Il valore da trovare sarà "+target);
		while(low<=high){
			int pivot=low+(high-low)/2;												//individuo l'indice mediano, che si riaggiornerà ad ogni ciclo
			System.out.println("Pivot: "+pivot+"\tLow: "+low+"\t\tHigh: "+high);	//stampo gli aggiornamenti delle variabili
			for(int i = 0; i<array.length;i++){										//visualizzazione del processo
				if(pivot==i){
					System.out.print(" P");			//stampa indice Pivot
				} else if(low==i){
					System.out.print(" L");			//stampa indice Low
				}else if(high==i){
					System.out.print(" H");			//stampa indice High
				} else{
					System.out.print(" ■");			//stampa tutti gli indici
				}
			}
			System.out.println("\n");
			if(array[pivot]== target) {												//se il valore è all'indice mediano il programma termina e l'indice viene stampato
				System.out.println("Valore trovato all'indice "+pivot);
				break;																//necessario per evitare un ciclo infinito
			} else if(array[pivot]>target) {										//se il valore è inferiore al valore mediano si aggiornano gli estremi di ricerca alla metà sinistra
				high=pivot-1;
			} else {																//se il valore è maggiore al valore mediamo si aggiornano gli estremi di ricerca alla metà di destra
				low=pivot+1;
			}
		}
	}
}