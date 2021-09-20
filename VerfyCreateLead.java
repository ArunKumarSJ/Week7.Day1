package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import pages.LoginPage;

public class VerfyCreateLead extends ProjectSpecificMethod {
	@BeforeTest
	public void setfilename() {
		filename = "CreateLead";
	}

	@Test(dataProvider = "sendData")
	public void createLead(String username, String password, String fname, String lname, String comp) {
		LoginPage lp = new LoginPage(driver);
		lp.enterusername(username).enterpassword(password).clicklogin().clicklinkbutton().clickLeads()
				.clickOnCreateLead().enterfirstname(fname).enterlastname(lname).entercompanyname(comp).clickCreateLead()
				.verifyLead();

	}
}
