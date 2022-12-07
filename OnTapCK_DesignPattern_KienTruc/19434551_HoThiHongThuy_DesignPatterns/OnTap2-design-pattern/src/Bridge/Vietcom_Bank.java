package Bridge;

public class Vietcom_Bank implements Bank {

	@Override
	public void createAccount(String loai,String name, String STK, String mk, Bank bank) {
		System.out.println(loai+" Account created at Vietcom Bank : \nName:"+name+"\nSTK:"+STK+"/"+mk+"\n");
	}
}