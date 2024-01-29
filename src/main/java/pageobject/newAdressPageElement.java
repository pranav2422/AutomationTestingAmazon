package pageobject;

public interface newAdressPageElement {
	
	String All = "//span[contains(text(), 'All') and @class='hm-icon-label']";
	String block = "//div[@id='hmenu-content']";
    String youracc = "//a[contains(text(), 'Your Account')and @class='hmenu-item']";
    String youradd = "//h2[contains(text(), 'Your Addresses')and @class='a-spacing-none ya-card__heading--rich a-text-normal']";
    String addAdress = "ya-myab-plus-address-icon";
    String FullName = "//input[@id='address-ui-widgets-enterAddressFullName']";
    String Mno = "//input[@id='address-ui-widgets-enterAddressPhoneNumber']";
    String pinCode = "//input[@id='address-ui-widgets-enterAddressPostalCode']";
    String flat = "//input[@id='address-ui-widgets-enterAddressLine1']";
    String area="//input[@id='address-ui-widgets-enterAddressLine2']";
    String state = "//select[@name='address-ui-widgets-enterAddressStateOrRegion']";
    String addadressbtn = "//span[@id='address-ui-widgets-form-submit-button']/span[@class='a-button-inner']/input[@class='a-button-input']";
    String noofadd = "//div[@class='a-box a-spacing-none normal-desktop-address-tile']";
    
    String remove = "//a[@id='ya-myab-address-delete-btn-1']";
    String confirmdelete = "//span[@id='deleteAddressModal-1-submit-btn']//input[@class='a-button-input']";
}
