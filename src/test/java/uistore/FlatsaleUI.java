package uistore;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class FlatsaleUI {

	@FindBy(xpath="//a[@title='Flats for Sale in T Nagar']")
	@CacheLookup
	public static WebElement sale;

}
