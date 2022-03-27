package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import reusable.WebDriverHelper;
import uistore.PostUI;

public class PostPage extends PostUI {

	WebDriver ldriver;
	WebDriverHelper helper;
	
	public PostPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(ldriver,this);
		helper =new WebDriverHelper(ldriver);
	}
	
	public void property() {
		ad.click();
	}
}
