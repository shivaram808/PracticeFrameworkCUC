package interface_abstract;

// Implementing an interface in abstract class
abstract class Bank_AbstractClass implements bank_interface{

	abstract void  abstractmethod1();
	
	public void concretemetod()
	{
		System.out.println("This is my concrete method in abstract class");
	}
}
