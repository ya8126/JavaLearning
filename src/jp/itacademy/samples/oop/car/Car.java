package jp.itacademy.samples.oop.car;

public class Car {
	private int gas;
	private String name;
	
	public Car(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}


	public void addGas(int gas) {
		this.gas += gas;
	}

	
	public void drive() {
		int km = gas * getFuelCost();
		
		System.out.print(getName() + ": ");
		for (int i = 0; i < km; i++) {
			System.out.print(getWheelRuts());
		}
		System.out.println();
		
		gas = 0;
	}

	public int getFuelCost() {
		return 20;
	}

	protected char getWheelRuts() {
		return ':';
	}
	
}
