import java.util.Random;
public class Question17 {
	public static void main(String[] args) {
		/*Scrivete un programma Java che crei un altro array con sei valori numeri e create un ciclo while
		per riempire i campi dell'array e successivamente ordinate i valori*/
		int[] fullArray= new int[6];
		int index=0;
		Random rand = new Random();

		while(index<fullArray.length){
			fullArray[index]=rand.nextInt(100);
			index++;
		}
		index=0;
		int temp;
		boolean sorted=true;
		while(sorted){
			sorted=false;
			index=0;
			while(index < fullArray.length-1){

				if(fullArray[index]>fullArray[index+1]){

					temp=fullArray[index];
					fullArray[index]=fullArray[index+1];
					fullArray[index+1]=temp;
					sorted=true;
				}
				index++;
			}

		}
		for(int i=0;i<fullArray.length;i++){
			System.out.print(fullArray[i]+"\t");
		}
		System.out.println("");
	}
}