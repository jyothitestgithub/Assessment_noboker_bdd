package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import reusable.WebDriverHelper;
import uistore.SellerUI;

public class SellerPage extends SellerUI {

	WebDriver ldriver;
	WebDriverHelper helper;
	
	public SellerPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(ldriver,this);
		helper =new WebDriverHelper(ldriver);
	}

	public void menuss() {
		menu.click();
	}
	
	public void plan() {
		sell.click();
	}
}
