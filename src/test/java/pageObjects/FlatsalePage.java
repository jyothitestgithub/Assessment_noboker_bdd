package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import reusable.WebDriverHelper;
import uistore.FlatsaleUI;

public class FlatsalePage extends FlatsaleUI {

	WebDriver ldriver;
	WebDriverHelper helper;
	
	public FlatsalePage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(ldriver,this);
		helper =new WebDriverHelper(ldriver);
	}
     
	public void nagar() throws InterruptedException {
		helper.scrolldown(ldriver, sale);
		helper.implicitWait(ldriver, 2);
		sale.click();
		Thread.sleep(2000);
		helper.switchTab(ldriver, 1);

	}
}
