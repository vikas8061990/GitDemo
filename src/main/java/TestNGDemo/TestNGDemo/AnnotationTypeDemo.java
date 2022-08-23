package TestNGDemo.TestNGDemo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationTypeDemo {

	@Test
	void test1() {
		System.out.println("I am under Test Annotation");
	}

	@Test
	void test2() {
		System.out.println("I am under Test Annotation 2");
	}

	@Test
	void test3() {
		System.out.println("I am under Test Annotation 3");
	}

	@BeforeTest
	void beforeTest() {
		System.out.println("I am under before test annotation");
	}

	@AfterTest
	void afterTest() {
		System.out.println("I am under after test annotation");
	}
	
	@BeforeSuite
	void beforeSuite()
	{
		System.out.println("I am under before suite annotation");
	}
	
	@AfterSuite
	void afterSuite()
	{
		System.out.println("I am under after suite annotation");
	}
	
	@BeforeMethod
	void beforeMethod()
	{
		System.out.println("I am under before method annotation");
	}
	
	@AfterMethod
	void afterMethod()
	{
		System.out.println("I am under after method annotation");
	}
	@BeforeClass
	void beforeClass()
	{
		System.out.println("I am under before class annotation");
	}
	
	@AfterClass
	void afterClass()
	{
		System.out.println("I am under after class annotation");
	}
}
