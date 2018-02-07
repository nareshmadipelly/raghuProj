package SeleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstSeleniumProgram {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\WINDOWS 8\\Downloads\\geckodriver-v0.18.0-win64\\geckodriver.exe");
		
		//launch browser
		FirefoxDriver driver = new FirefoxDriver(); 
		
		//launch application
		driver.get("https://www.facebook.com/");
		
		//enter username
		WebElement userName=driver.findElement(By.id("email"));
		userName.sendKeys("testuser");
		
		//enter password
		WebElement password=driver.findElement(By.name("pass"));
		password.sendKeys("testpassword");
		
		//click on login button
		WebElement submitButton=driver.findElement(By.id("u_0_5"));
		submitButton.click();
		
		//terminate session
		driver.quit();
		
		
		
		
	}

}
