package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Home{
	WebDriver driver;
	By Welcome = By.xpath("//li[@class ='greet welcome']");
	By dropdown = By.xpath("//span[@class='customer-name']/button");
	By SignOut = By.xpath("//div/ul/li[@class='authorization-link']");
	
	public Home(WebDriver driver)
	{
		this.driver = driver;
	}
	public void Welcome()
	{
		driver.findElement(Welcome).isDisplayed();
	}
	public void Signout()
	{
		driver.findElement(dropdown).click();
		driver.findElement(SignOut).click();
	}
}