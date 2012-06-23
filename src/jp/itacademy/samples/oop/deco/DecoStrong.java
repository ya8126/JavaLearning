package jp.itacademy.samples.oop.deco;

public class DecoStrong extends DecoratedString {

	public DecoStrong(String str) {
		super(str);
	}

	@Override
	protected String decorate(String str) {
		return "<strong>" + str + "</strong>";
	}

}
