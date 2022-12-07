package Bridge;

public class SavingAccount extends Account {
	private String name,  STK,  mk;
	public SavingAccount(String name, String STK, String mk, Bank bank) {
		super(bank);
		this.name = name;
		this.STK = STK;
		this.mk = mk;
	}

	public void getInfo() {
		bank.createAccount("Saving Account",name,  STK,  mk, bank);
	}
}