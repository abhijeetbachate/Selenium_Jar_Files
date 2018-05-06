package Dependency;

import org.testng.annotations.DataProvider;

//DataProvider for all tests
public class Data_Providers {
	

	@DataProvider(name="regtestDataProvider")
	public static Object[][] getdata(){
		
		Object obj[][]=new Object[2][2];
		
		obj[0][0]="user1";
		obj[0][1]="password1";
		
		obj[1][0]="user2";
		obj[1][1]="password2";
		
		return obj;
	}

}
