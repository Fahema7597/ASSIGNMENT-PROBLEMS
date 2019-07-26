package assignments;

public class Problem1
{
	
	int n=4;    //declare the number of rows to be printed
	
	void pyramid()
	{
		//print the rows
		for(int i=1; i<=n; i++)  //for loop initialization,declaration and increment (iterate over rows)
		{   
			//print the columns
			for(int j=1; j<=i; j++) //for loop initialization,declaration and increment (iterate over columns)
			{
				System.out.print("* ");
			}
			System.out.println();
			System.out.println();
		}
	}
	

	public static void main(String[] args)
	{
		Problem1 refProblem1 = new Problem1(); //create an object for class Problem1
		refProblem1.pyramid(); //refProblem1 object calls pyramid method with object
	}
	
}