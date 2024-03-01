package pageEvents;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import pageobject.ManageListElement;
import pageobject.newAdressPageElement;
import utils.ElementsFetch;

public class newAdressPageEvent {

	public void gotoaddadresspage() {
	    ElementsFetch a = new ElementsFetch();
	    //BaseTest.driver.navigate().refresh();
	    //Thread.sleep(4000);
	    a.getWebElement("XPATH", newAdressPageElement.All).click();
	    
	    WebElement move = a.getWebElement("XPATH", newAdressPageElement.block);
	    Actions act = new Actions(BaseTest.BaseTest.driver);
	    act.moveToElement(move).build().perform();
	    
	    a.getWebElement("XPATH", newAdressPageElement.youracc).click();
	    a.getWebElement("XPATH", newAdressPageElement.youradd).click();
	    BaseTest.BaseTest.logger.info("land on adress page");
}
	
	public void addNewadresdel() throws IOException {
		ElementsFetch a2 = new ElementsFetch();
		a2.getWebElement("ID", newAdressPageElement.addAdress).click();
		
		FileInputStream fis = new FileInputStream(".//DataproviderExcel//addDeliveryAdress.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("addAdress");
		
		String fullName = sheet.getRow(2).getCell(1).toString();
		//String mblno = sheet.getRow(3).getCell(1).getRawValue();
		
		// to convert numric value to string so we can pass it to sendkeys method
		String mblno =NumberToTextConverter.toText(sheet.getRow(3).getCell(1).getNumericCellValue());
		String pincode = sheet.getRow(4).getCell(1).toString();
		String flat = sheet.getRow(5).getCell(1).toString();
		String area = sheet.getRow(6).getCell(1).toString();
		String state = sheet.getRow(7).getCell(1).toString();
		
		a2.getWebElement("XPATH", newAdressPageElement.FullName).sendKeys(fullName);
		a2.getWebElement("XPATH", newAdressPageElement.Mno).sendKeys(mblno);
		a2.getWebElement("XPATH", newAdressPageElement.pinCode).sendKeys(pincode);
		a2.getWebElement("XPATH", newAdressPageElement.flat).sendKeys(flat);
		a2.getWebElement("XPATH", newAdressPageElement.area).sendKeys(area);
		
		WebElement sel = a2.getWebElement("XPATH", newAdressPageElement.state);
		Select ss = new Select(sel);
		ss.selectByVisibleText(state);
		
		a2.getWebElement("XPATH", newAdressPageElement.addadressbtn).click();
		
		int orignaladdresscount = 1;
		int nowaddresscount = 0;
		
		List<WebElement> noofadd = a2.getListWebElements("XPATH", newAdressPageElement.noofadd);
		for(WebElement rr :noofadd ){
			nowaddresscount++;
		}
		
		if(nowaddresscount>orignaladdresscount) {
			System.out.println("adress added no of add : "+nowaddresscount);
			BaseTest.BaseTest.logger.info("adress added succesfully");
		}		
		
	}
	
	
	public void removeadress() {
		ElementsFetch a4 = new ElementsFetch();
		a4.getWebElement("XPATH", newAdressPageElement.remove).click();
		a4.getWebElement("XPATH", newAdressPageElement.confirmdelete).click();	
		BaseTest.BaseTest.logger.info("adress remove succesfully");
	}
}