package uistore;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class LoginUI {

	@FindBy(xpath="//div[@class='nb__19hcF']")
	@CacheLookup
	public static WebElement loginn;
	
	@FindBy(xpath="//input[@id='signUp-phoneNumber']")
	@CacheLookup
	public static WebElement mobile;
	
	@FindBy(xpath="(//label[@class='nb-radio radio-inline'])[2]")
	@CacheLookup
	public static WebElement radio ;
	
	@FindBy(xpath="//input[@id='login-signup-form__password-input']")
	@CacheLookup
	public static WebElement pass;
	
	@FindBy(xpath="//button[@id='signUpSubmit']")
	@CacheLookup
	public static WebElement cont;

	@FindBy(xpath="//span[@class='nb__3-MNF']")
	@CacheLookup
	public static WebElement check;


}
