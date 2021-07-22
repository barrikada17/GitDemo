package test;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Day1 {
	
	@AfterSuite
	public void aSuite() {
		System.out.println("Last Test");
		System.out.println("Last Test2");
		System.out.println("Last Test3");
	}
	
	
	@AfterTest
	public void lastExecution() {
		System.out.println("I will execute last");
	}

	@Test
	public void demo() {
		System.out.println("Hello");
		Assert.assertTrue(false);
	}
	
	@Test
	public void demo2() {
		System.out.println("Bye");
	}
}
