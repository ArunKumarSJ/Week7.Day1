package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import pages.LoginPage;

public class VerfyDuplicateLead extends ProjectSpecificMethod {

	@BeforeTest
	public void setfilename() {
		filename = "DuplicateLead";
	}

	@Test(dataProvider = "sendData2")
	public void DuplicateLead(String username, String password, String email) throws InterruptedException {
		LoginPage lp = new LoginPage(driver);
		lp.enterusername(username).enterpassword(password).clicklogin().clicklinkbutton().clickLeads()
				.ClickOnFindLeads().ClickOnEmailButton().EnterEmail(email).ClickOnEmailSubmitButton()
				.ClickOnFirstDisplayedNameEmail().ClickOnDuplicateLeadbutton().GetTheFirstName()
				.ClicKonEmailSubmitButton();
}
}