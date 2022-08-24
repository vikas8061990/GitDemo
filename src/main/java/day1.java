

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day1 {

	@Test(dataProvider = "demo4")
	void demo(String uname, String pword) {
		System.out.println("The user name is " + uname);
		System.out.println("The password name is " + pword);
	}

	@Test(groups = { "group1", "group2" })
	void demo2() {
		System.out.println("This is demo2 method");
	}

	// @Parameters("URL")
	@Test
	void demo3() {
		System.out.println("The URL of application is ");
		System.out.println("This is demo2 method");
	}

	@DataProvider
	@Test
	Object[][] demo4() {
		System.out.println("This is demo2 method");
		Object[][] data = new Object[3][2];

		data[0][0] = "username1";
		data[0][1] = "password1";

		data[1][0] = "username2";
		data[1][1] = "password2";

		data[2][0] = "username3";
		data[2][1] = "password3";

		return data;

	}
	@Test
	void demo6() {
		System.out.println("The URL of application is ");
		System.out.println("This is demo2 method");
	}

	@Test
	void demo5() {
		System.out.println("The URL of application is ");
		System.out.println("This is demo2 method");
	}

}
