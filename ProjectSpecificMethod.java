package base;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import io.github.bonigarcia.wdm.WebDriverManager;
import utils.ExcelSheet1;

public class ProjectSpecificMethod {

	public ChromeDriver driver;
	public String filename;
	public String text1,text2;

	@BeforeMethod
	public void precondition() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/logout");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@AfterMethod
	public void postcondition() {
		driver.close();

	}

	@DataProvider
	public String[][] sendData() throws IOException {

		return ExcelSheet1.readData("CreateLead");

	}

	@DataProvider
	public String[][] sendData1() throws IOException {

		return ExcelSheet1.readData("EditLead");

	}
	@DataProvider
	public String[][] sendData2() throws IOException {

		return ExcelSheet1.readData("DuplicateLead");

	}
	@DataProvider
	public String[][] sendData3() throws IOException {

		return ExcelSheet1.readData("DeleteLead");

	}
	@DataProvider
	public String[][] sendData4() throws IOException {

		return ExcelSheet1.readData("MergeContact");

	}
}