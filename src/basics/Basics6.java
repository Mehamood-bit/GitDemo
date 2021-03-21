package basics;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Basics6 {
	@Test
	public void Demo1() {
		System.out.println("Method 1");
	}

	@Test
	public void Demo2() {
		System.out.println("Method 1");
	}
	@Test
	public void Demo3() {
		System.out.println("Method 1");
	}
	@Test
	public void Demo4() {
		System.out.println("Method 1");
		Assert.assertTrue(false);
	}
}
