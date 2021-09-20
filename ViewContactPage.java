package pages;

import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethod;

public class ViewContactPage extends ProjectSpecificMethod {
	public ViewContactPage(ChromeDriver driver) {
		this.driver=driver;
	}
	public ViewContactPage VerfyPageForMergeContact() throws InterruptedException {
		Thread.sleep(20000);
		String title = driver.getTitle();
		System.out.println("THE TITLE OF THE PAGE:" + title);
		return this;

	}
}
