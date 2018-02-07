package JavaDemo;

public class FirstSession {

	
	static int s;  // x-global variable 
	
	public static void main(String[] args) {
	
		
		FirstSession obj = new FirstSession();
		
		//className variableName= new className();
		int z=obj.method1();
		
		obj.s=1000;
	
	
		System.out.println("sum is "+z);
		
		method2();
		
		//  Return types
		// a method can contain any return -- int, string , float, double
		// if a method is containing return of VOID- means it wont return anythign
		
		/*i=method1();
		System.out.println(i);*/

	}
	
	public int method1(){

		int k;
		int i=100;  // i - local variable
		int j=200;
		s=i+j;
		
		System.out.println("this is method1");
		return s;
		
	}
	public static void method2(){
		
		System.out.println("This is method 2");
		
	}
	

}
