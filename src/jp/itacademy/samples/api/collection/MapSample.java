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
		
		Book book = new Book("本1", "著者A", 1200);
		books.put(book.getTitle(), book);
		book = new Book("本2", "著者B", 1200);
		books.put(book.getTitle(), book);
		book = new Book("本3", "著者C", 1200);
		books.put(book.getTitle(), book);
		book = books.get("本2");				
		System.out.println(book.getAuthor());
		
	}

}
