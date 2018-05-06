package annot;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class parameterization {
	
	public static String username;
	public static String password;
	
	@Test(dataProvider="getdata")
	public void testcase(String username,String password){
		System.out.println(username+"----"+password);
	}
	
	@DataProvider
	public Object[][] getdata(){
		Object obj[][]=new Object[3][2];
		//set1
		obj[0][0]="srinivas1";
		obj[0][1]="Password1";
		
		//set2
		obj[1][0]="srinivas2";
		obj[1][1]="Password2";
		
		//set 3
		obj[2][0]="srinivas2";
		obj[2][1]="Password2";
		
		return obj;
		
	}

}
