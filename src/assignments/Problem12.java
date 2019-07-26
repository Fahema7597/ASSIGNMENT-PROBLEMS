package assignments;

import java.util.ArrayList;
import java.util.Collections;

public class Problem12 {

	public static void main(String[] args)
	{
		
	    System.out.print("Input Array:");
		//create an array object to store array values
		ArrayList<Integer> array = new ArrayList<Integer>(); 
		
		
		//values are added to array
		array.add(1);
		array.add(6);
		array.add(73);
		array.add(65);
		array.add(5);
		array.add(100);
		
		//print array elements
		System.out.println(array);
		
		//sort the array values in ascending order
		Collections.sort(array);
		System.out.println("Sorted Array:"+ array);
		
		//get the second largest element 
		int secondlargest = array.get(array.size() - 2); 
		
		System.out.print("Second largest element: ");
		System.out.print(secondlargest);
		
		System.out.println();
		
		//get the second smallest element 
		int secondsmallest = array.get(0 + 1); 
		
		
		System.out.print("Second smallest element: ");
		System.out.print(secondsmallest);

	}
}