package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import reusable.WebDriverHelper;
import uistore.RentalAgtUI;

public class RentalAgtPage extends RentalAgtUI {

	WebDriver ldriver;
	WebDriverHelper helper;
	
	public RentalAgtPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(ldriver,this);
		helper =new WebDriverHelper(ldriver);
	}
	
	public void rental() throws InterruptedException {
		helper.scrolldown(ldriver, agreement);
		helper.implicitWait(ldriver, 2);
		agreement.click();
		Thread.sleep(2);
		helper.switchTab(ldriver, 1);
	}

}
