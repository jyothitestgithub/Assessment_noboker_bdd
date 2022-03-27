package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import reusable.WebDriverHelper;
import uistore.WarehouseUI;

public class WarehousePage extends WarehouseUI{

	WebDriver ldriver;
	WebDriverHelper helper;
	
	public WarehousePage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(ldriver,this);
		helper =new WebDriverHelper(ldriver);
	}
	
	public void commercial() throws InterruptedException {
      helper.implicitWait(ldriver, 2);
		
		helper.scrolldown(ldriver,comm);
		Thread.sleep(3);
		comm.click();
	}
	
	public void wareh() {
		helper.implicitWait(ldriver, 2);
		whouse.click(); 
		helper.implicitWait(ldriver, 5);
	}
}
