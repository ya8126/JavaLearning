package jp.itacademy.samples.oop.calc;

public class AddOperator implements Operator {

	@Override
	public String getName() {
		return "add";
	}

	@Override
	public int execute(int x, int y) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		return x + y;
	}

}
