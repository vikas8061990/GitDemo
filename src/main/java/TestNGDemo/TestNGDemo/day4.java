package TestNGDemo.TestNGDemo;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.annotations.Test;

public class day4 {

	@Test(priority=1)
	void  WebLoginPersonalLoan()
	{
		//coding for weblogin
		System.out.println("This is for Web Login for Personal");
	}
	
	@Test(priority=-2)
	void  MobileLoginPersonalLoan()
	{
		System.out.println("This is for Mobile Login for Personal");
		
	}
	
	@Test(dependsOnMethods= {"MobileLoginPersonalLoan","MobileLoginPersonalLoan2"})
	void  MobileLoginPersonalLoan1()
	{
		System.out.println("This is for Mobile Login for Persona one");
	}
	
	@Test
	void  MobileLoginPersonalLoan2()
	{
		System.out.println("This is for Mobile Login for Persona two");
	}
	
	@Test(groups = {"Smoke"})
	void  MobileLoginPersonalLoan3()
	{
		System.out.println("This is for Mobile Login for Persona three");
	}
	
	@Test(priority=-1,timeOut=4000)
	void APILoginPersonalLoan()
	{
		System.out.println("This is for API Login for Personal");
		//Assert.fail();
	}
	@Test(enabled=false)
	void APILoginPersonalLoan2()
	{
		System.out.println("This is for API Login for Personal one");
		//Assert.fail();
	}
	@Test(priority=-1,enabled=false)
	void APILoginPersonalLoan3()
	{
		System.out.println("This is for API Login for Personal two");
		//Assert.fail();
	}
	@Test(priority=-1)
	void APILoginPersonalLoan4()
	{
		System.out.println("This is for API Login for Personal three");
		Assert.assertTrue(false);
		//Assert.fail();
	}
	
}
