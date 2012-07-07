package jp.itacademy.samples.api.collection;

import java.util.HashMap;
import java.util.Map;

import jp.itacademy.samples.oop.Book;

public class MapSample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Map<String, Book> books = new HashMap<>();
		
		Book book = new Book("�{1", "����A", 1200);
		books.put(book.getTitle(), book);
		book = new Book("�{2", "����B", 1200);
		books.put(book.getTitle(), book);
		book = new Book("�{3", "����C", 1200);
		books.put(book.getTitle(), book);
		book = books.get("�{2");				
		System.out.println(book.getAuthor());
		
	}

}
