package practice;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class RegForm {
	
	@Test(dataProviderClass=Data_Provider.class,dataProvider="RegTestDataProvider")
	public void testcase(String username,String password){
		System.out.println(username+"++++++++++"+password);
	}
	
	
	

}
