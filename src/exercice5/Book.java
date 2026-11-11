package exercice5;

public class Book {
	private String isbn;
	private String title;
	private String auteur;
	public Book(String isbn, String title, String auteur) {
		super();
		this.isbn = isbn;
		this.title = title;
		this.auteur = auteur;
	}
	public String getIsbn() {
		return isbn;
	}
	public String getTitle() {
		return title;
	}
	public String getAuteur() {
		return auteur;
	}
	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", title=" + title + ", auteur=" + auteur + "]";
	}
	
	
	

}
