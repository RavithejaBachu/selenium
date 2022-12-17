import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Handle_loginSBI_alert {

	
	WebDriver d;
	@Test
	public void mousetest() throws Exception
	{
		//load web page
		d.get("https://retail.onlinesbi.sbi/retail/login.htm");
		//verify the page title
		assertEquals(d.getTitle(),"State Bank of India - Personal Banking");
		//create Action for mouse
		Actions a=new Actions(d);
		//click continue to login by using mouse handles
		a.contextClick().perform();
		//Thread.sleep(5000);
		System.out.println(d.switchTo().alert().getText());
		
		 assertEquals(d.switchTo().alert().getText(),"This function is not allowed here.");
		 
		 d.switchTo().alert().accept();
		 
	
	}
	@BeforeMethod
	public void setup()
	{
		//launch Browser
	d=new ChromeDriver();
	d.manage().window().maximize();
	d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	d.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(2));
	
	
	}
	@AfterMethod
	public void teardown()
	{
		//close browser
	//	d.quit();
		
	
	
	
	}
}
