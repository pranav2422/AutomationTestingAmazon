package testjava;

import org.testng.annotations.Test;

import pageEvents.LogoutEvent;

public class Logoutfromwebsite extends BaseTest{
	
	@Test(priority = 1)
	public void logouttt() {
		LogoutEvent ll = new LogoutEvent();
		ll.logoutt();
	}

}
