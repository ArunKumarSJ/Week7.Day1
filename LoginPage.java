package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethod;

public class LoginPage extends ProjectSpecificMethod {
	public LoginPage(ChromeDriver driver) {
		this.driver = driver;
	}

	public LoginPage enterusername(String username) {
		driver.findElement(By.id("username")).sendKeys(username);
		return this;
	}

	public LoginPage enterpassword(String password) {
		driver.findElement(By.id("password")).sendKeys(password);
		return this;
	}

	public HomePage clicklogin() {
		driver.findElementByClassName("decorativeSubmit").click();
		return new HomePage(driver);
	}

}
