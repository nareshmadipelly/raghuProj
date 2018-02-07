package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Repository {

	
	WebDriver driver;
	
	public Repository(WebDriver driver){
		
		this.driver=driver;
	}
	
	By username=By.id("email");
	By password = By.name("pass");
	By loginButton = By.xpath("//input[@id='u_0_2']");
	
	
	
	
}
