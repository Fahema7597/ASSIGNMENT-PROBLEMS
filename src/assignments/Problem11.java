package assignments;

public class Problem11 {
	public static void main(String[] args)
	{
		int[] input = {1,2,3,1,2,3,4}; //store array elements in input variable
		
		System.out.print("INPUT = ");
		
		//print the array elements using for loop
		for(int i=0; i<input.length; i++)
		{
			System.out.print(input[i] + " ");
		}
		System.out.println();
		
		
		System.out.print("After removing duplicates= ");
		
		//print the unique elements of an array after removing duplicate elements
		for(int i=0; i<input.length; i++) //
		{
			boolean unique =false;  //false is stored to unique variable
			for(int n=i+1; n<input.length; n++)
			{
			if(input[i] == input[n])  //Each element of an array compared with every other element
			{
				 unique =true;       
				break;
			}
		}
		if(!unique)    //if false, excludes the duplicate elements and the unique elements get printed 
		{
			System.out.print(input[i] + " ");
		}
	
		}
	}
}
