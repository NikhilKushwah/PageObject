package objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffLoginPage 
{
	//creating a constructor
	// creating an single argument
	public WebDriver driver;
	public RediffLoginPage(WebDriver driver)
	{
		this.driver=driver; // created with single argument coz driver has the knowledge that it has to run on chrome browser
	}
	
	By username=By.xpath("//input[@id='login1']");
	By Password=By.xpath("//input[@id='password']");
	By sign=By.name("proceed");
	By Home=By.linkText("rediff.com");

	
	//creating one more method so we can just directly pass the method name to that other class
	
	public WebElement Emailid()
	{
		// returning as Webelement
		return driver.findElement(username);
	}
	
	public WebElement Password()
	{
		// returning as Webelement
		return driver.findElement(Password);
	}
	
	
	public WebElement Sign()
	{
		//returning as WebElement
		return driver.findElement(sign);
	}
	
	public WebElement Home()
	{
		return driver.findElement(Home);
	}
	
	
}
