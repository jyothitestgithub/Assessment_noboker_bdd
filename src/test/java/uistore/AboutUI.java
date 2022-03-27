package uistore;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class AboutUI {


	@FindBy(xpath="//div[normalize-space()='About Us']")
	@CacheLookup
	public static WebElement us ;
	 
	
}
