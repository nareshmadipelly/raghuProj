package SeleniumDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class terminate {
	public static WebDriver driver;
	
	public void tearDownTest(){
		driver.quit();
	}
	public void launchBrowser(){
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\WINDOWS 8\\Downloads\\geckodriver-v0.18.0-win64\\geckodriver.exe");
		driver= new FirefoxDriver(); 
		driver.get("https://www.google.com/");
	}

}
