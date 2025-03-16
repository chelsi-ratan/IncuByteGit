package StepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class DriverDefinition
{
	public WebDriver driver = null;
	
	public WebDriver LaunchBrowser()
	{
		if (driver == null)
		{
			driver = new ChromeDriver();
		}
		return driver;
	}
	
	@And("I close the browser")
	public void close_broswer()
	{
		driver.close();
		driver.quit();
	}
	
}