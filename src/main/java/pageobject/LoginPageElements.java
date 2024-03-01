package pageobject;


public interface LoginPageElements {
  String logintext = "//h1[contains(text(),'Sign in')]";
  String emailadress = "ap_email";
  String continueaftermail = "continue";
  String SigninTitle = "//h1[contains(text(),'Sign in')]";
  String enterpassword ="//input[@id='ap_password']";
  String signinbtn = "//input[@id='signInSubmit']";
   
  String loginsuccess = "//span[contains(text(),'Hello, Pranav')]";
}
