package assignments;

public class Problem2 
{
	
	int n=5;  //declare the number of rows to be printed
	
	void pyramid()
	{   
		//print the rows
		for(int i=1; i<=n; i++) //for loop initialization,declaration and increment (iterate over rows)
		{
			//print the columns
			for(int j=1; j<=i; j++) //for loop initialization,declaration and increment (iterate over columns)
			{
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
	

	public static void main(String[] args)
	{
		Problem2 refProblem2 = new Problem2(); //create an object for class Problem2
		refProblem2.pyramid();  //refProblem2 object calls pyramid method from class Problem2
	}
	
}
