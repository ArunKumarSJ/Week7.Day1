package pages;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import base.ProjectSpecificMethod;

public class HomePage extends ProjectSpecificMethod {
	public HomePage(ChromeDriver driver) {
		this.driver=driver;
	}
	public HomePage verfyHome() {
		boolean displayed = driver.findElementByLinkText("CRM/SFA").isDisplayed();
		Assert.assertTrue(displayed);
		return this;

	}

	public MyHomePage clicklinkbutton() {
		driver.findElementByLinkText("CRM/SFA").click();
		return new MyHomePage(driver);
	}

}
