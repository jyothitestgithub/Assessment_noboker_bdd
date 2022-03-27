package uistore;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class SellerUI {

	@FindBy(xpath="(//div[@class='nb__19hcF'])[3]")
	@CacheLookup
	public static WebElement menu;

	
	@FindBy(xpath="//a[normalize-space()='Seller Plans']")
	@CacheLookup
	public static WebElement sell;

}
