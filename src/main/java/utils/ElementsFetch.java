package utils;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class ElementsFetch {
	
	public WebElement getWebElement(String identifierType, String identifirevalue) {
		if(identifierType=="ID") {
			return BaseTest.BaseTest.driver.findElement(By.id(identifirevalue));
		}
		else if(identifierType=="CSS") {
			return BaseTest.BaseTest.driver.findElement(By.cssSelector(identifirevalue));
		}
		else if(identifierType=="TAGNAME") {
			return BaseTest.BaseTest.driver.findElement(By.tagName(identifirevalue));
		}
		else if(identifierType=="XPATH") {
			return BaseTest.BaseTest.driver.findElement(By.xpath(identifirevalue));
		}else {
			return null;
		}
	}
	
	
	public List<WebElement> getListWebElements(String identifierType, String identifirevalue) {
		if(identifierType=="ID") {
			return BaseTest.BaseTest.driver.findElements(By.id(identifirevalue));
		}
		else if(identifierType=="CSS") {
			return BaseTest.BaseTest.driver.findElements(By.cssSelector(identifirevalue));
		}
		else if(identifierType=="TAGNAME") {
			return BaseTest.BaseTest.driver.findElements(By.tagName(identifirevalue));
		}
		else if(identifierType=="XPATH") {
			return BaseTest.BaseTest.driver.findElements(By.xpath(identifirevalue));
		}else {
			return null;
		}
	}

}
