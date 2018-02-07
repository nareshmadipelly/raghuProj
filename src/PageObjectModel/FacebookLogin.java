package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FacebookLogin {
	
	@Test
	public void loginPage(){
		
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\WINDOWS 8\\Downloads\\geckodriver-v0.18.0-win64\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver(); 

		driver.get("https://www.facebook.com/");
		
		LoginPageObjects login = new LoginPageObjects(driver);
		
		login.LogIntoFacebook();
		
		
	}

}
