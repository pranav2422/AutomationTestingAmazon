package testjava;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import pageEvents.ManageListEvents;

public class ManageList extends BaseTest.BaseTest{
	
	@Test(priority = 1)
	public void createListaaa() {
		ManageListEvents M = new ManageListEvents();
		M.createNewList();
		
	}
	
	@Test(priority = 2)
	public void listmanage() throws InterruptedException {
		ManageListEvents M2 = new ManageListEvents();
		M2.managelist();
	}
	
	@Test(priority = 3)
	public void delthelist() throws InterruptedException {
		ManageListEvents m3 = new ManageListEvents();
		m3.deletelist();
	}
	
//	@Test(priority =4)
//	public void faillllll() {
//		BaseTest.driver.findElement(By.id("aaaaaaaaaa")).click();
//	}

}
