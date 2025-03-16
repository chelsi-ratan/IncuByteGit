package StepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObjects.Launch;
import io.cucumber.java.en.*;

public class LaunchStepDefinition {
	
	WebDriver driver;
	public LaunchStepDefinition (DriverDefinition d)
	{
		driver = d.LaunchBrowser();
	}
    Launch launch;
	
	@Given("I am on the Launch page")
	public void i_am_on_the_launch_page() {
	    // Write code here that turns the phrase above into concrete actions
		driver.get("https://magento.softwaretestingboard.com/");
		driver.manage().window().maximize();
	//	driver.navigate().refresh();
	}
	
	@When("I click on SignIn")
	public void signin() {
	    // Write code here that turns the phrase above into concrete actions
		launch = new Launch(driver);
	    launch.SignIn();
	}
	@When("I click on CreateAnAccount")
	public void i_click_on_CreateAccount() {
		launch = new Launch(driver);
		launch.CreateAccount();
	}

}