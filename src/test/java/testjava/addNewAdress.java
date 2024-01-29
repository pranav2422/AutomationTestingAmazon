package testjava;

import java.io.IOException;

import org.testng.annotations.Test;

import pageEvents.newAdressPageEvent;

public class addNewAdress extends BaseTest {
	
	@Test(priority = 1)
	public void addNewdeliveryaddress() throws IOException {
		newAdressPageEvent na = new newAdressPageEvent();
		na.gotoaddadresspage();
		na.addNewadresdel();
	}
	
	@Test(priority = 2)
	public void removeadress() {
		newAdressPageEvent nw = new newAdressPageEvent();
		nw.removeadress();
	}
	

}
