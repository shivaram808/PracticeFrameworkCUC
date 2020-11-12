package interface_abstract;

public class SbiBank implements bank_interface{

	public void deposit()
	{
		System.out.println("SBI Deposit");
	}
	public void withdraw()
	{
		System.out.println("SBI Withdraw");
	}
}
