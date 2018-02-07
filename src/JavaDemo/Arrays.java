package JavaDemo;

import java.util.ArrayList;
import java.util.List;

public class Arrays {

	public static void main(String[] args) {
		
		
		//what is an array - which store different values of same data types
		
		
	/*	int a[]= new int[100];
		
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=70;
		a[4]=50;
		a[5]=60;
		
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}
		*/
		
		// collections-------
		
		ArrayList<Integer> list = new ArrayList<Integer>();

		
		List<Integer> list3 = new ArrayList<Integer>();
		
		
		
		// Integer - data type - Generic
		ArrayList<String> list2 = new ArrayList<String>();
		
		list.add(100);
		list.add(100);
		list.add(100);
		list.add(100);
		list.add(100);
		
		//list.add(600);
		
		list2.add("Naresh");
		list2.add("raghu");
		
		for(int i=0;i<list.size();i++){
			
			int value=list.get(i);
			
			System.out.println(value);
		}
			
	}

}
