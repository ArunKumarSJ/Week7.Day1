package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethod;

public class FindLeadPage extends ProjectSpecificMethod {

	public FindLeadPage(ChromeDriver driver) {
		this.driver = driver;
	}

	public FindLeadPage enterFirstName(String name) {
		driver.findElementByXPath("(//input[@type='text'])[30]").sendKeys(name);
		return this;
	}

	public FindLeadPage ClickOnFindLeadButton() {
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		return this;
	}

	public ViewLeadPage ClickOnFirstNameDisplayed() {
		driver.findElementByXPath("//a[text()='arun']").click();
		return new ViewLeadPage(driver);
	}

	public FindLeadPage ClickOnEmailButton() {
		driver.findElementByLinkText("Email").click();
		return this;
	}

	public FindLeadPage EnterEmail(String email) {
		driver.findElement(By.name("emailAddress")).sendKeys(email);
		return this;
	}

	public FindLeadPage ClickOnEmailSubmitButton() throws InterruptedException {
		driver.findElementByXPath("(//button[@class='x-btn-text'])[7]").click();
		Thread.sleep(1000);
		return this;
	}

	public ViewLeadPage ClickOnFirstDisplayedNameEmail() {
		WebElement Name = driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName'])/a");
		String text1 = Name.getText();
		Name.click();
		return new ViewLeadPage(driver);
	}

	public FindLeadPage ClickOnPhoneLink() {
		driver.findElementByLinkText("Phone").click();
		return this;

	}

	public FindLeadPage EnterPhoneNumber(String phonenumber) {
		driver.findElement(By.name("phoneNumber")).sendKeys(phonenumber);
		return this;
	}

	public FindLeadPage ClickOnFindLeadPhone() {
		driver.findElement(By.id("ext-gen334")).click();
		return this;

	}

	public ViewLeadPage ClickOnFirstNameDispLayedForDeleteLead() {
		WebElement id = driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a");
		String text = id.getText();
		id.click();
		return new ViewLeadPage(driver);
	}

	public FindLeadPage EnterNumberToCheckForDeleteLead(String text) {
		driver.findElement(By.id("ext-gen246")).sendKeys(text);
		return this;
	}
	public FindLeadPage verFyDeleteLead() {
		WebElement verfy = driver.findElementByXPath("//div[text()='No records to display']");
		if (verfy.isDisplayed() == true) {
			System.out.println("No Records to display");
		}
		return this;

	}
	
}
