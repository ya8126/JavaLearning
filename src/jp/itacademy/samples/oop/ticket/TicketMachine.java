package jp.itacademy.samples.oop.ticket;

public class TicketMachine {
	private static int nextSerial = 1;

	public static int getNextSerial() {
		return nextSerial++;
	}

	private String ticketName;
	private int price;
	private int amount;

	public TicketMachine(String ticketName, int price) {
		super();
		this.ticketName = ticketName;
		this.price = price;
	}

	public void putMoney(int money) {
		this.amount += money;
	}

	public int getAmount() {
		return amount;
	}

	public int getChange() {
		int change = amount;
		amount = 0;
		return change;
	}

	public Ticket getTicket() {
		if (amount < price) {
			return null;
		}
		amount -= price;
		return new Ticket(getNextSerial(), ticketName);
	}

}
