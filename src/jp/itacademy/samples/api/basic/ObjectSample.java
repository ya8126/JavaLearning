package jp.itacademy.samples.api.basic;

import java.util.Scanner;

public class ObjectSample {

	public static void main(String[] args) {
		Object obj1 = new Object();
		System.out.println(obj1.getClass());
		System.out.println(obj1.toString());
		System.out.println(obj1.hashCode());

		Object obj2 = "中身は実はStringオブジェクト";
		System.out.println(obj2);
		System.out.println(obj2.getClass());
		System.out.println(obj2.toString());
		System.out.println(obj2.hashCode());

		Object obj3 = new Scanner(System.in);
		System.out.println(obj3);
		System.out.println(obj3.getClass());
		System.out.println(obj3.toString());
		System.out.println(obj3.hashCode());

	}

}
