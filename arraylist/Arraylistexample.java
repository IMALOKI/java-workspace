package arraylist;

import java.util.ArrayList;

public class Arraylistexample {

	public static void main(String[] args) {
		ArrayList obj=new ArrayList();// declaration
		//adding elements
		obj.add("hi");
		obj.add('d');
		obj.add(0.75);
		obj.add(true);
		obj.add(10);
		//find the size
		System.out.println(obj.size());//size of an arraylist
		//printing the elements
		System.out.println(obj);
		//to capture exact element
		System.out.println(obj.get(2));
		//addinng an element unn the middle of the arraylist
		obj.add(1,"ma");
		System.out.println(obj);
		//removing an element from the arraylist
		obj.remove(2);
		System.out.println(obj);
		//reading elements from the arraylist
		for(Object i:obj)
		{
			System.out.println(i);
		}
		
		
		
	}

}
