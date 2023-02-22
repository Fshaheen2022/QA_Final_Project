package test;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.AccountPage;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.Base;

public class LoginTest extends Base {
	public WebDriver driver;
	
	
	@Test(dataProvider= "getLoginData")
	 public void login(String email,String password,String expectedStatus) throws IOException, InterruptedException {
	 
	
	LandingPage landingpage = new LandingPage(driver);
	landingpage.myAccountDropdown().click();
	
	landingpage.loginOption().click();
	
	
	Thread.sleep(3000);
	
	LoginPage loginpage = new LoginPage(driver);
	loginpage.emailAddressField().sendKeys(email);
	
	loginpage.passwordField().sendKeys(password);
	
	loginpage.loginButton().click();
	
	
	AccountPage accountpage= new AccountPage(driver);
	String actualResult= null;
	try {
	if(accountpage.editAccountInformationLink().isDisplayed()) {
		
		actualResult= "Success";}}
		
	catch (Exception e) {
		
			actualResult = "Failure";}
	}
	
		
	
	

	@DataProvider
	public Object[][] getLoginData() {
		Object[][] data= {{"farhana_shaheen@yahoo.com", "Selenium23", "Successful"},{"farhana_shaheen@yahoo.com","invalid","Failure"}};
	return data;
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
