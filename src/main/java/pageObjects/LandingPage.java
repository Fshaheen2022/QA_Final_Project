package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {
	WebDriver driver;
	public LandingPage(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver,this);
}
	@FindBy(xpath= "//a[@title=\"My Account\"]")
			WebElement myAccountDropdown;
	
	public WebElement myAccountDropdown() {
		
		return myAccountDropdown;
	}
	
	@FindBy(xpath="//a[contains(text(),'Login')]")
	
	WebElement loginOption;
	
	public WebElement loginOption() {
		return loginOption;
	}
	
	@FindBy(xpath="//body/div[1]/nav[1]/div[2]/ul[1]/li[1]/a[1]")
	WebElement desktop;
	
	public WebElement desktop() {
		return desktop;
	}
	@FindBy(xpath="//a[contains(text(),'PC (0)')]")	
	WebElement pc;
	
	public WebElement pc() {
		return pc;
	}
	
}