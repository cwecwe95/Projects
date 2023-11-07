public class Arrays {
	public static void main (String[] args){

		int x = 5;								
		int[] nums = new int[5];					// array con 5 posizioni, da 0 a 4
		System.out.println(nums[0]);				// stampa della posizione 0 (prima)
		System.out.println(nums[4]);				// stampa della posizione 4. Entrambe le stampe attualmente stampano 0 perchè inizialmente l'array viene riempito di 0
		System.out.println(nums[nums.length-1]);	// stampa l'ultima posizione. in questo caso 5 di lunghezza -1 = posizione 4
		nums[0]=27;
		nums[nums.length-1]=30;						// altro utilizzo di length. con length-1 assegno valori all'ultima posizione
		System.out.println(nums[nums.length-1]);

		//TODO: assegnare ad un array valori pari al triplo delle loro posizioni in caso di posizione dispari ed al doppio in caso di posizione pari

		for(int i=0; i<nums.length; i++) {
			if(i%2!=0) {
				nums[i]=i*3;
			}
			else {
				nums[i]=i*2;
			}
		}
		System.out.println("inizio for");
		for(int i=0; i<nums.length; i++) {
			System.out.print(i+"->");				//print non va a capo dopo la stampa
			System.out.println(nums[i]);			//println va a capo dopo la stampa come se mettesse un \n
		}
		//TODO: trovare il valore massimo dell'array e stamparlo

		int max=nums[0];
		for(int i=0; i<nums.length; i++) {
			if(max<nums[i]) {
				max=nums[i];
			}
		}
		System.out.println("Il valore più alto nell'array è "+max);

		//Versione 2 con While

		int max2=nums[0],i=0;
		while(i<nums.length){
			if(max2<nums[i]){
				max2=nums[i];
			}
			i++;
		}
		System.out.println("Il valore più alto nell'array è "+max2);
		
		//TODO: trovare il valore minimo dell'array e stamparlo
		
		int min=nums[0];
		for(int j=0; j<nums.length; j++) {
			if(min>nums[j]) {
				min=nums[j];
			}
		}
		System.out.println("Il valore più piccolo nell'array è "+min);

		//TODO: trovare la somma dei valori contenuti nell'array e salvala

		int sum=0;
		for(int j=0; j<nums.length ; j++) {
			sum+=nums[j];
		}
		System.out.println("La somma dei valori contenuti nell'array è "+sum);
		
		//TODO: trovare la media dei valori contenuti nell'array e salvala

		double media= (double)sum/nums.length;									//senza casting il risultato rimarrebbe 4.0
		System.out.println("La media dei valori è "+media);


		//TODO: scambia la posizione dei primi due valori nell'array

		int temp=nums[0];
		nums[0]=nums[1];
		nums[1]=temp;

		

		//TODO: verificare se un valore è presente o meno nell'array e salvare il risultato in una variabile booleana // Come extra ho verificato se fosse presente più volte e dove

		boolean found=false;
		int target=4;
		int[] where=new int [nums.length];

		for(int j=0,k=0; j<nums.length; j++) {
			if(nums[j]==target) {
				found=true;
				where[k]=j;
				k++;
				if(j==0) {
					System.out.println("Il valore "+ target + " è presente nell'array in posizione "+ j);
				}

			}
		}
		if(found) {
			for(int j=0; j<where.length;j++) {
				if(where[j]!=0) {
					System.out.println("Il valore "+ target + " è presente nell'array in posizione "+ where[j]);
				}
			}
		} else {
			System.out.println("Il valore "+ target + "non è presente nell'array");
		}

		//TODO: trovare il numero più presente nell'array e salvarlo nella variabile moda, lol.

		//Mia versione con secondo array

		nums[1]=9;
		int mode=-1;
		int modeQuantity=0;

		int[] modeCheck=new int[nums.length];

		for(int j=0; j<nums.length; j++) {
			for(int k=0; k<modeCheck.length; k++) {
				if(nums[j]==nums[k]){
					modeCheck[j]++;
				}
			}
			if(modeCheck[j]>mode){
				mode=nums[j];
				modeQuantity=modeCheck[j];
			}
		}
		System.out.println("Il numero più presente è "+ mode + " che è presente "+ modeQuantity + " volte");

		// Versione della classe

		int repeated=-1;
		for(int j=0; j<nums.length; j++) {
			for(int k=0; k<nums.length; k++) {
				if(nums[k]==nums[j]) {
					repeated=nums[k];
					break;
				}
			}
		}
		// Versione della classe che dice quante volte è ripetuto

		for(int j=0; j<nums.length; j++) {
			for(int k=0; k<nums.length; k++) {
				if(nums[k]==nums[j]) {
					repeated++;
					
				}
			}
			if(repeated > 1){
				break;
			}
		}
		//Mia versione senza doppio array
		int mode2=-1, index=-1,rep=0;				//si assegnano valori -1 e 0 per essere facilmente riassegnabili nel for

		for(int j=0; j<nums.length; j++) {			
			int repetition=0;						//resettiamo il contatore a 0 ogni volta che il primo ciclo scorre su un nuovo numero
			for(int k=0; k<nums.length; k++) {		//secondo ciclo che esegue i confronti con il primo, che per ora è statico per fare più confronti su uno stesso indice
				if(nums[j]==nums[k]) {
					repetition++;
				}
			}
			if(repetition>rep) {
				rep=repetition;						//salviamo il numero di ripetizioni
				mode2=nums[j];						//salviamo il valore che abbiamo verificato si ripeta
				index=j;							//salviamo l'indice di quel valore
			}
		}
		System.out.println("Il numero in posizione "+index+" -> "+mode2+" è il più presente nell'array");
	}
}
