package uistore;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class WarehouseUI {

	@FindBy(xpath="(//div[normalize-space()='Commercial'])[2]")
	@CacheLookup
	public static WebElement comm;
	
	@FindBy(xpath="//a[@title='Warehouse for Rent in Gurgaon']")
	@CacheLookup
	public static WebElement whouse;
}
