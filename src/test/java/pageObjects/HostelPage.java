package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import reusable.WebDriverHelper;
import uistore.HostelUI;

public class HostelPage extends HostelUI{

	WebDriver ldriver;
	WebDriverHelper helper;
	
	public HostelPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(ldriver,this);
		helper =new WebDriverHelper(ldriver);
	}
	
	public void hostel() {
		helper.scrolldown(ldriver, heading);
		helper.implicitWait(ldriver, 2);
		heading.click();
		helper.implicitWait(ldriver, 2);
		pg.click();
	}
}
