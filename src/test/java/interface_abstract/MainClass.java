package interface_abstract;

public class MainClass extends Bank_AbstractClass{
	
	public static void main(String[] args) {

	
	SbiBank sbi = new SbiBank();
	sbi.deposit();
	sbi.withdraw();
	
	HdfcBank hdfc = new HdfcBank();
	
	hdfc.deposit();
	hdfc.withdraw();
	
	MainClass obj = new MainClass();
	
	obj.deposit();
	obj.withdraw();
	obj.abstractmethod1();
	
	}


	public void deposit() {

		System.out.println("This is abstract method deposit");
	}

	@Override
	public void withdraw() {
	
		System.out.println("This is abstract method withdraw");
	}

	@Override
	void abstractmethod1() {
	
		System.out.println("Implementing the abstract mentod from abstract class");
	}	
}
