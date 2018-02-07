package SeleniumDemo;

import org.testng.annotations.Test;

import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class TestNGDemo {
	
	@Test(priority=1)
	public void display(){
		
		System.out.println("Hey this will display something...");
	}
	
	@Test(priority=2)
	public void show(){
		System.out.println("THis is show method ...");
	}

	@SuppressWarnings("deprecation")
	@Test(priority=3)
	public void failureCase(){
		
		System.out.println("This should fail");
		Assert.assertEquals(2, 3);
	}
	
	@Test(priority=4)
	public void addition(){
		System.out.println("THis adds two number ...");
	}
	
}
