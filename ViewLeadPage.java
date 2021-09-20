package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethod;

public class ViewLeadPage extends ProjectSpecificMethod {

	public ViewLeadPage(ChromeDriver driver) {
		this.driver = driver;
	}

	public ViewLeadPage verifyLead() {
		String text = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		if (text.contains("Arun")) {
			System.out.println("FIRST NAME IS VERIFIED");
		}
		return this;
	}

	public ViewLeadPage GetTitleofThePage() {
		String Title1 = driver.getTitle();
		System.out.println("The Title of the page is:" + Title1);
		return this;
	}

	public OpenTapsCRM ClickOnEditButton() {
		driver.findElementByLinkText("Edit").click();
		return new OpenTapsCRM(driver);

	}

	public ViewLeadPage CheckUpdateCompanyName() {
		String Text1 = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		System.out.println("The changed name of Company is:" + Text1);
		return this;
	}

	public DuplicateLead ClickOnDuplicateLeadbutton() {
		driver.findElementByXPath("(//div[@class='frameSectionExtra'])[2]/a[1]").click();
		return new DuplicateLead(driver);
	}

	public MyLeadPage ClickOnDeleteButtonDeleteLead() {
		driver.findElementByLinkText("Delete").click();
		return new MyLeadPage(driver);

	}

	

}
