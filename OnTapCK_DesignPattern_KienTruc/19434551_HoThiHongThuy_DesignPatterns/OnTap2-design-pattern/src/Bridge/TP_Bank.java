package Bridge;

public class TP_Bank implements Bank {


	@Override
	public void createAccount(String loai,String name, String STK, String mk, Bank bank) {
		System.out.println(loai+" Account created at TP Bank : \nName:"+name+"\nSTK:"+STK+"/"+mk+"\n");
		
	}
}