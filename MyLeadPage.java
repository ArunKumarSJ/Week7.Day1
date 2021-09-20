package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethod;

public class MyLeadPage extends ProjectSpecificMethod {
	public MyLeadPage(ChromeDriver driver) {
		this.driver = driver;
	
	}

	public CreateLeadPage clickOnCreateLead() {
		driver.findElement(By.linkText("Create Lead")).click();
		return new CreateLeadPage(driver);
	}

	public FindLeadPage ClickOnFindLeads() {
		driver.findElementByLinkText("Find Leads").click();
		return new FindLeadPage(driver);

	}
}
