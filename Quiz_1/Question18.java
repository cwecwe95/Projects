import java.util.Random;
public class Question18 {
	public static void main(String[] args) {
		/*Create un array con sei valori numerici, utilizzate un ciclo for per riempire i valori e successivamente trovate il valore massimo all'interno dell'array,
		il valore minimo all'interno dell'array, il valore mediano all'interno dell'array e la lunghezza di questo array*/
		int[] fullArray= new int[6];
		int index=0,median;
		Random rand = new Random();

		for(int i=0; i<fullArray.length; i++) {
			fullArray[i]=rand.nextInt(100);
		}
		for(int i=0; i<fullArray.length; i++) {
			for(int j=0; j<fullArray.length;j++) {
				if(fullArray[j]>fullArray[i]) {
					int temp=fullArray[j];
					fullArray[j]=fullArray[i];
					fullArray[i]=temp;
				}
			}
		}
		for(int i=0; i<fullArray.length; i++) {
			System.out.print(fullArray[i]+" ");
		}
		System.out.println("\nValore minimo: "+fullArray[0]+"\nValore mediano: "+fullArray[fullArray.length/2]+"\nValore massimo: "+fullArray[fullArray.length-1]);
	}
}