package org.generation.italy.homeworks.oopExercises.Circle;

public class TestCircle {
	public static void main(String[] args) {
		
		
		//dichiariamo un'istanza della classe Circle chiamata C1 ed usiamo il costruttore di default (quello inizializzato da noi)
		
		Circle c1 = new Circle();
		
		//chiamiamo i metodi get creati su c1 e stampiamo
		System.out.println("Il cerchio(c1) ha raggio:" + c1.getRadius()+" and area of "+c1.getArea());
		
		//dichiariamo un'altra istanza c2 che usera il secondo costruttore
		Circle c2 = new Circle(2.0);
		System.out.println("Il cerchio(c2) ha raggio:" + c2.getRadius()+" and area of "+c2.getArea());
		
		//c1.Radius=5; //variabile privata. Impossibile l'assegnazione diretta
		
		//creiamo un altro cerchio con il terzo costruttore e stampiamo.
		Circle c3 = new Circle(3.0,"Blu");
		System.out.println("Il cerchio(c3) ha raggio:" + c3.getRadius()+" and area of "+c3.getArea());
		//modifichiamo i 2 valori con i set appena creati
		c3.setRadius(5);
		c3.setColor("Giallo");
		System.out.println("Il cerchio(c3) ha raggio:" + c3.getRadius()+" and area of "+c3.getArea());
		System.out.println(c3.toString());
	}
}