package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class LoginPage extends TestBase{
	
	
	@FindBy(xpath ="//input[contains(@id,'txtUsername')]")
	WebElement username_txt;
	
	@FindBy(xpath="//input[contains(@id,'txtPassword')]")
	WebElement password_txt;
	
	
	@FindBy(xpath="//input[contains(@id,'btnLogin')]")
	WebElement login_btn;
	
	
	public LoginPage(){
	PageFactory.initElements(driver, this);
	
	}
		public String validateLoginPageTitle() {
			
			return driver.getTitle();
		
	}
		
		public void homepageLogin(String userName,String password) {
			username_txt.sendKeys(userName);
			username_txt.sendKeys(password);
			login_btn.click();
			
		}

}
