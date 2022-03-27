package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import reusable.WebDriverHelper;
import uistore.ElectUI;

public class ElectPage extends ElectUI{

	WebDriver ldriver;
	WebDriverHelper helper;
	
	public ElectPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(ldriver,this);
		helper =new WebDriverHelper(ldriver);
	}
	
	public void scroll() {
		helper.implicitWait(ldriver, 10);
		
		helper.scrolldown(ldriver, miscell);
		helper.Explicitwait(miscell,2);
		miscell.click();
		helper.implicitWait(ldriver,2);
	}
	
	public void electrician() {
		service.click();
		 helper.switchTab(ldriver, 1);

	}

	}
