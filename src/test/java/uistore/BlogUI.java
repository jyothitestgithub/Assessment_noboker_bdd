package uistore;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class BlogUI {

	@FindBy(xpath="//a[normalize-space()='Blog']")
	@CacheLookup
	public static WebElement blogs;

}
