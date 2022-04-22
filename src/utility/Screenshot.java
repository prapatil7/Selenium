package utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {
	public static void takeScreenshot(WebDriver driver, String name) throws IOException {
		TakesScreenshot pic = (TakesScreenshot)driver;
		File souce = pic.getScreenshotAs(OutputType.FILE);
		String path= System.getProperty("user.dir")+"\\screenshot1\\"+name+".png";
		File destination = new File(path);
		FileHandler.copy(souce, destination);
	
	}

}
