package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import reusable.WebDriverHelper;
import uistore.BlogUI;

public class BlogPage extends BlogUI {

	WebDriver ldriver;
	WebDriverHelper helper;
	
	public BlogPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(ldriver,this);
		helper =new WebDriverHelper(ldriver);
	}
	
	public void blog() {
		blogs.click();
	}
	

}
