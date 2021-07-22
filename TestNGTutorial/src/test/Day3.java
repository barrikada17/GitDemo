package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day3 {

	@BeforeClass
	public void beforeClass() {
		System.out.println("I will execute before any method in day3 Class");
		System.out.println("I will execute before any method in day3 Class");
		System.out.println("I will execute before any method in day3 Class");
		System.out.println("I will execute before any method in day3 Class");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("I will execute after any method in day3 Class");
		System.out.println("I will execute after any method in day3 Class");
		System.out.println("I will execute after any method in day3 Class");
	}

	@Parameters({"URL","APIKey/usrname"})
	@Test
	public void webLoginCarLoan(String url, String key) {
		// selenium
		System.out.println("weblogincar");
		System.out.println(url);
		System.out.println(key);
	}

	@BeforeMethod
	public void beforeEvery() {
		System.out.println("I will execute before every test method in day3 Class");
	}

	@AfterMethod
	public void afterEvery() {
		System.out.println("I will execute after every test method in day3 Class");
		System.out.println();
	}

	@Test(groups= {"Smoke"})
	public void mobileLoginCarLoan() {
		// appium
		System.out.println("mobilelogincar");
	}

	@BeforeSuite
	public void bSuite() {
		// appium
		System.out.println("Nº 1");
	}

	//No se ejecuta si enabled = false
	@Test(enabled = false)
	public void mobileSiginCarLoan() {
		// appium
		System.out.println("Signin");
	}

	//Tiempo que tiene que pasar para decidir si da timeout
	//@Test(timeOut=4000)
	//Utilizamos el dataprovider del metodo que le pasamos 
	//Y ejecutamos el test tantas veces como filas tenga el objeto que le pasamos
	@Test(dataProvider="getData")
	public void mobileSigoutCarLoan(String usr, String pass) {
		// appium
		System.out.println("Signout");
		System.out.println(usr);
		System.out.println(pass);
		
	}

	//Hay que ejecutar los metodos dependientes primero
	@Test(dependsOnMethods = {"webLoginCarLoan","mobileSigoutCarLoan"})
	public void APICarLoan() {
		// rest API automation
		System.out.println("resApilogincar");
	}
	
	@DataProvider
	public Object[][] getData() {
		//1st combination - usr pass - good credit history = row
		//2nd - usr pass - no credit history
		//3rd - fraud credit history
		Object[][] data = new Object[3][2];
		
		//1st data set
		data[0][0] = "firstsetusername";
		data[0][1] = "password";
		//columns in the row are nothing but values for that particular combination(row)
		
		//2nd data set
		data[1][0] = "secondsetusername";
		data[1][1] = "password2";
		
		//3rd data set
		data[2][0] = "thirdsetusername";
		data[2][1] = "password3";
		
		return data;
		
	}
	

}
