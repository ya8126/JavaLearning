package jp.itacademy.samples.exception;

import java.util.Scanner;

public class Nullpo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = null;
		String s = scanner.nextLine();
		System.out.println(s);
	}
}
