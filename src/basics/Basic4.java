package basics;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Basic4 {
	@BeforeMethod
	public void beforemethod() {
		System.out.println("excute before every method");
	}

	@AfterClass
	public void afterclass() {
		System.out.println("after class is displayed");
	}

	@Test
	public void WebHomeLoan() {
		System.out.println("WebHomeLoan");
	}

	@Test(groups= {"Smoke"})
	public void MobileHomeLoan() {
		System.out.println("MobileHomeLoan");
	}

	@BeforeTest
	public void APIHomeLoan() {
		System.out.println("Before Test ");
	}

	@AfterMethod
	public void afertest() {
		System.out.println("i will execute after every test");
	}

	@BeforeClass
	public void beforeclass() {
		System.out.println("before class start i will be execeuted");
	}
}
