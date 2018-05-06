package testcaseListeners;

import org.testng.Assert;
import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestResult;
import org.testng.annotations.Test;

public class CustomerForm extends TestCase_Listeners implements IInvokedMethodListener{
	
	@Test(priority=1)
	public void test1(){
		System.out.println("A");
		
	}
	
	@Test(priority=2)
	public void test2(){
		System.out.println("srinivas");
		try{
		Assert.assertEquals("A", "B");
		}catch(Throwable t){
			System.out.println("error");
			
		}
		System.out.println("mohan");
	}

	public void afterInvocation(IInvokedMethod method, ITestResult testResult) {
		// TODO Auto-generated method stub
		
	}

	public void beforeInvocation(IInvokedMethod method, ITestResult testResult) {
		// TODO Auto-generated method stub
		
	}

}
