package practice;

import org.testng.annotations.Test;

public class multiple {
	
	@Test(priority=1,dataProviderClass=Data_Provider.class,dataProvider="RegTestDataProvider")
	public void testA(String u,String p){
		
	}
	
	@Test(priority=2,dataProviderClass=Data_Provider.class,dataProvider="RegTestDataProvider")
	public void testB(String u,String p){
		
	}

}
