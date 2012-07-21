package jp.itacademy.samples.ex;

import java.util.Scanner;

public class Ex08 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		AddressMap addressMap = new AddressMap();
		String[] commandList = {"add", "list", "search","remove"};
		Scanner scanner = new Scanner(System.in);
		String command, name, tel, email;
		int i;
		
		while(true){
			command = scanner.next();
			System.out.println(command);
			if (command.length()==0)
				break;
			
			for(i = 0; i < commandList.length && !command.equals(commandList[i]); i++);
			System.out.println(i);			
			switch(i){
			case 0: //add
				name = scanner.next();
				tel = scanner.next();
				email = scanner.next();
				addressMap.Add(new Address(name, tel, email));
				System.out.println("add");
				break;
			case 1: //list
				addressMap.list();
				break;
			case 2: //search
				name = scanner.next();
				Address w = addressMap.search(name);
				if (w == null)
					System.out.println("“o˜^‚³‚ê‚Ä‚¢‚Ü‚¹‚ñ");
				else
					System.out.println(w);
				break;
			case 3: //remove
				name = scanner.next();
				Address w2 = addressMap.remove(name);
				if (w2 == null)
					System.out.println("“o˜^‚³‚ê‚Ä‚¢‚Ü‚¹‚ñ");
				else
					System.out.println(w2.getName() + "‚ðíœ‚µ‚Ü‚µ‚½");
				break;
			}
		}
	}

}
