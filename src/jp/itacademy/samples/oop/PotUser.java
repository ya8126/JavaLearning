package jp.itacademy.samples.oop;

import jp.itacademy.samples.oop.pot.Pot;

public class PotUser {

	public static void main(String[] args) {
		
		Pot pot = new Pot();
		pot.addWater(1.25);
		pot.addWater(0.5);
		
		System.out.println("åªç›ÇÃêÖó ÅF " + pot.getQuantity());

	}

}
