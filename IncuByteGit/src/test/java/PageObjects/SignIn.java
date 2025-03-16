package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import StepDefinition.DriverDefinition;

public class SignIn{
	
	WebDriver driver;
	public SignIn(WebDriver driver)
	{
		this.driver = driver;
	}
	By Email = By.xpath("//div[@class='control']/input[@id='email']");
	By Password =By.xpath("//div[@class='control']/input[@id='pass']");
	By SignIn=By.xpath("//div[@class='primary']/button[@class='action login primary']");
	By ForgotPassword =By.xpath("//div[@class='secondary']/a[@class='action remind']");
	By error = By.xpath("//div[text()='The account sign-in was incorrect or your account is disabled temporarily. Please wait and try again later.']");
	
	public void enterEmail(String email)
	{
		driver.findElement(Email).sendKeys(email);
	}
	public void enterpassword(String password)
	{
		driver.findElement(Password).sendKeys(password);
	}
	public void enterEmailAndpassword(String email,String password)
	{
		driver.findElement(Email).sendKeys(email);
		driver.findElement(Password).sendKeys(password);
	}
	public void clickSignIn()
	{
		driver.findElement(SignIn).click();
	}
	public void isForgotPasswordPresent()
	{
		driver.findElement(ForgotPassword).isDisplayed();
	}
	public void isErrorPresent()
	{
		driver.findElement(error).isDisplayed();
	}
}