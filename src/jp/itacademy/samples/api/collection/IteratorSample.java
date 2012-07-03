package jp.itacademy.samples.api.collection;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorSample {


	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Alice");
		list.add("Bob");
		list.add("Chris");
		
		Iterator<String> itr = list.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}

}
