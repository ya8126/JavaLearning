package jp.itacademy.samples.oop;

public class BookManager {

	public static void main(String[] args) {
		Book book = new Book("�ƏK�i������", "�I�j�[��", 3900);

		System.out.println(book.getTitle() + "(" + book.getAuthor() + ")" 
													+ book.getPrice()	+ "�~");
	}

}
