import java.util.Random;
public class Question20 {
	public static void main(String[] args) {
	/*Create un array di 10 valori numeri e utilizzando un ciclo do while sommate tutti i numeri insieme e successivamente stampate la sommma */
		int[] fullArray= new int[10];
		int sum=0,index=0;
		Random rand = new Random();

		do {
			fullArray[index]=rand.nextInt(100);
			sum+=fullArray[index];
			index++;
		} while(index<fullArray.length);
		System.out.println(sum);
	}
}