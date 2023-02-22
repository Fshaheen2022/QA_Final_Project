package test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import resources.Base;

public class FailureTest extends Base {
	public WebDriver driver;
	
	@Test
	
public void failure() throws IOException, InterruptedException {
	
	System.out.println(" failure test.");
	 driver = initializeDriver();
	
	driver.get("http://tutorialsninja.com/demo/");
	Thread.sleep(2000);
	Assert.assertTrue(false);
	
	
}
	@AfterMethod
	public void closingBrowser() {
		driver.close();
		
		
	}

}
