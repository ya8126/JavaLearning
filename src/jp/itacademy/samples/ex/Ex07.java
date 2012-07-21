package jp.itacademy.samples.ex;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex07 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[] englishList = {"apricot","avocado","banana", "cherry","durian","grape","green apple", "lime","mango","orange","papaya","peach","pineapple"};
		String[] japaneseList = {"��","�A�{�J�h","�o�i�i","��������","�h���A��","�Ԃǂ�","���","���C��","�}���S�[","�I�����W","�p�p�C��","��","�p�C�i�b�v��"};
		Map<String, String> dic = new HashMap<>();
		Scanner scanner = new Scanner(System.in);
		String eng, jpn;
		
		for(int i = 0; i<englishList.length; i++){
			dic.put(englishList[i], japaneseList[i]);
		}
		
		while(true){
			eng = scanner.nextLine();
			if (eng.length() == 0)
				break;
			jpn = dic.get(eng);
			if (jpn == null)
				jpn = "�킩��܂���B���߂�Ȃ����B";
			
			System.out.println(jpn);
		}
	}

}
