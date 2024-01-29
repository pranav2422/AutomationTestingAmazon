package pageEvents;

import pageobject.HomePageElements;
import testjava.BaseTest;
import utils.ElementsFetch;

public class HomePageEvent {
   
	public void clickonsigninbutton() {
		ElementsFetch e = new ElementsFetch();
		BaseTest.logger.info("clicking on signin button");
		
		e.getWebElement("XPATH", HomePageElements.signInButton).click();
	}
}
