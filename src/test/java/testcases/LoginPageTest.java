package testcases;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.TestBase;
import pages.LoginPage;

public class LoginPageTest extends TestBase {

	LoginPage loginPage;

	public LoginPageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {

		initialization();
		GetUrl(prop.getProperty("url"));
		loginPage = new LoginPage();
	}

	@Test

	public void LoginPageGetTitle() throws InterruptedException {

		loginPage.homepageLogin(prop.getProperty("username"),prop.getProperty("password"));
		String actualRes = loginPage.validateLoginPageTitle();
//added lines
		assertEquals(actualRes, "OrangeHR");
	}

	@AfterMethod()
	public void tearnDown() {
		driver.quit();
	}

}
