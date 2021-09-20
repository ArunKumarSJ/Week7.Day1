package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethod;

public class DuplicateLead extends ProjectSpecificMethod {
	public DuplicateLead(ChromeDriver driver) {
		this.driver = driver;
	}

	public DuplicateLead GetTheFirstName() {
		String text2 = driver.findElement(By.id("createLeadForm_firstName")).getAttribute("value");
		return this;
	}
	public ViewLeadPage ClicKonEmailSubmitButton() {
		driver.findElementByClassName("smallSubmit").click();
		return new ViewLeadPage(driver);

	}
}
