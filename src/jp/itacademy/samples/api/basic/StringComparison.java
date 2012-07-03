package jp.itacademy.samples.api.basic;

public class StringComparison {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s1 = "hoge";
		String s2 = "hoge";
		String s3 = "ho"+"ge";

		String ho = "ho";
		String ge = "ge";
		String s4 = ho + ge;

		System.out.println("==演算子");
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		System.out.println(s1 == s4);
		
		System.out.println("equalsメソッド");	
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));
	}
}
