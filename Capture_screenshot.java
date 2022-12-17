package pack1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.reporters.Files;

public class Capture_screenshot {
	WebDriver driver;

@BeforeMethod
public void start() throws IOException
{
	driver = new ChromeDriver();
	driver.get("https://retail.onlinesbi.sbi/retail/login.htm");
	driver.findElement(By.linkText("CONTINUE TO LOGIN")).click();
	driver.findElement(By.id("chkbox")).click();
	File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(screenshot,new File("D:\\Selenium stuff\\"));
}
}
class Test{
	public static void main(String[] args) throws IOException
	{
		Capture_screenshot obj = new Capture_screenshot();
		obj.start();
	}
}
