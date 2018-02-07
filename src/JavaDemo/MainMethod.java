package JavaDemo;

import java.util.ArrayList;
import java.util.List;

public class MainMethod {

	public static void main(String[] args) {
		
		
		/*try {
			
			FileInputStream f = new FileInputStream(new File("C:\\Users\\WINDOWS 8\\Desktop\\FileHandling.txt"));
			System.out.println("this is try block.....");
		
			
		} catch (FileNotFoundException e) {
			
			System.out.println("Catch block....File not Found exception.....");
		}
		
		
		

		finally
		{
			System.out.println("finally block......");
		}*/
		
		
		
		
		List<String> list  = new ArrayList<String>();
		
		list.add("Naresh");
		list.add("Raghu");
		list.add("Pawan kalyan");
		list.add("prabha");
		list.add("mb");
		
		
		for(String name:list){
			
			System.out.println("Name is :"+name);
		}
		
		/*
		for(int i=0;i<list.size();i++){
			
			
			String asdfadfasdfa=list.get(i);
			System.out.println("Name is :"+asdfadfasdfa);
			
		}*/
		

	}

}
