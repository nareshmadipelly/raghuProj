package SeleniumDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class tableDemoAdvance {
	
	@Test
	public void tableExample() throws InterruptedException{
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\WINDOWS 8\\Downloads\\geckodriver-v0.18.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver(); 
		driver.get("https://www.redbus.in/");
		driver.findElement(By.xpath("//*[@id='onward_cal']")).click();
		
		Thread.sleep(3000);
		
		List<WebElement> dates=driver.findElements(By.xpath(".//*[@id='rb-calendar_onward_cal']/table/tbody/tr/td"));
		
		
		for( WebElement date : dates){
			
			String calDate=date.getText();
			
			if(calDate.equalsIgnoreCase("19")){
			
				if(date.isEnabled())
				{
					date.click();
				}
			}
			
			System.out.println("Date is :"+calDate);
		}
		
		
		//driver.findElement(By.xpath(".//*[@id='rb-calendar_onward_cal']/table/tbody/tr[5]/td[7]")).click();
	}

}
