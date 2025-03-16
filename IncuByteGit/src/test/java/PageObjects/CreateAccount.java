package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreateAccount{
	
	WebDriver driver;
	public CreateAccount(WebDriver driver)
	{
		this.driver = driver;
	}
	
	By Title = By.xpath("//h1/span[text()='Create New Customer Account']");
	By Firstname = By.xpath("//div[@class='control']/input[@id='firstname']");
	By LastName= By.xpath("//div[@class='control']/input[@id='lastname']");
	By Email=By.xpath("//div[@class='control']/input[@id='email_address']");
	By Password=By.xpath("//div[@class='control']/input[@id='password']");
	By ConfirmPassword=By.xpath("//div[@class='control']/input[@id='password-confirmation']");
	By CreateAnAccount=By.xpath("//div[@class='primary']/button[@class='action submit primary']");
	By Error = By.xpath("//div[text()='There is already an account with this email address. If you are sure that it is your email address, ']");
	
	public void isErrorDisplayed()
	{
		driver.findElement(Error).isDisplayed();
	}
	public void isTitleDispalyed()
	{
		driver.findElement(Title).isDisplayed();
	}
	public void enterFirstname(String firstname)
	{
		driver.findElement(Firstname).sendKeys(firstname);
	}
	
	public void enterLastname(String lastname)
	{
		driver.findElement(LastName).sendKeys(lastname);
	}
	
	public void enterEmail(String email)
	{
		driver.findElement(Email).sendKeys(email);
	}
	
	public void enterPassword(String password)
	{
		driver.findElement(Password).sendKeys(password);
	}
	
	public void enterConfirmPassword(String confirmpassword)
	{
		driver.findElement(ConfirmPassword).sendKeys(confirmpassword);
	}
	
	public void clickCreateAccount()
	{
		driver.findElement(CreateAnAccount).click();
	}
}