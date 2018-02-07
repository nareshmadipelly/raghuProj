package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPageObjectsNew {
	
	// normal approach
	// Page Factory
	//contstructor
	// constructor should same as class name
	// should not have any return type
	
	
	WebDriver driver;
	
	public LoginPageObjectsNew(WebDriver driver){
		
		this.driver=driver;
	}

	@FindBy(id="email1") 
	WebElement username;
	
	@FindBy(how=How.NAME,using="pass") 
	WebElement password;
	
	@FindBy(how=How.XPATH,using="//input[@id='u_0_2']") 
	WebElement login;
	
	public void LogIntoFacebook(String uid,String pass){
		
		username.sendKeys(uid);
		password.sendKeys(pass);
		login.click();
	}
	
}
