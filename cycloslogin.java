package stepdef;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;




public class cycloslogin {
WebDriver d;
	@Given("if user is on home page")
	public void if_user_is_on_home_page() {
	    d=new ChromeDriver();
	    d.get("https://demo.cyclos.org/ui/login");
	    d.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    d.manage().window().maximize();
	}

	@When("Enter the details in login functionality")
	public void enter_the_details_in_login_functionality() {
	 d.findElement(By.xpath("//a[@id='login-link']")).click();
	 d.findElement(By.xpath("//input[@type='text']")).sendKeys("demo");
	 d.findElement(By.xpath("//input[@type='password']")).sendKeys("1234");
	}

	@Then("Click on Login button")
	public void click_on_login_button() {
	   
	d.findElement(By.xpath("(//button[@type='button'])[2]")).click();
	}

	
}
