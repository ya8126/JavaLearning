package jp.itacademy.samples.ex;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Scanner;

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

	public boolean save(String path) {
		try (PrintWriter writer = new PrintWriter(path)) {
			for (Map.Entry<String, Address> e : addressMap.entrySet()) {
				writer.println(e.getValue().getName() + " "
						+ e.getValue().getTel() + " " + e.getValue().getEmail());
			}
			return true;
		} catch (IOException e) {
			System.out.println("file cannot open" + e);
			return false;
		}
	}
	
	public boolean restore(String path){
		try (Scanner scanner = new Scanner(new File(path))){
			addressMap = new HashMap<>();
			while (scanner.hasNext()){
				String name = scanner.next();
				
				addressMap.put(name, new Address(name, scanner.next(), scanner.next()));
			}
			return true;
//		}catch(IOException e){
//			System.out.println("file not found");
//			return false;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			return false;
		} catch (NoSuchElementException e) {
			e.printStackTrace();
			return false;
		}
	}

}
