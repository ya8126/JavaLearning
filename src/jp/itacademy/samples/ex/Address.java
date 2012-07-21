package jp.itacademy.samples.ex;

public class Address {
	private String name, tel, email;

	public Address(String name, String tel, String email) {
		this.name = name;
		this.tel = tel;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public String getTel() {
		return tel;
	}

	public String getEmail() {
		return email;
	}

	public String toString() {
		return name + "  " + tel + "  " + email;
	}

}
