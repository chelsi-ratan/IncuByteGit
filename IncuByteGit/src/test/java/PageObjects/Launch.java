package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Launch{
	WebDriver driver;
	By CreateAccount = By.xpath("//div/ul/li/a[text()='Create an Account']");
	By SignIn = By.xpath("//div/ul/li[@class='authorization-link']/a");
	
	public Launch(WebDriver driver)
	{
		this.driver = driver;
	}
	public void CreateAccount()
	{
		driver.findElement(CreateAccount).click();
	}
	public void SignIn()
	{
		driver.findElement(SignIn).click();
	}
}