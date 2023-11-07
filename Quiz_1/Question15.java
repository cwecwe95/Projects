public class Question15 {
	public static void main(String[] args) {
		/*Scrivete un programma Java che dovrebbe stampare sei volte la frase "Siamo i Campioni del Mondo" ma che si smetta alla terza.*/
		
		for(int i=0; i<6;i++) {
			if(i==3) break;
			System.out.println("Siamo i Campioni del Mondo");
		}

	}
}