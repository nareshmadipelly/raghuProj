package JavaDemo;

public class AdvancedMobile extends NewMobilePhone {

	public AdvancedMobile() {
		
		System.out.println("this is construcotr...");
	}
	
	public static void main(String[] args) {
		
		AdvancedMobile obj = new AdvancedMobile();
		
		obj.call();
		obj.frontCamera();
		obj.autoMessage();
		obj.phoneShouldDance();

	}

	
	public void phoneShouldDance() {
		
		System.out.println("my phone is dancing...");
		
	}

}
