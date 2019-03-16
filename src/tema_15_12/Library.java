package tema_15_12;

public interface Library {

	void addBook(Book book);

	boolean deleteBooksByName(String bookName);

	Book findByName(String bookName);

	void printAllBook();
}
