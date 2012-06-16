package jp.itacademy.samples.oop;

import jp.itacademy.samples.oop.ticket.*;

public class Museum {

	public static void main(String[] args) {
		TicketMachine m1 = new TicketMachine("ほげ博物館　常設展", 500);
		TicketMachine m2 = new TicketMachine("ほげ博物館　常設展", 500);
		TicketMachine m3 = new TicketMachine("ほげ博物館　特別展", 800);

		m1.putMoney(1000);
		Ticket ticket1 = m1.getTicket();
		System.out.println(ticket1);
		System.out.println("お釣り：　" + m1.getChange());

		m2.putMoney(400);
		Ticket ticket2 = m2.getTicket();
		System.out.println(ticket2);
		System.out.println("お釣り：　" + m2.getChange());
		
		m3.putMoney(800);
		Ticket ticket3 = m3.getTicket();
		System.out.println(ticket3);
		System.out.println("お釣り：　" + m3.getChange());
	}

}
