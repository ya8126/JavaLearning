package jp.itacademy.samples.oop.ticket;

/**
 * 券売機を表すクラスです。お金を投入してチケットを購入することができます。
 * 購入したチケットは<code>Ticket</code>クラスのオブジェクトとして
 * 取得できます。
 * 
 * @author itacademy
 * @version 1.0
 *
 */
public class TicketMachine {
	private static int nextSerial = 1;

	public static int getNextSerial() {
		return nextSerial++;
	}

	private String ticketName;
	private int price;
	private int amount;

	/**
	 * この券売機で販売するチケットの名称と価格を指定して新しいインスタンスを生成します。
	 * @param ticketName
	 * @param price
	 */
	public TicketMachine(String ticketName, int price) {
		super();
		this.ticketName = ticketName;
		this.price = price;
	}

	/**
	 * お金を投入します。投入したお金は券売機の中に蓄積されます。
	 * 
	 * @param money　投入する金額
	 */
	public void putMoney(int money) {
		this.amount += money;
	}

	/**
	 * 現在券売機に入っているお金の合計を取得します
	 * 
	 * @return　券売機に入ってるお金
	 */
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
