package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import reusable.WebDriverHelper;
import uistore.LoginUI;

public class LoginPage extends LoginUI {

	WebDriver ldriver;
	WebDriverHelper helper;
	
	public LoginPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(ldriver,this);
		helper =new WebDriverHelper(ldriver);
	}
	
public void login() {
		loginn.click();
		helper.implicitWait(ldriver, 5);
	}
public void number(String mobilenum) {
	mobile.sendKeys(mobilenum);
}

public void radiobt() {
      radio.click();
      //helper.Explicitwait(pass, 10);
      helper.implicitWait(ldriver, 5);
}

public void password(String password) {
	pass.sendKeys(password);
}

public void contbt() {
 cont.click();
}

public boolean verify() {
	return check.isDisplayed();
}

}
