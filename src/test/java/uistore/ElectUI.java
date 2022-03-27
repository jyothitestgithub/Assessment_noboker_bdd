package uistore;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ElectUI {

	@FindBy(xpath="//div[normalize-space()='Miscellaneous']")
	@CacheLookup
	public static WebElement miscell;
	
	@FindBy(xpath="//a[@title='Electrician Services Bangalore']")
	@CacheLookup
	public static WebElement service;
	
	
	

	
}
