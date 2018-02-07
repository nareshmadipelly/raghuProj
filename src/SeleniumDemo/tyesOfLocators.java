package SeleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class tyesOfLocators {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\WINDOWS 8\\Downloads\\geckodriver-v0.18.0-win64\\geckodriver.exe");
		
		//launch browser
		FirefoxDriver driver = new FirefoxDriver(); 

		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//*[@id='u_0_k']")).sendKeys("testUsername");
		driver.findElement(By.xpath("//input[@class='inputtext _58mg _5dba _2ph-'][@name='lastname']")).sendKeys("testLastName");
		
		
		
		WebElement day=driver.findElement(By.xpath("//*[@id='day']"));
		
		Select dateOfBirth = new Select(day);
		dateOfBirth.selectByValue("10");

		
		WebElement month= driver.findElement(By.xpath("//*[@id='month']"));
		Select monthDropdown= new Select(month);
		
		monthDropdown.selectByIndex(2);
		
		
		WebElement year= driver.findElement(By.xpath("//*[@id='year']"));
		Select yearDropdown= new Select(year);
		
		yearDropdown.selectByVisibleText("2000");
		
		
		WebElement radioButton=driver.findElement(By.xpath("//input[@name='sex'][@id='u_0_7']"));
		
		if(radioButton.isDisplayed()==true){
		
			System.out.println("displayed...");
			radioButton.click();
			
		}else{
			
			System.out.println("radio is not displayed......");
		}
		
	}

}
