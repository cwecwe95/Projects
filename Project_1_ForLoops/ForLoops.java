public class ForLoops {
	public static void main (String[] args) {
		boolean pippo=true;
		for(int i=0; i<4 ; i++) {							//For (istruzioni eseguite una volta; condizioni per la ripetizione (true per ripetere); istruzioni eseguite a fine ciclo)
			System.out.println("Siamo i campioni del mondo!");
			if(pippo && i==2) {
				break;										// interrompe il for, in questo caso dopo 3 ripetizioni
			}
		}
		//TODO: stampare i primi 10 numeri, e stampare se ogni numero è pari o dispari
		for(int i=1; i<=10; i++) {
			if(i%2==0) {
				System.out.println("Il numero "+i+" è pari.");
			}
			else {
				System.out.println("Il numero "+ i +" è dispari.");
			}
		}
	}
}