package org.generation.italy.homeworks.oopExercises.Circle;

public class Circle {
	//variabili da istanziare private, in modo che non siano accessibili da altre classi
	private double radius;
	private String color;
	
	//costruttori (overloaded, significa che più di uno è implementato)
	//servono ad inizializzare gli oggetti.
	
	//in questo caso metterò valori di default
	public Circle() {
		this.radius = 1.0;
		this.color = "red";
	}
	
	public Circle(double r) {
		this.radius = r;
		this.color = "red";
	}
	//terzo costruttore completamente da inizializzare
	public Circle(double r, String c){
		this.radius=r;
		this.color=c;
	}
	
	//metodi pubblici
	//getradius ritorna il valore radius
	public double getRadius() {
		return this.radius;
	}
	public void setRadius(double radius) {
		this.radius=radius;
	}
	
	//metodo get area calcola e ritorna l'area del cerchio
	public double getArea() {
		return this.radius * this.radius * Math.PI;
	}
	public String getColor() {
		return this.color;
	}
	public void setColor(String color) {
		this.color=color;
	}
	@Override
	public String toString(){
		return "Cerchio[raggio="+this.radius+" colore="+this.color+"]";
	}
}
