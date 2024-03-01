package pageEvents;

import org.testng.Assert;

import pageobject.LoginPageElements;
import utils.ElementsFetch;

public class LoginPageEvent {

	public void verifyloginpageopen() {
		ElementsFetch e = new ElementsFetch();
		Assert.assertTrue(e.getListWebElements("XPATH",LoginPageElements.logintext).size()>0,"Login page not open");
		System.out.println("landed on login page");
	}
	
	public void enteremailid() {
		ElementsFetch e1 = new ElementsFetch();
		BaseTest.BaseTest.logger.info("entering email ID");
        e1.getWebElement("ID", LoginPageElements.emailadress).sendKeys("8805692201");
        e1.getWebElement("ID", LoginPageElements.continueaftermail).click();
	}
	
	public void enterpassword() {
		ElementsFetch e2 = new ElementsFetch();
		// to ensure you are on signin page
		Assert.assertTrue(e2.getWebElement("XPATH", LoginPageElements.enterpassword).isDisplayed(), "landed on correct page");
		e2.getWebElement("XPATH", LoginPageElements.enterpassword).sendKeys("Pranav@24");
		e2.getWebElement("XPATH", LoginPageElements.signinbtn).click();
		// to ensure you are login sucessfully
		Assert.assertTrue(e2.getWebElement("XPATH", LoginPageElements.loginsuccess).isDisplayed(), "login failed");
		BaseTest.BaseTest.logger.info("login successful");
		
	}
}
