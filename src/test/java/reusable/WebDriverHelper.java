package reusable;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverHelper {

public WebDriver driver;
	
	public WebDriverHelper(WebDriver driver) {
		this.driver=driver;
	}
	
	public void Explicitwait(WebElement element,long timeOutInSeconds) {
		WebDriverWait wait=new WebDriverWait(driver,timeOutInSeconds);
		wait.until(ExpectedConditions.visibilityOf(element));

	}
	
	public void implicitWait(WebDriver driver, int seconds) {
		driver.manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);
	}
	
	public void switchTab(WebDriver driver, int index) {
		ArrayList<String> windows = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(windows.get(index));
	}
	
	public void scrolldown(WebDriver ldriver,WebElement element) {
		Point loc=element.getLocation();
		JavascriptExecutor jse=(JavascriptExecutor)ldriver;
		jse.executeScript("window.scrollBy"+loc);
	}

}
