package jp.itacademy.samples.api.collection;

public class MyListSample {

	public static void main(String[] args) {
		MyStringArrayList list = new MyStringArrayList();
		list.add("hoge");
		list.add("huga");
		list.add("piyo");
		list.add("hogehoge");
		list.add("hugahuga");
		list.add("piyopiyo");
		list.add("hogepiyo");
		arrayPrint(list);

		System.out.println("remove 6");
		list.remove(6);
		arrayPrint(list);
		System.out.println("remove 3");
		list.remove(3);
		arrayPrint(list);
		System.out.println("remove 0");
		list.remove(0);
		arrayPrint(list);
	}
	
	static void arrayPrint(MyStringArrayList list){
		for(int i = 0; i<list.size(); i++){
			System.out.println("[" + i + "]" + list.get(i));
		}		
	}

}
