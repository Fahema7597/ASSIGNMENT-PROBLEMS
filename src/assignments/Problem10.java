package assignments;

public class Problem10 {

	public static void main(String[] args)
	{
	
	int[] input1 = {1,5,10,20,40,80};  //store array values in variable input1
		
    int[] input2 = {6,7,20,80,100};   //store array values in variable input2
    
    int[] input3 = {3,4,15,20,30,70,80,120};  //store array values in variable input3
    
    
    //print the input1 array values using for loop
	System.out.print("Input1: ");	 
	for(int i=0; i<input1.length; i++) 
	{
		System.out.print(input1[i]+ " ");
	
	}
	System.out.println();
	
	//print the input2 array values using loop
	System.out.print("Input2: ");
	for(int j=0; j<input2.length; j++)
	{
		System.out.print(input2[j]+ " ");
	}
	System.out.println();
	
	//print the input3 array values using loop
	System.out.print("Input3: ");
	for(int k=0; k<input3.length; k++)
	{
		System.out.print(input3[k]+ " ");
	
	}
	System.out.println();
	
	//print the common elements using loops
	//compare each elements of an array with every other elements of an array using for loop
	System.out.print("OUTPUT= ");
	for(int i=0; i<input1.length; i++)      
	{
		for(int j=0; j<input2.length; j++)
		{
			for(int k=0; k<input3.length; k++)
			{
				if(input1[i]==input2[j] && input1[i]==input3[k]) //if input1 element equals to input2 and input3 element, then it gets printed
				{
					System.out.print(input1[i] + " ");
				}
		     }
		
	    }
	}
    }
}