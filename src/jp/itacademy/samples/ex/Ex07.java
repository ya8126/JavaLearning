package jp.itacademy.samples.ex;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex07 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Map<String, String> dic = new HashMap<>();
		String eng, jpn;

		try (Scanner scanner = new Scanner(new File(
				"c:/Users/itacademy/dic.txt"))) {
			while (scanner.hasNextLine()) {
				String[] w = scanner.nextLine().split(":");
				dic.put(w[0], w[1]);
			}
		} catch (IOException e) {
			System.out.println("辞書ファイルを開けませんでした");
			System.exit(1);
		}
		
		Scanner scanner = new Scanner(System.in);
		while (true) {
			eng = scanner.nextLine();
			if (eng.length() == 0)
				break;
			jpn = dic.get(eng);
			if (jpn == null)
				jpn = "わかりません。ごめんなさい。";

			System.out.println(jpn + "!");
		}
	}

}
