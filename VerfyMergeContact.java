package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import pages.LoginPage;

public class VerfyMergeContact extends ProjectSpecificMethod {
	@BeforeTest
	public void setfilename() {
		filename = "MergeContact";
	}

	@Test(dataProvider = "sendData4")
	public void MergeContact(String username, String password) throws InterruptedException {
		LoginPage lp = new LoginPage(driver);
		lp.enterusername(username).enterpassword(password).clicklogin().clicklinkbutton().ClickOnContactLinkButton()
				.ClickMergeContact().ClickForFirstContact().ClickForSecondContact().ClickOnMergeContactButtton()
				.VerfyPageForMergeContact();
	}
}
