import java.util.Random;
public class Question12 {
	public static void main(String[] args) {
		/*Scrivete un programma Java che salva due variabili, una "Cane" e un'altra "Gatto", e stampate le due variabili utilizzando un solo statement di print.*/
		
		int cane,gatto;
		Random rand = new Random();
		cane=rand.nextInt(100);
		gatto=rand.nextInt(100);

		System.out.println("Cane = "+cane+"\tGatto = "+gatto);
	}
}