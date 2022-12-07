package Bridge;

public class MainDemo {
	public static void main(String[] args) {
		Account ac1 = new CheckingAccount("Nguyen Pham C. Nhat", "1365466879464", "123", new TP_Bank());
		Account ac2 = new CheckingAccount("Vo Phuoc Luu", "12342635461523", "123", new TP_Bank());
		
		Account sac1 = new SavingAccount("Nguyen Pham C. Nhat", "1365466879464", "123", new Vietcom_Bank());
		Account sac2 = new SavingAccount("Vo Phuoc Luu", "12342635461523", "123", new Vietcom_Bank());
		
		ac1.getInfo();
		ac2.getInfo();
		sac1.getInfo();
		sac2.getInfo();
	}
}
