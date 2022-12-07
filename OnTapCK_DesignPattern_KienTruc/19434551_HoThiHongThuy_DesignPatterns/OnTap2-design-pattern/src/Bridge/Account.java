package Bridge;

public abstract class Account {
	protected Bank bank;

	protected Account(Bank bank) {
		this.bank = bank;
	}

	public abstract void getInfo();
}