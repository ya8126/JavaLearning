package jp.itacademy.samples.api.concurrent;

public class Seat {
	private String userName;
	private String userSgin;
	
	public void hold (String userName){
		this.userName = userName;
		this.userSgin = userName;
		checkSign();
		System.out.println(this.userName+"���񂪍����Ă��܂�");
	}
	public void checkSign() {
		if (userName.charAt(0)!= userSgin.charAt(0)){
			System.err.println("�T�C���Ɩ��O���Ⴂ�܂����D�D�D  name:" + userName + " sign:" + userSgin);
			System.exit(-1);
		}
	}

}
