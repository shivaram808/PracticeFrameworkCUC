package stepDefinition;



import TestBase.BaseClass;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class hooks extends BaseClass{
	

	@Before
	public void beforehook() throws Exception
		{
			System.out.println("Before hook has been trigerred!!");
			
			BaseClass.InitializeDriver();
		}
	
	@After
	public void Afterhook()
	{
		System.out.println("After hook has been trigerred!!");
		
		BaseClass.driver.quit();
		
		System.out.println("Browser is closed....");
	}

	
}
