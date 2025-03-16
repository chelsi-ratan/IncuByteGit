package StepDefinition;

import org.openqa.selenium.WebDriver;

import PageObjects.CreateAccount;
import PageObjects.SignIn;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateAccountStepDefinition {

	WebDriver driver;
	public CreateAccountStepDefinition (DriverDefinition d)
	{
		driver = d.LaunchBrowser();
	}
	
	CreateAccount CA;
	
	@Then("I should navigate to Account creation page")
	public void user_should_navigate_to_CreateAccount_page() {
	    // Write code here that turns the phrase above into concrete actions
		CA = new CreateAccount(driver);
		CA.isTitleDispalyed();
	}
	@When("I Enter {string},{string},{string},{string} and {string}")
	public void FillFields(String Firstname,String LastName,String Email,String Password,String ConfirmPassword)
	{
		CA = new CreateAccount(driver);
		CA.enterFirstname(Firstname);
		CA.enterLastname(LastName);
		CA.enterEmail(Email);
		CA.enterPassword(Password);
		CA.enterConfirmPassword(ConfirmPassword);
	}
	@And("click on create Account")
	public void click_on_create_Account()
	{
		CA = new CreateAccount(driver);
		CA.clickCreateAccount();
	}
	@Then("the error message should say account exsists")
	public void error()
	{
		CA = new CreateAccount(driver);
		CA.isErrorDisplayed();
	}
}