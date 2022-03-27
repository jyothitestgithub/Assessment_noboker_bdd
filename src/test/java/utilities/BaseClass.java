package utilities;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

public class BaseClass {

	ReadConfig readconfig= new ReadConfig();
	public String browser=readconfig.getBrowser();
	public static WebDriver driver;
	public static Logger logger;
	
public void driversetup() {
		
		System.out.println(readconfig.getBrowser());
}
}
