public class HelloWorld {
	public static void main(String[] args) {
		System.out.println("Hello World");
		String hello="Hello World";
		System.out.println(hello);

		int x=3160;
		double y=3.14;
		System.out.println(x);
		// commento
		System.out.println(y);
		System.out.println(x+y);		//stampa la somma dei due numeri
		System.out.println(x+"\n"+y);	//non potendo sommare interi con stringhe, lui userà l'operatore somma delle stringhe, convertendo il valore x in stringa e concatenandole
										//System.out.println(x,y); è errato perchè questa sintassi rappresenta il tentativo di passare 2 argomenti a println che ne richiede solo 1 
										//è come scrivere System.out.println(String.valueof(x)+"\n"+String.valueof(y));

		double w= (double)9;			//questo processo si chiama Cast e rappresenta la conversione dei tipi. In questo caso la sintassi non sarebbe necessaria o dannosa-> implicito
										// e non genererà mai perdita di dati. Al contrario l'assegnazione di un double ad un int genererà errore, un cast forzato causa perdita di dati
		int t;

		final int b=3;
		boolean h=true; 				//questo tipo di variabile può contenere solo vero o falso
		double clientBalance;			//le variabili van minuscolo(java è casesensitive ed è una bestpractice), e usa il camelcase, come in esempio. 
		//variabili intere
		byte b1=8;						//byte è un tipo di variabile primitiva ed è intera signed (può contenere interi positivi e negativi) contiene 8 bit=2^8 numeri rappresentati
		short s1=200; 					//16 bit signed, 2^16 numeri rappresentati
		int i1=1_000_000_000;			//32 bit signed, 2^32 numeri rappresentati
		long l1=10_000_000_000L;		//64 bit signed, 2^64 numeri rappresentati //la L in fondo è necessaria perchè il numero in assegnazione è int, long l1=10_000_000_000; darebbe errore
		char c1='a';					//16 bit unsigned
		//variabili decimali
		float f1=3.14F;					//32 bit floating point //serve la F perchè l'assegnazione di default di numeri con la virgola è il double
		double d1=3.14;					//64bit. si chiama così perchè è usa il doppio dei bit del float
		boolean b2=false; 				//contiene solo 2 valori, vero e falso

		
		boolean isBalanceNegative=false;
		if(isBalanceNegative) {
			System.out.println("sei un barbone");
			System.out.println("sei un GROSSO barbone");
		}

		double height=175;
		boolean isVeryTall=height>=200;		//inizializza la booleana con una condizione (in questo caso falsa), che stampo in riga 62
		double weight=98.7; 
		if(height>200) {
			if(weight>110) {
				System.out.println("potresti giocare a basket ma sei un po grassoccio");
			} else {
				System.out.println("vai a giocare a basket");
			}
		}else if(height>180 && weight>90) {				//AND = unisce due condizioni, devono essere entrambe true per ritornare true
			System.out.println("sei alto ma grasso");
		}else if(height>180 && weight<90) {
			System.out.println("sei alto e magro");
		} else if(height>170) {
			System.out.println("sei medio");
		} else {
			System.out.println("sei basso");
		}
		System.out.println(isVeryTall);

		boolean isSunny=false;
		double temperature=26;
		if (isSunny || temperature>25) {				//OR = unisce due condizioni, a differenza dell'AND basta che una sia true per ritornare true
			System.out.println("tutti al mare");
		}

		int z1=0;
		int r3=10;
		if(z1 != 0 && r3/z1>3) {						//dovrebbe mostrare un'operazione illegale (divisione per 0) ma per via del cortocircuito logico non andrà in errore
			System.out.println("");
		}	

		for(int i=0; i<4; i++) {						//
			System.out.println();
		}						
	}
}