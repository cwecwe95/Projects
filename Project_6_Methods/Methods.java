import java.time.LocalDate;
import java.time.DayOfWeek;

public class Methods {
	//public static int numer=0;						//esempio di variabile globale

	public static void main(String[] args) {			//args sta per arguments
	System.out.println(4*3);
	//multiply4by3();											//restituisce 4*3 ma che si perde, perchè non viene utilizzato
	int number=multiply4by3();
	System.out.println(number);
	squaring();	
	LocalDate day= LocalDate.now();
	System.out.println(day);
	System.out.println("Cosa desideri oggi");
	//3000 righe dopo
	LocalDate day2= LocalDate.now();							//ripetere codice così crea problematiche:
	System.out.println(day2);									// 1) Il codice è meno ordinato e più lungo
	System.out.println("Cosa desideri oggi");					// 2) In caso di modifiche vanno ripetute più volte e possono sorgere errori

	//chiamata corretta
	findTodayDate();
	///3000 righe dopo
	findTodayDate();

	LocalDate today= LocalDate.now();
	DayOfWeek dayT= today.getDayOfWeek();

	String toReverse="IoPippo";
	reverseString(toReverse);

	}
	//public static DayOfWeek() 

	public static void findTodayDate() {
		LocalDate day= LocalDate.now();
		System.out.println(day);
		System.out.println("Cosa desideri oggi");
	}

	public static int multiply4by3() {						//static serve per rendere le cose globali ed essere richiamati da altri metodi
		return 4*3;										
	}

	public static void squaring() {
		int number1=multiply4by3();
		int number2=multiply4by3();
		System.out.println(number1*number2);


	}

	public static String reverseString(String s1){
		String s="";
		int sum=0;
		for(int i=s1.length()-1; i>=0; i--) {
			s+=s1.charAt(i);
		}
		return s;
	}
}