package uistore;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class HostelUI {
	
	@FindBy(xpath="//div[normalize-space()='PG / Hostels']")
	@CacheLookup
	public static WebElement heading ;

	@FindBy(xpath="//a[@href='/pg-in-powai_mumbai']")
	@CacheLookup
	public static WebElement pg;

}
