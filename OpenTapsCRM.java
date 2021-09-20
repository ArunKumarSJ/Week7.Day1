package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethod;

public class OpenTapsCRM extends ProjectSpecificMethod {

	public OpenTapsCRM(ChromeDriver driver) {
		this.driver = driver;
	}

	public OpenTapsCRM ClearCompanyName() {
		driver.findElement(By.id("updateLeadForm_companyName")).clear();
		return this;
	}

	public OpenTapsCRM UpdateCompanyName() {
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("TestLeaf");
		return this;
	}
	public ViewLeadPage ClickOnSubmit() {
		driver.findElementByClassName("smallSubmit").click();
		return new ViewLeadPage(driver);
	}
}
