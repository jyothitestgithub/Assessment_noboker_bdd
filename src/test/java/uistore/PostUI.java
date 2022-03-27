package uistore;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class PostUI {

	@FindBy(xpath="//button[normalize-space()='Post Free property ad']")
	@CacheLookup
	public static WebElement ad;
	
}
