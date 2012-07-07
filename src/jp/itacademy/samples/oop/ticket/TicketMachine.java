package jp.itacademy.samples.oop.ticket;

/**
 * �����@��\���N���X�ł��B�����𓊓����ă`�P�b�g���w�����邱�Ƃ��ł��܂��B
 * �w�������`�P�b�g��<code>Ticket</code>�N���X�̃I�u�W�F�N�g�Ƃ���
 * �擾�ł��܂��B
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
	 * ���̌����@�Ŕ̔�����`�P�b�g�̖��̂Ɖ��i���w�肵�ĐV�����C���X�^���X�𐶐����܂��B
	 * @param ticketName
	 * @param price
	 */
	public TicketMachine(String ticketName, int price) {
		super();
		this.ticketName = ticketName;
		this.price = price;
	}

	/**
	 * �����𓊓����܂��B�������������͌����@�̒��ɒ~�ς���܂��B
	 * 
	 * @param money�@����������z
	 */
	public void putMoney(int money) {
		this.amount += money;
	}

	/**
	 * ���݌����@�ɓ����Ă��邨���̍��v���擾���܂�
	 * 
	 * @return�@�����@�ɓ����Ă邨��
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
