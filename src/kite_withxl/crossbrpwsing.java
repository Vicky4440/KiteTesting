package kite_withxl;

import org.apache.poi.ss.usermodel.Sheet;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class crossbrpwsing {
	WebDriver driver;
	@Parameters ("browser")
	@BeforeMethod
	 public void launchbrowser(String browser) {
		if(browser.equals("chrome")) {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\Desktop\\sell jars\\chromedriver_win32 (2)//chromedriver.exe");
		
		
		 driver=new ChromeDriver();
		 
			
			}
		else if (browser.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\dell\\Desktop\\sell jars\\geckodriver-v0.31.0-win64\\geckodriver.exe");
             driver= new FirefoxDriver();
         
		}
		 driver.get("https://kite.zerodha.com/");
			
			driver.manage().window().maximize();	
  }
	@Test
	public void f() {
		
	}
}
