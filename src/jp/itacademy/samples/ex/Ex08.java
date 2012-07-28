package jp.itacademy.samples.ex;

import java.util.Scanner;

public class Ex08 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		AddressMap addressMap = new AddressMap();
		String[] commandList = {"add", "list", "search","remove","save","restore"};
		Scanner scanner = new Scanner(System.in);
		String command, name, tel, email, path;
		int i;
		
		while(true){
			command = scanner.next();
			if (command.length()==0)
				break;
			
			for(i = 0; i < commandList.length && !command.equals(commandList[i]); i++);
			switch(i){
			case 0: //add
				name = scanner.next();
				tel = scanner.next();
				email = scanner.next();
				addressMap.Add(new Address(name, tel, email));
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
			case 4:	//save
				path = scanner.next();
				if (addressMap.save(path))
					System.out.println("•Û‘¶‚µ‚Ü‚µ‚½");
				else
					System.out.println("ƒtƒ@ƒCƒ‹–¼‚ªŒë‚Á‚Ä‚¢‚Ü‚·");
				break;
			case 5: //restore
				path = scanner.next();
				if (addressMap.restore(path))
					System.out.println("“Ç‚Ýž‚Ý‚Ü‚µ‚½");
				else
					System.out.println("ƒtƒ@ƒCƒ‹–¼‚ªŒë‚Á‚Ä‚¢‚Ü‚·");
				break;
			}
		}
	}

}
