package listeners_testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Login {
	
	@Test
	public void testcase(){
		
		System.out.println("A");
		try{
		Assert.assertEquals("A", "B");
		}catch(Throwable t){
			System.out.println(t.getMessage());
			//add an error
			ErrorUtil.addVerificationFailure(t);
		}
		System.out.println("B");
	}

}
