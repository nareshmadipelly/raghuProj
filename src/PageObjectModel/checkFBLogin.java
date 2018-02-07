package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class checkFBLogin {
	
	@Test
	public void loginVerify(){
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\WINDOWS 8\\Downloads\\geckodriver-v0.18.0-win64\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver(); 

		driver.get("https://www.facebook.com/");
		
		LoginPageObjectsNew loginPage=PageFactory.initElements(driver, LoginPageObjectsNew.class);
		
		loginPage.LogIntoFacebook("testunser","testpassword");
		
		
	}

}
