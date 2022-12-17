import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MCA_Current_Account {

	WebDriver d;
	@Test
	public void sbicurrenttest() throws Exception
	{
		//load web page
		d.get("https://www.onlinesbi.sbi/");
		Actions a=new Actions(d);
		Thread.sleep(3000);
		a.clickAndHold(d.findElement(By.xpath("//a[text()='Apply for SB/ Current Account ']")));
		a.release().build().perform();
		Thread.sleep(3000);
		a.click(d.findElement(By.xpath("(//a[text()='Current Account '])[1]"))).build().perform();
		Thread.sleep(3000);
		a.click(d.findElement(By.xpath("(//a[text()='MCA Current Account'])"))).build().perform();
		Thread.sleep(3000);
	}
	@BeforeMethod
	public void setup()
	{
		//launch Browser
		d=new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		d.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(2));


	}
	@AfterMethod
	public void teardown()
	{
		//close browser
		d.quit();

	}

	
}
