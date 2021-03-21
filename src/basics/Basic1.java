package basics;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Basic1 {
	
	@Test(groups= {"Smoke"})
	public void Demo() {
		System.out.println("Helolo");
		System.out.println("John Cena");
		System.out.println("Brock lesner");
	}

	@AfterTest
	public void Demo2() {
		System.out.println("After  test annotations");
	}

	@Test(groups= {"Smoke"})
	public void Demo1() {
		System.out.println("Heloioiuolo");
		System.out.println("iuoio Cena");
		System.out.println("Brock uioiuouo");
	}


}
