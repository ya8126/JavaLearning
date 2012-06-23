package jp.itacademy.samples.oop.calc;

public class SubtractOperator implements Operator {

	@Override
	public String getName() {
		return "subtract";
	}

	@Override
	public int execute(int x, int y) {
		return x - y;
	}

}
