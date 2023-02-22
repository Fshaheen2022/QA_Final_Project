package test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import resources.Base;

public class AlertHandlingTest extends Base {
	
public WebDriver drive;	
public LandingPage landingpage;

@Test	
	
public void alertHandling() throws InterruptedException {
	
 landingpage = new LandingPage(driver);
 
 landingpage.desktop().click();
 Thread.sleep(2000);
 landingpage.pc().click();

}

@BeforeMethod
public void openApplication() throws IOException {
	 
driver = initializeDriver();
		
driver.get(prop.getProperty("url"));	 
	 	 
	 
}

@AfterMethod
public void closure() {
	
	driver.close();
	
}
}