package Bridge;

public class CheckingAccount extends Account {
	private String name,  STK,  mk;
	public CheckingAccount(String name, String STK, String mk, Bank bank) {
		super(bank);
		this.name = name;
		this.STK = STK;
		this.mk = mk;
	}

	public void getInfo() {
		bank.createAccount("Checking",name,  STK,  mk, bank);
	}
}