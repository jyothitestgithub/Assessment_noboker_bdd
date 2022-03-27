package uistore;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class RentalAgtUI {

	@FindBy(xpath="//a[@aria-label='ra']")
	@CacheLookup
	public static WebElement agreement ;
	 
}
