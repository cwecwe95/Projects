package org.generation.italy.homeworks.oopExercises.library;

public class Book {
	private String title;
	private String author;
	private int yearOfRelease;
	private boolean available;
	private int numOfCopies;
	
	public Book(String title){
		this.title=title;
	}
	
	public Book(String title, String author, int yearOfRelease){
		this.title=title;
		this.author=author;
		this.yearOfRelease=yearOfRelease;
	}
	
	public Book(String title, String author, int yearOfRelease,boolean available){
		this.title=title;
		this.author=author;
		this.yearOfRelease=yearOfRelease;
		this.available=available;
	}
	
	public String getTitle(){
		return this.title;
	}
	public void setTitle(String title){
		this.title=title;
	}
	public String getAuthor(){
		return this.author;
	}
	public void setAuthor(String author){
		this.author=author;
	}
	public int getYearOfRelease(){
		return this.yearOfRelease;
	}
	public void setYearOfRelease(int yearOfRelease){
		this.yearOfRelease=yearOfRelease;
	}
	public boolean getAvailable(){
		return this.available;
	}
	public void setAvailable(boolean available){
		this.available=available;
	}
	public int getNumOfCopies(){
		return this.numOfCopies;
	}
	public void setNumOfCopies(int numOfCopies){
		this.numOfCopies=numOfCopies;
	}
	public void lendBook(String title){
		if(this.available) {
			this.available = false;
			System.out.println("Libro imprestato con successo");
		} else {
			System.out.println("Libro non disponibile per il prestito");
		}
	}
	public void returnBook(String title){
		this.available=true;
		System.out.println("Libro restituito con successo");
	}
	@Override
	public String toString(){
		return "Titolo: "+this.title+"\tAutore: "+this.author+"\tAnno di pubblicazione :"+this.yearOfRelease+"\tDisponibile: "+this.available;
	}
}
