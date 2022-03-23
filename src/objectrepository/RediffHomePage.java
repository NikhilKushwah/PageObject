package objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffHomePage 
{
	
	//creating a constructor
	// creating an single argument
	public WebDriver driver;
	public RediffHomePage(WebDriver driver)
	{
		this.driver=driver; // created with single argument coz driver has the knowledge that it has to run on chrome browser
	}
	
	By search=By.xpath("//input[@id='srchword']");
	By submit=By.xpath("//input[@aria-label='Search']");
	
	public WebElement Search()
	{
		return driver.findElement(search);
	}
	
	public WebElement Submit()
	{
		return driver.findElement(submit);
	}

}
