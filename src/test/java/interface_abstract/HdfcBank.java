package interface_abstract;

public class HdfcBank implements bank_interface{

	public void deposit()
	{
		System.out.println("HDFC Deposit");
	}
	public void withdraw()
	{
		System.out.println("HDFC Withdraw");
	}
}
