import java.util.Random;
public class Question19 {
	public static void main(String[] args) {
	/*Create un array di cinque valori del tipo stringa, trovate una parola all'interno del vostro array utilizzando un numero generato a caso
	e stampate la stringa al rovescio (domanda difficile valida per due punti) */

	String[] stringArr=new String[] {"Harry", "Hermione", "Ron", "Silente", "Voldemort"};
	Random rand = new Random();	
	int target= rand.nextInt(stringArr.length);							//seleziono casualmente l'indice da stampare

	for(int i=stringArr[target].length()-1; i>=0; i--) {
		System.out.print(stringArr[target].charAt(i)+" ");					//"rompo" la stringa in caratteri ed accedo alla posizione di ogni carattere a ritroso, stampandola
	}
	System.out.println("");
	}
}

/* 	string p="pippo";
	StringBuilder sb=	new StringBuilder(p);				//volendo -> new StringBuilder(p).reversed().toString(); 	//lo stringbuilder con reverse sta rovesciando la stringa, 
															//ma non la sta mettendo su p, il .tostring serve per salvarlo su reversed
	sb.reverse();											//rovescio lo stringbuilder
	Systme.out.println(sb);									//lo stampo e viene giusto, ma perchè tostring viene chiamato automaticamente ogni volta che stampo

	String reversed=sb.toString();							//questo serve per accedere effettivamente al tipo stringa, lo stringbuilder non è la stessa cosa altrimenti
	System.out.println(reversed);							//stampa la stringa al contrario.

	System.out.println(reversed);			//stampa la stringa a rovescia
	//System.out.println(p);				//stampa la stringa originale
*/