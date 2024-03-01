package pageEvents;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import pageobject.ManageListElement;
import utils.ElementsFetch;

public class ManageListEvents {
	
	public void createNewList() {
		ElementsFetch e = new ElementsFetch();
		WebElement hover = e.getWebElement("XPATH", ManageListElement.accountAndList);
		
		Actions act = new Actions(BaseTest.BaseTest.driver);
		act.moveToElement(hover).build().perform();
		
		e.getWebElement("XPATH", ManageListElement.wishLit).click();
		
	    e.getWebElement("ID", ManageListElement.createlist).click();
	    
	    WebElement listname = e.getWebElement("ID", ManageListElement.listName);
	    listname.clear();
	    listname.sendKeys("TestListss");
	    e.getWebElement("XPATH", ManageListElement.clickoncraete).click();
	    
	    BaseTest.BaseTest.driver.navigate().refresh();
	    
	    List<WebElement> listnamess = e.getListWebElements("XPATH", ManageListElement.alllistname);
	    
	    for(WebElement alln :listnamess) {
	    	System.out.println(alln.getText());
	    	if(alln.getText().equalsIgnoreCase("TestListss")) {
	    		System.out.println("List got cteated");
	    		BaseTest.BaseTest.logger.info("List got cteated");
	    		alln.click();
	    	}
	    }
    }
	    
	 public void managelist() throws InterruptedException {
		 ElementsFetch e1 = new ElementsFetch();
		 
		 WebDriverWait wait = new WebDriverWait(BaseTest.BaseTest.driver, 15);
		 Thread.sleep(5000);
		 WebElement hover2 = e1.getWebElement("XPATH", ManageListElement.more);
		 hover2.click();
//		 Actions act2 = new Actions(BaseTest.driver);
//		 act2.moveToElement(hover2).build().perform();
		 
		 e1.getWebElement("XPATH", ManageListElement.btnmanagelist).click();
		 
		 WebElement ss = wait.until(ExpectedConditions.elementToBeClickable(e1.getWebElement("XPATH", ManageListElement.email)));
		 ss.clear();
		 ss.sendKeys("abc@gmail.com");
		
		 
		 WebElement drpmonth = e1.getWebElement("XPATH", ManageListElement.bdaymonth);
		 Select s = new Select(drpmonth);
		 s.selectByVisibleText("April");
				 
		 WebElement drpday = e1.getWebElement("XPATH", ManageListElement.bdaydate);
		 Select s1 = new Select(drpday);
		 s1.selectByValue("24");
		 
		 e1.getWebElement("XPATH", ManageListElement.description).sendKeys("coooooooooooool");
		 e1.getWebElement("XPATH", ManageListElement.savec).click();	
		 
		 BaseTest.BaseTest.logger.info("List manage successfully");
	 }
	 
	 public void deletelist() throws InterruptedException {
		 ElementsFetch e1 = new ElementsFetch();
		 WebDriverWait wait = new WebDriverWait(BaseTest.BaseTest.driver, 30);
		 Thread.sleep(5000);
		 WebElement hover3 = e1.getWebElement("XPATH", ManageListElement.more);
		 hover3.click();
//		 Actions act3 = new Actions(BaseTest.driver);
//		 act3.moveToElement(hover3).build().perform();
		 
		 
		 e1.getWebElement("XPATH", ManageListElement.btnmanagelist).click(); 
		 
		 WebElement sq = wait.until(ExpectedConditions.elementToBeClickable(e1.getWebElement("XPATH", ManageListElement.deletelist)));
		 
		 sq.click();
		
		 WebElement sr = wait.until(ExpectedConditions.elementToBeClickable(e1.getWebElement("XPATH", ManageListElement.confirmdel)));
		 sr.click();
		 WebElement sm = wait.until(ExpectedConditions.elementToBeClickable(e1.getWebElement("XPATH", ManageListElement.confirmdel)));
		 sm.click();
		 BaseTest.BaseTest.logger.info("List deletedd");
		 System.out.println("list deleted");
		 
		
	}

}
