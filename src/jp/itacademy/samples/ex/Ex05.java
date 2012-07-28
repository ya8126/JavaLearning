package jp.itacademy.samples.ex;

import java.util.Scanner;

public class Ex05 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int i, num = scanner.nextInt();

		for (i = 1; i <= num; i *= 10);
		for (i /= 10; i > 0; i /= 10) {
			System.out.print("<img src=\"img/" + num / i + ".gif\">");
			num %= i;
		}

	}

}
