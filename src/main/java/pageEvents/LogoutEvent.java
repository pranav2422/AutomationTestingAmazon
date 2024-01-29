package pageEvents;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import pageobject.ManageListElement;
import pageobject.logoutelement;
import testjava.BaseTest;
import utils.ElementsFetch;

public class LogoutEvent {
	
	public void logoutt()  {
		ElementsFetch e = new ElementsFetch();
		//BaseTest.driver.navigate().refresh();
		WebDriverWait wait = new WebDriverWait(BaseTest.driver, 15);
		WebElement hover2 = wait.until(ExpectedConditions.elementToBeClickable(e.getWebElement("XPATH", logoutelement.accountAndList)));

		
		Actions act = new Actions(BaseTest.driver);
		act.moveToElement(hover2).build().perform();
		
		e.getWebElement("XPATH", logoutelement.signout).click();
		
		String expectedtitle = "Amazon Sign In";
		String actualtitle = BaseTest.driver.getTitle();
		
		Assert.assertEquals(expectedtitle, actualtitle);
		BaseTest.logger.info("Logout successfuly");

	}

}
