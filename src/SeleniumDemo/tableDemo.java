package SeleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class tableDemo {
	
	@Test
	public void tableExample() throws InterruptedException{
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\WINDOWS 8\\Downloads\\geckodriver-v0.18.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver(); 
		driver.get("https://www.redbus.in/");
		driver.findElement(By.xpath("//*[@id='onward_cal']")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath(".//*[@id='rb-calendar_onward_cal']/table/tbody/tr[5]/td[7]")).click();
	}

}
