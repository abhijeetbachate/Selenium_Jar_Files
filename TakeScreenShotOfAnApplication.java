package basicsofWebDirver;


import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

//working with drikpanchang.com


public class TakeScreenShotOfAnApplication {

	
	@Test
	public void testcase() throws Throwable{
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.navigate().to("http://www.drikpanchang.com/");
		driver.manage().window().maximize();
		
		
		 
		
		File  srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(srcFile,new File("D:\\srini1\\srini13.png"),true);
		 //  driver.close();
		   driver.quit();
	}
}
