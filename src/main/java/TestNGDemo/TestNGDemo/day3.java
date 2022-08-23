package TestNGDemo.TestNGDemo;

import org.testng.annotations.Test;

public class day3 {

	@Test(groups = {"Smoke"})
	void  WebLoginHomeLoan()
	{
		//coding for weblogin
		System.out.println("This is for Web Login");
	}
	
	@Test(groups = {"Smoke"})
	void  MobileLoginHomeLoan()
	{
		System.out.println("This is for Mobile Login");
	}
	
	@Test(groups = {"Sanity","Smoke","Regression"})
	void APILoginHomeLoan()
	{
		System.out.println("This is for API Login");
	}
}
