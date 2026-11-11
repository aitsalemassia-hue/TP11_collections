package exercice5;

public class Main {
	public static void main(String[] args) {

		// Créer une bibliothèque
		Library lib = new Library();

		// Créer des livres
		Book b1 = new Book("978-2123456803", "Java Avancé", "Auteur A");
		Book b2 = new Book("978-2123456804", "Python Débutant", "Auteur B");
		Book b3 = new Book("978-2123456805", "Programmation C++", "Auteur C");

		// Ajouter les livres à la bibliothèque
		lib.addBookIndexed(b1);
		lib.addBookIndexed(b2);
		lib.addBookIndexed(b3);

		// affichage des livres

		for (Book b : lib.getBooks()) {
			System.out.println(b);
		}

		// Ajouter des catégories
		lib.addCategorie("Informatique");
		lib.addCategorie("Programmation");

		// Emprunter un livre
		System.out.println("\nEMPRUNT ");

		if (lib.borrowBook(b1, "Assiya")) {
			System.out.println("Assiya a emprunte le livre .");
		} else {
			System.out.println("livre deja emprunte");
		}

		// Rechercher un livre par ISBN
		System.out.println("\n RECHERCHE PAR ISBN");

		System.out.println("Livre trouvé : " + lib.findByIsbn("978-2123456803"));

		// Tester un ISBN inexistant
		System.out.println("\nRECHERCHE INEXISTANTE");

		System.out.println("Résultat : " + lib.findByIsbn("0000000000"));

		// Tester un deuxième emprunt du même livre
		System.out.println("\n DEUXIEME EMPRUNT ");

		if (lib.borrowBook(b1, "Salma")) {
			System.out.println("Salma a emprunte le livre .");
		} else {
			System.out.println("livre deja emprunte");
		}
		// retourner un livre
		System.out.println("\nRETOUR DU LIVRE ");
		lib.returnBook(b1);
		System.out.println("Le livre a été retourné.");
		// Tester un deuxième emprunt du même livre apres le retour
		if (lib.borrowBook(b1, "Salma")) {
			System.out.println("Salma a emprunte le livre .");
		} else {
			System.out.println("livre deja emprunte");
		}
	}
}
