package objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RediffLoginPageFactory 
{
	//creating a constructor
	// creating an single argument
	public WebDriver driver;
	public RediffLoginPageFactory(WebDriver driver)
	{
		this.driver=driver; // created with single argument coz driver has the knowledge that it has to run on chrome browser
		//you need to initialize all this after creating @FindBy annotation
		PageFactory.initElements(driver, this);
	}
	
	/*By username=By.xpath("//input[@id='login1']");
	By Password=By.xpath("//input[@id='password']");
	By sign=By.name("proceed");
	By Home=By.linkText("rediff.com"); */
	
	// In Page Factory same thing we can write in different style using @FindBy like:
	@FindBy (xpath="//input[@id='login1']")
	WebElement username;
	
	@FindBy (xpath="//input[@id='password']")
	WebElement Password;

	/*@FindBy (name="proceed")
	WebElement sign; */
	
	@FindBy (linkText="rediff.com")
	WebElement Home;
	
	//creating one more method so we can just directly pass the method name to that other class
	
	public WebElement Emailid()
	{
		// returning as Webelement
		return username;
	}
	
	public WebElement Password()
	{
		// returning as Webelement
		return Password;
	}
	
	
	/*public WebElement Sign()
	{
		//returning as WebElement
		return sign;
	}*/
	
	public WebElement Home()
	{
		return Home;
	}
	
	
}
