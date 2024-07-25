package stepdefnition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Instalogin {
	public WebDriver driver;
	String expected="https://www.facebook.com/";
	@Given("user open browser and enter the url login page should be displayed")
	
	public void user_open_browser_and_enter_the_url_login_page_should_be_displayed() 
	{
	    WebDriverManager.chromedriver().setup();
	    ChromeOptions opt=new ChromeOptions();
	    opt.addArguments("--disable-notifications");
	    
	     driver=new ChromeDriver(opt);
	     driver.get("https://www.facebook.com/");
	     driver.manage().window().maximize();
	    
	}

	@When("user enters valid username, password and click on login button")
	public void user_enters_valid_username_password_and_click_on_login_button() throws InterruptedException
	{
	   driver.findElement(By.name("email")).sendKeys("8050740930");
	   driver.findElement(By.id("pass")).sendKeys("JP198@bldea()");
	   driver.findElement(By.name("login")).click();
	   Thread.sleep(2000);
	  
	}

	@Then("Home page should be displayed")
	public void home_page_should_be_displayed() throws InterruptedException
	{
		Thread.sleep(2000);
		String url = driver.getCurrentUrl();
	   Assert.assertEquals(url, expected);
	   Thread.sleep(2000);
	   
	}

	@Then("user should be able to logout")
	public void user_should_be_able_to_logout() {
		driver.findElement(By.xpath("(//*[local-name()='svg']//*[local-name()='circle' and @fill='white'])[1]")).click();
	  
	}

}
