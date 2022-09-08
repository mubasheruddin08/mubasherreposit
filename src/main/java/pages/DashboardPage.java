package pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class DashboardPage extends TestBase {

	@FindBy(xpath = "//table[@class='quickLaungeContainer']//tr//td")

	private List<WebElement> quickLaunch_links;

	@FindBy(xpath = "//span[text()='My Timesheet']")

	private WebElement timesheetquickLaunch_lnk;

	public DashboardPage() {
		PageFactory.initElements(driver, this);
	}

	public List clickQuickLauchItems() {
		ArrayList<String> pagetitles=new ArrayList<String>();
		for (WebElement link : quickLaunch_links) {

			link.click();
			pagetitles.add(driver.getTitle());
			driver.navigate().back();
			
		}
		System.out.println("My page titles"+pagetitles);
		return pagetitles;
		
	}

	public void clicktimesheetLaunch() {
		timesheetquickLaunch_lnk.click();

	}
}
