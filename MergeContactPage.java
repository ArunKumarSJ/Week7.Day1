package pages;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethod;

public class MergeContactPage extends ProjectSpecificMethod {

	public MergeContactPage(ChromeDriver driver) {
		this.driver = driver;
	}

	public MergeContactPage ClickForFirstContact() {
		driver.findElementByXPath("(//img[@alt='Lookup'])[1]").click();
		Set<String> windowHandlesSet = driver.getWindowHandles();
		List<String> windowHandlesList = new ArrayList<String>(windowHandlesSet);
		driver.switchTo().window(windowHandlesList.get(1));
		driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a").click();
		driver.switchTo().window(windowHandlesList.get(0));
		return this;
	}

	public MergeContactPage ClickForSecondContact() {
		driver.findElementByXPath("(//img[@alt='Lookup'])[2]").click();
		Set<String> windowHandlesSet1 = driver.getWindowHandles();
		List<String> windowHandlesList1 = new ArrayList<String>(windowHandlesSet1);
		driver.switchTo().window(windowHandlesList1.get(1));
		driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[2]/a").click();
		driver.switchTo().window(windowHandlesList1.get(0));
		return this;
	}

	public ViewContactPage ClickOnMergeContactButtton() {
		driver.findElementByXPath("//a[text()='Merge']").click();
		Alert alert1 = driver.switchTo().alert();
		alert1.accept();
		return new ViewContactPage(driver);

	}

}
