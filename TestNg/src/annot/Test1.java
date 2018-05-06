package annot;

import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test1 {
	@Test
	public void testcase1(){
		System.out.println("Test1");
	}
	
	@Test
	public void testcase2(){
		
		System.out.println("Test2");
		throw new SkipException("I am skipping this testcase");
	}
	@Test
	public void testcase3(){
		System.out.println("Test3");
	}
	
	@BeforeMethod
	public void beforemethod(){
		System.out.println("Login");
	}
	
	@AfterMethod
	public void aftermethod(){
		System.out.println("Logout");
	}
	
	@BeforeTest
	public void beforetest(){
		System.out.println("StartBrowser");
	}
	
	@AfterTest
	public void aftertest(){
		System.out.println("CloseBrowser");
	}
	
	@BeforeSuite
	public void beforesuite(){
		System.out.println("Enter for Testing a batch of Files");
	}
	
	@AfterSuite
	public void aftersuite(){
		System.out.println("Exit from testing a batch of Files");
	}

}
