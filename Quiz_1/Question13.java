import java.util.Random;
public class Question13 {
	public static void main(String[] args) {
		/*Scrivete un programma che salva due numeri e li somma, sottrae il maggiore dal minore, divide il maggiore per il minore,
		li moltiplica l'uno per l'altro e trova il resto della divisione del maggiore per il minore*/
		
		double a,b,subtraction,addition,multiplication,division,modulo;
		Random rand = new Random();
		do {
			a=rand.nextInt(100); 			//voglio comunque valori interi, per semplicità di verifica e lettura
			b=rand.nextInt(100);
		} while(a==0 || b==0);
		if(a>=b){
			System.out.println("Valore1: "+a+"\tValore2: "+b+"\nAddizione: "+(a+b)+"\tSottrazione: "+(a-b)+"\tMoltiplicazione: "+(a*b)+"\tDivisione: "+(a/b)+"\tModulo: "+(a%b));			//Extra, stampa senza salvare i valori, perchè si	
			subtraction=a-b;
			division=a/b;
			modulo=a%b;
		} else {
			System.out.println("Valore1: "+a+"\tValore2: "+b+"\nAddizione: "+(a+b)+"\tSottrazione: "+(b-a)+"\tMoltiplicazione: "+(a*b)+"\tDivisione: "+(b/a)+"\tModulo: "+(b%a));			//Extra, stampa senza salvare i valori, perchè si
			subtraction=b-a;
			division=b/a;
			modulo=b%a;
		}
		addition=a+b;
		multiplication=a*b;
		System.out.println("Valore1: "+a+"\tValore2: "+b+"\nAddizione: "+addition+"\tSottrazione: "+subtraction+"\tMoltiplicazione: "+multiplication+"\tDivisione: "+division+"\tModulo: "+modulo);
	}
}