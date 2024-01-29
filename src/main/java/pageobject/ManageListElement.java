package pageobject;

public interface ManageListElement {
	
	String accountAndList = "//a[@id='nav-link-accountList']";
	String wishLit = "//span[@class='nav-text' and contains(text(),'Your Wish List')]";
	String createlist ="createList";
	String listName = "list-name";
	String clickoncraete ="//span[@id='wl-redesigned-create-list']";
	String name = "//span[@id='profile-list-name']";
	String alllistname = "//a[@class='a-link-normal a-declarative hover-as-link']//span[@class='a-color-base']";
	String more = "//div[@class='aok-inline-block aok-align-center overflow-menu-icon-with-more-label']/span";
    String btnmanagelist = "//a[@id='editYourList']";
    String email = "//input[@id='list-settings-email']";
    String description = "//textarea[@id='list-settings-description']";
    String bdaymonth = "//select[@id='list-settings-birthday-month']";
    String bdaydate = "//select[@id='list-settings-birthday-day']";
    String savec = "//span[@id='list-settings-save' and @class='a-button a-button-primary']";
    String deletelist ="//span[@class='a-button a-spacing-base a-button-base full-width-element']/span[@class='a-button-inner']/input[@class='a-button-input']";
    String confirmdel = "//input[@name='submit.save' and @class='a-button-input']";
}
