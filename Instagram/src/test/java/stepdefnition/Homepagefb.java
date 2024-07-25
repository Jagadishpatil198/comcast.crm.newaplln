package stepdefnition;

import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Homepagefb extends Instalogin {
	public WebElement search;
	@Given("click on search text field")
	public void click_on_search_text_field() 
	{
	    search = driver.findElement(By.xpath("//input[@placeholder='Search Facebook']"));
	    search.click();
	    
	}

	@When("user enters amitabh bachann and click on enter")
	public void user_enters_amitabh_bachann_and_click_on_enter()
	{
	    search.sendKeys("Amitabh bachaan");
	     search.sendKeys(Keys.ENTER);
	}

	@Then("amitabh bachann profile details should be displayed")
	public void amitabh_bachann_profile_details_should_be_displayed() 
	{
	   
	}

	@Then("user click on follow succesfully added message should be displayed")
	public void user_click_on_follow_succesfully_added_message_should_be_displayed() {
	    
	}


}
