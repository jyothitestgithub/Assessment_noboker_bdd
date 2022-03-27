package utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class CaptureScreenshot {

	public static  String takeScreenshot(WebDriver driver) throws IOException {
		String path = ReadConfig.getScreenshotPath()+CurrentDateTime.getDateTime()+".png";
		File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File(path));
		System.out.println("Screenshot taken");
		return path;
	}
}
