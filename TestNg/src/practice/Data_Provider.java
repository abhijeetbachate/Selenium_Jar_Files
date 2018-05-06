package practice;

import org.testng.annotations.DataProvider;

public class Data_Provider {

	@DataProvider(name="RegTestDataProvider")
	public static Object[][] getdata(){
	Object obj[][]=new Object[2][2];
		
		obj[0][0]="user11";
		obj[0][1]="password11";
		
		obj[1][0]="user22";
		obj[1][1]="password22";
		
		return obj;
	}

}
