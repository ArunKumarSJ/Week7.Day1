package pages;

import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethod;

public class ContactPage extends ProjectSpecificMethod {
	public ContactPage(ChromeDriver driver) {
		this.driver=driver;
	}
	public MergeContactPage ClickMergeContact() {
		driver.findElementByXPath("//a[text()='Merge Contacts']").click();
		return new MergeContactPage(driver);

	}
}
