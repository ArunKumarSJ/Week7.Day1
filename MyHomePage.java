package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethod;

public class MyHomePage extends ProjectSpecificMethod {
	
	public MyHomePage(ChromeDriver driver) {
		this.driver=driver;
	}
	public MyLeadPage clickLeads() {
		driver.findElement(By.linkText("Leads")).click();
		return new MyLeadPage(driver);

	}
	public ContactPage ClickOnContactLinkButton() {
		driver.findElementByLinkText("Contacts").click();
		return new ContactPage(driver);

	}
}
