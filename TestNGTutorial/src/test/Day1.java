package test;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Day1 {
	
	@AfterSuite
	public void aSuite() {
		System.out.println("Last Test");
		//Hola Mundo de Git
		//Como vaa
		//Todo bien
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
