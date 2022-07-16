package test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	
	public static WebDriver driver;
	
	@BeforeSuite
	public void initBrowser() {
		
		  WebDriverManager.chromedriver().setup();	
			//step-1 Launch browser
		   driver=new ChromeDriver();
			
			//Step-2 Maximize window
			driver.manage().window().maximize();
			
			//step-3
			driver.get("https://opensource-demo.orangehrmlive.com/");
			//step-4
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	
	@AfterSuite
	public void tearDown() {
		
		driver.close();
	}

}
