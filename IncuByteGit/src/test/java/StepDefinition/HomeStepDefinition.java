package StepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObjects.Home;
import PageObjects.Launch;
import io.cucumber.java.en.*;

public class HomeStepDefinition {
	
	WebDriver driver;
	public HomeStepDefinition (DriverDefinition d)
	{
		driver = d.LaunchBrowser();
	}
	@Then("user should navigate to home page")
	public void user_should_navigate_to_home_page() {
	    // Write code here that turns the phrase above into concrete actions
		Home h = new Home(driver);
		h.Welcome();
	}
	@Then ("I logout from the website")
	public void logout()
	{
		Home h = new Home(driver);
		h.Signout();
	}
}
	