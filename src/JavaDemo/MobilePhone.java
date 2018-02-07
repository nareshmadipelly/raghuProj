package JavaDemo;

abstract class MobilePhone {

	public void frontCamera(){
		
		System.out.println("phone has front camers");
	}
	
	public void call(){
		
		System.out.println("you call to others by using this method.");
	}
	
	 abstract void autoMessage();
	 
	 
	 /// features : you can not create object of absract class..
}
