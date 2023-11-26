package org.generation.italy.homeworks.oopExercises.library;

import java.util.ArrayList;
import org.generation.italy.homeworks.oopExercises.library.Library;

public class User {
	private String name;
	private String surname;
	private int idUser;
	private ArrayList<Book> lentBookList=new ArrayList<>();
	
	public User(String name, String surname,int idUser){
		this.name=name;
		this.surname=surname;
		this.idUser=idUser;
	}
	public User(String name, String surname,int idUser, ArrayList<Book> lentBookList){
		this.name=name;
		this.surname=surname;
		this.idUser=idUser;
		this.lentBookList=lentBookList;
	}
	
	public String getName(){
		return this.name;
	}
	public void setName(String name){
		this.name=name;
	}
	public String getSurname(){
		return this.surname;
	}
	public void setSurname(String surname){
		this.surname=surname;
	}
	public int getIdUser(){
		return this.idUser;
	}
	public void setIdUser(int idUser){
		this.idUser=idUser;
	}
	public ArrayList<Book> getLentBookList(){
		return this.lentBookList;
	}
	public void addLentBook(String title,Library library){
		Book book=library.findBook(title);
		if(book!=null) {
			this.lentBookList.add(book);
			System.out.println("All'utente "+ this.idUser);
		}
	}
	public void returnLentBook(String title,Library library,User user){
		boolean wasLentToThisUser = false;
		for(int i=0; i<user.lentBookList.size();i++){
			if(user.lentBookList.get(i).getTitle().equals(title)){
				user.lentBookList.remove(i);
				wasLentToThisUser=true;
				break;
			}
		}
		if(!wasLentToThisUser) System.out.println("Libro non prestato a questo utente. Possibile infrazione (o donazione)");
	}
	public boolean isBookLentToThisUser(Book book, User user){
		for (Book b:user.lentBookList) {
			if(book.getTitle().equals(b.getTitle())) return true;
		}
		return false;
	}
	@Override
	public String toString(){
		return "Nome: "+this.name+"\tCognome: "+this.surname+"\tId:"+this.idUser;
	}
	
	public void viewBookList(){
		for(Book book:this.lentBookList)
			System.out.println(book);
	}
}
