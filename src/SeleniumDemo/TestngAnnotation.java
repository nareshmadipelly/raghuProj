package SeleniumDemo;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestngAnnotation {
	
	
	@BeforeClass
	public void beforeClass(){
		System.out.println("Before Class");
	}
	
	@BeforeTest
	public void beforetest(){
		System.out.println("Before Test");
	}
	
	@BeforeMethod
	public void beforeMethod(){
		System.out.println("Before Method");
	}
	
	
	@AfterMethod
	public void aftermethod(){
		
		System.out.println("After Method");
		
	}
	
	@Test
	public void show(){
		
		System.out.println("Test1");
	}
	
	@Test
	public void show2(){
		
		System.out.println("Test2");
	}

	@AfterTest
	public void afterTest(){
	
		System.out.println("After Test");
	}
	
	
	
}
