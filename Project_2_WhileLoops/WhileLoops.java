public class WhileLoops {
	public static void main (String[] args) {
		int i=0;
		while(i<5) {
			System.out.println(i);
			i++;
		}
		i=0;
		while(i<4000) {
			try {
				//Thread.sleep(i);					//stampa con pause ad incrementi di 0.5s
				Thread.sleep(50);
			} catch (InterruptedException e) {		//serve mettere il try catch perchè sleep avrebbe lanciato questa eccezione e dato errore.
				System.err.println(e);
			}
			System.out.println(i);
			i+=500;
		}
		//TODO: Stampare un numero random tra 0 ed 1, ma che sia maggiore di 0.5
		//Versione 1 Brutta
		while(true) {
			double randNum = Math.random();				//genera un numero random tra 0 ed 1 (double)
			if(randNum>0.5) {
				System.out.println(randNum);
				break;
			}
		}
		//Versione 2
		double randNum2=0;
		while(randNum2<0.5)
		{
			randNum2=Math.random();
			if(randNum2>0.5) {
				System.out.println(randNum2);
			}
		}
		//Versione 3 Top
		double randNum3=Math.random();
		while(randNum3<0.5)
		{
			randNum3=Math.random();
		} 
		System.out.println(randNum3);

		double randnum4 =0;					//va dichiarata in precedenza altrimenti non esisterebbe al di fuori del do e non potrebbe far parte della condizione del while.
		do{
			randnum4 = Math.random();
		}while(randnum4<0.5);
		System.out.println(randnum4);
	}
}