package StepDefinition;

import org.openqa.selenium.WebDriver;

import PageObjects.Home;
import PageObjects.SignIn;
import io.cucumber.java.en.*;

public class SignInStepDefinition {

	WebDriver driver;
	public SignInStepDefinition (DriverDefinition d)
	{
		driver = d.LaunchBrowser();
	}
    SignIn signin;
	
	@Then("I should navigate to Login page")
	public void user_should_navigate_to_login_page() {
	    // Write code here that turns the phrase above into concrete actions
		signin = new SignIn(driver);
		signin.isForgotPasswordPresent();
	}

	@When("I enter {string} and {string}")
	public void i_enter_and(String email, String password) {
	    // Write code here that turns the phrase above into concrete actions
		signin = new SignIn(driver);
		 signin.enterEmailAndpassword(email, password);
	}
	@When("I enter email and password")
	public void i_enter_email_and_password(String email, String password) {
	    // Write code here that turns the phrase above into concrete actions
		signin = new SignIn(driver);
	    signin.enterEmailAndpassword(email, password);
	}

	@When("Click on Signin")
	public void click_on_signin() {
	    // Write code here that turns the phrase above into concrete actions
		signin = new SignIn(driver);
	    signin.clickSignIn();
	}

	@Then("the error message should be displayed")
	public void the_error_message_should_be_displayed() {
	    // Write code here that turns the phrase above into concrete actions
		signin = new SignIn(driver);
		signin.isErrorPresent();
	}

	
}