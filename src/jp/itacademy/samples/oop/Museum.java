package jp.itacademy.samples.oop;

import jp.itacademy.samples.oop.ticket.*;

public class Museum {

	public static void main(String[] args) {
		TicketMachine m1 = new TicketMachine("�ق������ف@��ݓW", 500);
		TicketMachine m2 = new TicketMachine("�ق������ف@��ݓW", 500);
		TicketMachine m3 = new TicketMachine("�ق������ف@���ʓW", 800);

		m1.putMoney(1000);
		Ticket ticket1 = m1.getTicket();
		System.out.println(ticket1);
		System.out.println("���ނ�F�@" + m1.getChange());

		m2.putMoney(400);
		Ticket ticket2 = m2.getTicket();
		System.out.println(ticket2);
		System.out.println("���ނ�F�@" + m2.getChange());
		
		m3.putMoney(800);
		Ticket ticket3 = m3.getTicket();
		System.out.println(ticket3);
		System.out.println("���ނ�F�@" + m3.getChange());
	}

}
