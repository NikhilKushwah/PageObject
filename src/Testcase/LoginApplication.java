package Testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import objectrepository.RediffHomePage;
import objectrepository.RediffLoginPage;



public class LoginApplication
{
	public WebDriver driver;
	String ChromedriverPath = System.getProperty("user.dir")+"/chromedriver99/chromedriver.exe";
	@Test
	public void Login()
	{
		
		System.setProperty("webdriver.chrome.driver", ChromedriverPath);
		 driver=new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		//creating an Object of that class RediffLoginPage so we can access the data from there
		RediffLoginPage rd=new RediffLoginPage(driver); // driver is an argument so in that case we have to create a constructor with an argumnet
		//passing this Emailid method from Testcase package so no need to write the enitre thing by.xpath n all
		rd.Emailid().sendKeys("hello");
		rd.Password().sendKeys("Hello");
		//rd.Sign().click();
		rd.Home().click();
		//now creating an object of RediffHomePage to access that class 
		RediffHomePage rh=new RediffHomePage(driver);
		rh.Search().sendKeys("rediff");
		rh.Submit().click();
		
		
		
	}

}
