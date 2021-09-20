package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import pages.LoginPage;

public class VerfyDeleteLead extends ProjectSpecificMethod {
	@BeforeTest
	public void setfilename() {
		filename = "DeleteLead";
	}

	@Test(dataProvider = "sendData3")
	public void DeleteLead(String username, String password, String phonenumber) {
		LoginPage lp = new LoginPage(driver);
		lp.enterusername(username).enterpassword(password).clicklogin().clicklinkbutton().clickLeads()
				.ClickOnFindLeads().ClickOnPhoneLink().EnterPhoneNumber(phonenumber).ClickOnFindLeadPhone()
				.ClickOnEmailButton().ClickOnFirstNameDispLayedForDeleteLead().ClickOnDeleteButtonDeleteLead()
				.ClickOnFindLeads();//.EnterNumberToCheckForDeleteLead(text).ClickOnFindLeadPhone().verFyDeleteLead();
	}
}
