package jp.itacademy.samples.oop;

import jp.itacademy.samples.oop.car.*;

public class Drive {

	public static void main(String[] args) {
		
		Car car1 = new Car("くるま");
		car1.addGas(4);
		car1.drive();
		
		Car car2 = new Truck("とらっく");
		car2.addGas(4);
		car2.drive();

	}

}
