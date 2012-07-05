package jp.itacademy.samples.api.collection;

import java.util.Iterator;

public class MyGenericListSample2{

	public static void main(String[] args) {
		MyGenericArrayList<String> list = new MyGenericArrayList<>();
		list.add("hoge");
		list.add("huga");
		list.add("piyo");
		list.add("hogehoge");
		list.add("hugahuga");
		list.add("piyopiyo");
		list.add("hogepiyo");
		arrayPrint(list);

		Iterator<String> itr = list.iterator();
		
		System.out.println("remove 2");
		itr.next();
		itr.next();
		itr.next();
		itr.remove();
		arrayPrint(list);
		System.out.println("next");		
		System.out.println(itr.next());
		System.out.println("remove 2");
		itr.remove();
		arrayPrint(list);
		System.out.println("no remove");
		itr.remove();
		arrayPrint(list);

				
	}

	static void arrayPrint(MyGenericArrayList<String> list){
		for (String s : list){
			System.out.println(s);
		}
	}

}
