package jp.itacademy.samples.ex;

import java.util.Scanner;

public class Ex06 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int i, toi, ans;
		Scanner scanner = new Scanner(System.in);
		
		toi =(int)(Math.random() * 100 + 1);
		
		for(i = 1; ; i++){
			ans = scanner.nextInt();
			if (ans == toi)
				break;
			else
				if (ans < toi)
					System.out.println("もっと大きいです");
				else
					System.out.println("もっと小さいです");
		}
		System.out.println("正解!　"+ i +"回目で正解しました");
	}

}
