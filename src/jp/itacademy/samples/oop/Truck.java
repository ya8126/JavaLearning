package jp.itacademy.samples.oop;

import jp.itacademy.samples.oop.car.*;

public class Truck extends Car {
	
	public Truck(String name) {
		super(name);
	}

	public int getFuelCost() {
		return 5;
	}

	protected char getWheelRuts() {
		return 'ƒ°';
	}
}
