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
					System.out.println("�����Ƒ傫���ł�");
				else
					System.out.println("�����Ə������ł�");
		}
		System.out.println("����!�@"+ i +"��ڂŐ������܂���");
	}

}
