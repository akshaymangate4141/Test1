package testBase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.qa.PageLayer.LoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	public static WebDriver driver;

	public static LoginPage login;
	
	
	
	@Parameters("browser")
	
	@BeforeMethod 
	public void SetUp(String browser)
	{
		
			if(browser.equalsIgnoreCase("Chrome"))
			{
				WebDriverManager.chromedriver().setup();
			    driver = new ChromeDriver();
			 
			}
			
			else if (browser.equalsIgnoreCase("Firefox"))
			{
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
				
			}
			
			else if (browser.equalsIgnoreCase("Edge"))
			{
				WebDriverManager.edgedriver().setup();
				driver = new EdgeDriver();
				
			}
			
			else
			{
				System.out.println("Please enter right browser details like Chrome,Firefox,Edge");
			}
			
		 driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://qaadmin.onzway.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); 
		
		 login= new LoginPage();
																
	}
	@AfterMethod
	public void tearDown()
	{
		driver.quit();

	}

}
