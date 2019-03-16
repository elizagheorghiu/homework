package tema_15_12;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LibraryCatalogue implements Library {

	private Scanner sc;

	List<Book> bookList = new ArrayList<>();

	String bookName;

	@SuppressWarnings("unused")
	public void addBook(Book book) {
		Novel b = new Novel("Capcaun", 157, "Kids");
		Novel n = new Novel("Balaur", 156, "Police");
		ArtAlbum a = new ArtAlbum("Picasso", 259, "High Quality");
		ArtAlbum ba = new ArtAlbum("Frunzele", 987, "Natura");
		Novel na = new Novel("Zori de zi", 412, "Documentary");
		ArtAlbum aa = new ArtAlbum("Rembrandt", 400, "Medium Quality");
		ArtAlbum bb = new ArtAlbum("Legendele Olimpului", 212, "Low Quality");
		Novel nb = new Novel("Babel", 187, "Istorie");
		ArtAlbum ab = new ArtAlbum("Frida Khalo", 670, "High Quality");
		ArtAlbum ac = new ArtAlbum("Dali", 290, "High Quality");
		Novel bc = new Novel("Dupa ploaie vreme buna", 15, "Poezie");
		Novel nc = new Novel("Iarna pe ulita", 323, "Police");

		bookList.add(book);
		System.out.print(bookList);
	}

	public List<Book> getBookList() {
		return bookList;
	}

	public void setBookList(List<Book> bookList) {
		this.bookList = bookList;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	@Override
	public boolean deleteBooksByName(String bookName) {
		sc = new Scanner(System.in);
		this.bookName = sc.nextLine();

		if (bookList.contains(bookName)) {
			bookList.remove(bookName);
			System.out.print(bookList);
			System.out.println("the book having the title: " + bookName + "was removed");
		}
		System.out.println(
				"We cannot delete the book with the title: " + bookName + "because it doesn't appear in our data base");
		return false;
	}

	@Override
	public Book findByName(String bookName) {
		sc = new Scanner(System.in);
		this.bookName = sc.nextLine();
		if (bookList.contains(bookName)) {
			System.out.println("the book having the title: " + bookName + "is in our library");
		}
		System.out.println("We are sorry. the book having the title: " + bookName + "is not in our library");
		return null;
	}

	@Override
	public void printAllBook() {
		System.out.println(bookList);

	}

}
