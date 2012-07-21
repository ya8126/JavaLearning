package jp.itacademy.samples.ex;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Ex04 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LinkedList<Integer> num = new LinkedList<>();
		List<Integer> sosu = new ArrayList<>();
		for (int i = 2; i <= 100; num.add(i++))
			;

/*		while (true) {
			int x = num.get(0);
			sosu.add(x);
			num.remove(0);
			int y = num.getLast();
			for (int j = x * 2; j <= y; j += x) {
				num.remove((Integer) j);
			}
			if (num.getLast() < x * x)
				break;
		}
		for (Integer i : sosu) {
			System.out.print(i + " ");
		}
		for (Integer i : num) {
			System.out.print(i + " ");
		}
		System.out.println();
*/
		for (int i = 0;; i++) {
			int x = num.get(i);
			int y = num.getLast();
			for (int j = x * 2; j <= y; j += x) {
				num.remove((Integer) j);
			}
			if (num.getLast() < x * x)
				break;
		}

		for (Integer i : num) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

}
