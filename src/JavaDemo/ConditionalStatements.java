package JavaDemo;

public class ConditionalStatements {

	public static void main(String[] args) {
		
		classAndobjectDemo obj = new classAndobjectDemo();
		
		int sum=obj.addition(70, 20);

		if(sum>50)
		{
			System.out.println("sum is greater than 50...");
		}
		else if(sum<50)
		{
			System.out.println("sum is less than 50....");
		}
		else if(sum==50){
			
			System.out.println("sum is 50....");
		}
		else
		{
			System.out.println("all failed....");
		}
		
	}

}
