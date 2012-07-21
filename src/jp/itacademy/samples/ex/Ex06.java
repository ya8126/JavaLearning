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
					System.out.println("‚à‚Á‚Æ‘å‚«‚¢‚Å‚·");
				else
					System.out.println("‚à‚Á‚Æ¬‚³‚¢‚Å‚·");
		}
		System.out.println("³‰ð!@"+ i +"‰ñ–Ú‚Å³‰ð‚µ‚Ü‚µ‚½");
	}

}
