package jp.itacademy.samples.oop.deco;

public class Main {

	public static void main(String[] args) {

		DecoratedString deco = new DecoStar("Hello world");
		deco.show();

		deco = new DecoStrong("Hello world");
		deco.show();

	}

}
