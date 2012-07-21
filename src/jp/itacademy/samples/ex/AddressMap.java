package jp.itacademy.samples.ex;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

public class AddressMap {
	private Map<String, Address> addressMap = new HashMap<>();

	public void Add(Address address) {
		addressMap.put(address.getName(), address);
	}

	public Address search(String name) {
		return addressMap.get(name);
	}

	public Address remove(String name) {
		return addressMap.remove(name);
	}

	public void list() {
		for (Map.Entry<String, Address> e : addressMap.entrySet()) {
			System.out.println(e.getValue());
		}
	}
	
	public void save(String path){
		try (PrintWriter writer = new PrintWriter(path)){
			for (Map.Entry<String, Address> e : addressMap.entrySet()) {
				writer.println(e.getValue().getName());
				writer.println(e.getValue().getTel());				
				writer.println(e.getValue().getEmail());
			}
		}catch(IOException e){
			System.out.println("file cannot open");
		}
	}
}
