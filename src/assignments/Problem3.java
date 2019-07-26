package assignments;

public class Problem3 
{
	char row= 'E'; //declare the number of rows to be entered 
	               // char declaration since to get the output in alphabet
	
	void pyramid()
	{  
		//print the rows
		for(char alphabet='A'; alphabet<=row; alphabet++ )  //for loop initialization,declaration and increment (iterate over rows)
		{ 
			//print the columns
			for(char alphabet1='A'; alphabet1<=alphabet; alphabet1++)  //for loop initialization,declaration and increment (iterate over columns)
			{
				System.out.print(alphabet + " ");
			}
			System.out.println();
		}
	}

	
	public static void main(String[] args)
	{
		Problem3 refProblem3 = new Problem3(); //create an object for class Problem3
		refProblem3.pyramid();  //refProblem3 object the method pyramid from class Problem3
	}
	
}