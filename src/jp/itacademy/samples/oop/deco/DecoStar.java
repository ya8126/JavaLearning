package jp.itacademy.samples.oop.deco;

public class DecoStar extends DecoratedString {

	public DecoStar(String str) {
		super(str);
	}

	@Override
	protected String decorate(String str) {
		return "š " + str + "š ";
	}

}
