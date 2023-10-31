package co.techstore.Testbase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

import co.techstore.Utility.Utill;

public class Testbase {
	
	public static WebDriver driver;
	public Utill excel;
	@BeforeMethod
	public void setUp()
	{
		String browser="Chrome";
		if(browser.equalsIgnoreCase("Chrome"))
		{
		       driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("edge"))
		{
	          driver=new EdgeDriver();
		}
		else if(browser.equalsIgnoreCase("FireFox"))
		{
			  driver=new FirefoxDriver();
		}
		else
		{
			System.out.println("default browser");
		}
		
		driver.get("https://techstore.co.in/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		excel=new Utill();
		
	}
	
	
  /* @AfterMethod
	public void tearDown()
	{
		driver.close();
	}*/
	
}
