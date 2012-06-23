package jp.itacademy.samples.oop.calc;

public class Calculator {

	public static void main(String[] args) {
	
		Operator[] operators = {	new AddOperator(), new SubtractOperator()};
		
		Calculator c = new Calculator();
		c.installOperators(operators);
		System.out.println(c.calc("add", 33, 14));
		System.out.println(c.calc("subtract", 33, 14));
	}

	private Operator[] operators;
	
	public void installOperators(Operator[] operators){
		this.operators = operators;
	}
	
	public int calc(String operatorName, int x, int y){
		for (Operator op : operators){
			if (op.getName().equals(operatorName)){
				return op.execute(x, y);
			}
		}
		System.err.println(operatorName + "‚ª‚Ý‚Â‚©‚è‚Ü‚¹‚ñ");
		return 0;
	}
}
