package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import pages.LoginPage;

public class EditLead extends ProjectSpecificMethod {

	@BeforeTest
	public void setfilename() {
		filename = "EditLead";
	}

	@Test(dataProvider = "sendData1")
	public void EditLead(String username, String password, String name) {
		LoginPage lp1 = new LoginPage(driver);
		lp1.enterusername(username).enterpassword(password).clicklogin().clicklinkbutton().clickLeads()
				.ClickOnFindLeads().enterFirstName(name).ClickOnFindLeadButton().ClickOnFirstNameDisplayed()
				.GetTitleofThePage().CheckUpdateCompanyName().ClickOnEditButton().ClearCompanyName().UpdateCompanyName()
				.ClickOnSubmit().CheckUpdateCompanyName();

	}

}
