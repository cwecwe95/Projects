package org.generation.italy.homeworks.oopExercises.library;

public class Start {
	public static void main(String[] args) {
		Library library = Library.getInstance();
		
		// Aggiungi alcuni libri alla library
		Book book1 = new Book("Il Signore degli Anelli", "J.R.R. Tolkien", 1954);
		Book book2 = new Book("1984", "George Orwell", 1949);
		
		library.addBookToLibrary(book1);
		library.addBookToLibrary(book2);
		
	/*	//Esercizio biblioteca base
		// Cerca e stampa le informazioni di un Book
		Book bookToFind = library.findBook("Il Signore degli Anelli");
		System.out.println("Informazioni libro trovato:");
		System.out.println(bookToFind.toString());
		System.out.println();
		
		// Presta e restituisci un Book
		library.lendBook("Il Signore degli Anelli");
		System.out.println("Dopo il prestito:");
		System.out.println(bookToFind.toString());
		System.out.println();
		
		library.returnBook("Il Signore degli Anelli");
		System.out.println("Dopo la restituzione:");
		System.out.println(bookToFind.toString());
		System.out.println();
		
	*/
		//biblioteca avanzata
		
		//aggiunta utenti
		User user1 = new User("Mario", "Rossi", 0);
		User user2 = new User("Anna", "Verdi", 1);
		library.addUserOfUserType(user1);
		library.addUserOfUserType(user2);
		//library.inputUserData();
		library.addUser("Gigino","Bianchi");
		
		//mostra l'inventario
		library.viewlibrary();
		
		//presta un libro
		library.lendBook("Il Signore degli Anelli",user1);
		user1.viewBookList();
		library.viewUsers();
		library.viewlibrary();
		//restituisci un libro
		library.returnBook("Il Signore degli Anelli",user1);
		
		//Mostra lo stato degli utenti e degli inventari dopo le operazioni
		library.viewlibrary();
		library.viewUsers();
	}
}
