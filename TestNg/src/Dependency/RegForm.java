package Dependency;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class RegForm {
	
	@Test(dataProviderClass=Data_Providers.class,dataProvider="regtestDataProvider")
	public void testcase(String username,String password){
		System.out.println(username+"======"+password);
	}
	
	

}
