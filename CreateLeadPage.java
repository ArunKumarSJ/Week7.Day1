package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethod;

public class CreateLeadPage extends ProjectSpecificMethod {
	
	public CreateLeadPage(ChromeDriver driver) {
		this.driver=driver;
	}

	public CreateLeadPage enterfirstname(String fname) {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
		return this;
	}

	public CreateLeadPage enterlastname(String lname) {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
		return this;
	}
	public CreateLeadPage entercompanyname(String comp) {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(comp);
		return this;
		
	}
	public ViewLeadPage clickCreateLead() {
		driver.findElementByName("submitButton").click();
		return new ViewLeadPage(driver);

	}
}
