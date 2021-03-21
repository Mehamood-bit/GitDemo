package basics;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Basic1 {
	
	@Test(groups= {"Smoke"})
	public void Demo() {
		System.out.println("Helolo");
	}

	@AfterTest
	public void Demo2() {
		System.out.println("After  test annotations");
	}
}
