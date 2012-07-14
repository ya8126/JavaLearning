package jp.itacademy.samples.api.io;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class SimpleEditor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		try(PrintWriter writer = new PrintWriter("c:/users/itacademy/output.txt")){
			while (in.hasNextLine()){
				writer.println(in.nextLine());
			}
		}catch (IOException e){
			System.out.println("ファイルを開けませんでした");
		}
	}

}
