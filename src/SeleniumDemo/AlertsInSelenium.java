package SeleniumDemo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertsInSelenium {

	public AlertsInSelenium(){
		
	}
	public static void main(String[] args) throws InterruptedException, IOException {
	
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\WINDOWS 8\\Downloads\\geckodriver-v0.18.0-win64\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver(); 

		getScreenShot(driver,"browserSS");
		driver.get("https://www.ksrtc.in/oprs-web/");
		
		
		driver.findElement(By.xpath("//input[@id='searchBtn']")).click();
		
		Alert alert=driver.switchTo().alert();
		
		getScreenShot(driver,"thirdscreenshot");
		
		String actualAlertText=alert.getText();
		
		String expectedAlertText ="Please select start place.";
		
		System.out.println("Alert text is :"+actualAlertText);
		
		Assert.assertEquals(expectedAlertText, actualAlertText);
		
		Thread.sleep(3000);
		
		alert.accept();
		
		Thread.sleep(3000);
		
		driver.quit();
	}
	
	public static void getScreenShot(WebDriver driver,String fileName) throws IOException{
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File screenShot=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenShot, new File("C:\\Users\\WINDOWS 8\\Desktop\\screenshots\\"+fileName+".png"));
	}

}
