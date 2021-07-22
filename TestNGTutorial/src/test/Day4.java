package test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day4 {
	
	@Parameters({"URL"})
	@Test
	public void webLoginHomeLoan(String url) {
		//selenium
		System.out.println("webloginHomeloan");
		System.out.println(url);
	}
	
	@Test(groups= {"Smoke"})
	public void mobileLoginHomeLoan() {
		//appium
		System.out.println("mobileloginHomeloan");
	}
	
	@Test
	public void loginAPIHomeLoan() {
		//rest API automation
		System.out.println("resApiloginHomeloan");
	}

}
