package jp.itacademy.samples.ex;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex07 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[] englishList = {"apricot","avocado","banana", "cherry","durian","grape","green apple", "lime","mango","orange","papaya","peach","pineapple"};
		String[] japaneseList = {"杏","アボカド","バナナ","さくらんぼ","ドリアン","ぶどう","青りんご","ライム","マンゴー","オレンジ","パパイヤ","桃","パイナップル"};
		Map<String, String> dic = new HashMap<>();
		Scanner scanner = new Scanner(System.in);
		String eng, jpn;
		
		for(int i = 0; i<englishList.length; i++){
			dic.put(englishList[i], japaneseList[i]);
		}
		
		while(true){
			eng = scanner.nextLine();
			if (eng.length() == 0)
				break;
			jpn = dic.get(eng);
			if (jpn == null)
				jpn = "わかりません。ごめんなさい。";
			
			System.out.println(jpn);
		}
	}

}
