package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPageObjects {
	
	// normal approach
	// Page Factory
	//contstructor
	// constructor should same as class name
	// should not have any return type
	
	
	WebDriver driver;
	
	public LoginPageObjects(WebDriver driver){
		
		this.driver=driver;
	}
	
	By username=By.id("email");
	By password = By.name("pass");
	By loginButton = By.xpath("//input[@id='u_0_2']");
	
	
	
	public void LogIntoFacebook(){
		
		driver.findElement(username).sendKeys("testusername");
		driver.findElement(password).sendKeys("testpassword");
		driver.findElement(loginButton).click();
	}
	
	public void mssgs(){
		
	}
	
}
