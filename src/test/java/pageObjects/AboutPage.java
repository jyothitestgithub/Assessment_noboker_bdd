package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import reusable.WebDriverHelper;
import uistore.AboutUI;

public class AboutPage extends AboutUI {

	WebDriver ldriver;
	WebDriverHelper helper;
	
	public AboutPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(ldriver,this);
		helper =new WebDriverHelper(ldriver);
	}

   public void down() {
		helper.scrolldown(ldriver, us);
		helper.implicitWait(ldriver, 2);
		us.click();
	}

}
