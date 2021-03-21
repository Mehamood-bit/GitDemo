package basics;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Basic3 {
	
	@AfterSuite
	public void aftersuite() {
		System.out.println("i will execeute at the end of the suite");
	}
	@Test(groups= {"Smoke"})
	public void WebCarLoan() {
		System.out.println("WebCarLoan");
	}
	@Parameters({"URL"})
	@Test
	public void high(String urlname) {
		System.out.println("high in  the sky");
		System.out.println(urlname);
	}
@Test(dependsOnMethods= {"high"})
public void MobileCarLoan() {
	System.out.println("MobileCarLoan");
}

@Test(groups= {"Smoke"})
public void APICarLoan() {
	System.out.println("APICarLoan");
}

@Test(enabled=false)
public void fish() {
	System.out.println("i must be skipped");
}

@BeforeSuite
public void beforetest() {
	System.out.println("i will execute at the beginning of the suite");
	
}
		
}
