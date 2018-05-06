package Dependency;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Testing {
	
	

	@Test(priority=1)
	public void testLogin(){
	//	Assert.assertEquals("A","B");
		System.out.println("Login");
	}
	
	@Test(priority=2,dependsOnMethods={"testLogin"})
	public void testForChange(){
		System.out.println("change the content in the app...");
	}
	
	@Test(priority=3,dependsOnMethods={"testLogin"})
	public void testLogout(){
		System.out.println("Logout");
	}

}
