package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class LoginPage extends TestBase {

	// Web Elemnets
	@FindBy(xpath = "//input[@name='username']")
	private WebElement username_txt;

	@FindBy(xpath = "//input[@name='password']")
	private WebElement password_txt;

	@FindBy(xpath = "//button[contains(@class,'oxd-button oxd-button')]")
	private WebElement login_btn;

	@FindBy(xpath = "//input[contains(@id,'btnLogin')]")
	private WebElement ForgotPassowrd_lnk;

	public LoginPage() {
		PageFactory.initElements(driver, this);

	}

	// page actions
	public String validateLoginPageTitle() {

		return driver.getTitle();

	}

	public void homepageLogin(String userName, String password) {
		username_txt.sendKeys(userName);
		password_txt.sendKeys(password);
		login_btn.click();

	}

	public void clickOnForgotPassowrd() {
		ForgotPassowrd_lnk.click();
	}

}
