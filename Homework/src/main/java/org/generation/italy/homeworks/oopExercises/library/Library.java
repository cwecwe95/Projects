package org.generation.italy.homeworks.oopExercises.library;

import java.util.ArrayList;
import java.util.Scanner;

public class Library {
	// Esempio arraylist: Creazione di un ArrayList vuoto
	//ArrayList<String> lista = new ArrayList<>();
	private ArrayList<Book> bookList= new ArrayList<>();
	private ArrayList<User> userList= new ArrayList<>();
	private static Library instance=new Library();
	private Library(){}
	public static Library getInstance(){
		return instance;
	}
	public void addBookToLibrary(Book book){
		book.setNumOfCopies(book.getNumOfCopies()+1);
		bookList.add(book);
		book.setAvailable(true);
		
	}
	public Book findBook(String title){
		for(int i=0; i<bookList.size();i++){
			if(bookList.get(i).getTitle().equals(title)) return bookList.get(i);
		}
		System.out.println("Libro non registrato nella biblioteca");
		return null;
	}
	public void lendBook(String title,User user){
		Book book =findBook(title);
		if(book!=null){
			book.lendBook(title);
			user.addLentBook(title,instance);
		}
	}
	public void returnBook (String title, User user){
		Book book =findBook(title);
		if(book!=null && user.isBookLentToThisUser(book,user)){
			book.returnBook(title);
			user.returnLentBook(title,instance,user);
		} else {
			System.out.println("Libro non registrato nella biblioteca vuoi aggiungerlo al registro? y/n");
			Scanner scanner=new Scanner(System.in);
			String choice=scanner.nextLine();
			scanner.close();
			if(choice.equals("y") || choice.equals("Y")){
				bookList.add(createNewBookFromTitle(title));
			}
		}
	}
	public Book createNewBookFromTitle(String title){

		Book newBook=new Book(title);
		Scanner scanner=new Scanner(System.in);
		System.out.println("Conosci l'autore? y/n");
		if(scanner.nextLine().equals("y") || scanner.nextLine().equals("Y")) {
			System.out.print("Inserisci l'autore\n Author:");
			newBook.setAuthor(scanner.nextLine());
		}
		System.out.println("Conosci l'anno di rilascio? y/n");
		if(scanner.nextLine().equals("y") || scanner.nextLine().equals("Y")) {
			System.out.print("Inserisci l'anno\n Anno:");
			newBook.setYearOfRelease(scanner.nextInt());
		}
		newBook.setAvailable(true);
		newBook.setNumOfCopies(newBook.getNumOfCopies()+1);
		scanner.close();
		return newBook;
	}
	public void inputUserData(){
		Scanner scanner=new Scanner(System.in);
		System.out.println("Inserisci il nome dell'utente");
		String name= scanner.nextLine();
		System.out.println("Inserisci il cognome dell'utente");
		String surname= scanner.nextLine();
		addUser(name,surname);
	}
	public void addUserOfUserType(User newUser){
		if(userList.size()>0){
			newUser.setIdUser(userList.getLast().getIdUser()+1);
			userList.add(newUser);
		} else {
			newUser.setIdUser(0);
			userList.add(newUser);
		}
	}
	public void addUser(String name, String surname){
		if(userList.size()>0){
			User newUser=new User(name,surname, (userList.getLast().getIdUser())+1);
			userList.add(newUser);
		} else {
			User newUser=new User(name,surname, 0);
			userList.add(newUser);
		}
	}
	public void viewlibrary(){
		System.out.println("Libri disponibili:");
		for (Book book:bookList){
			if(book.getAvailable()){
				System.out.println(book);
			}
		}
		System.out.println("Libri in prestito:");
		for (Book book:bookList){
			if(!book.getAvailable()){
				System.out.println(book);
			}
		}
		System.out.println();
	}
	public void viewUsers(){
		for (User user:userList){
				System.out.println(user);
				user.viewBookList();
		}
		
	}
}

