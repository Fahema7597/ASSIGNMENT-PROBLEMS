package assignments;

public class Problem4
{
	int n=4; //declare the number of rows to be printed
	
	void pyramid()
	{
		//print the rows
		for(int i=n; i>=1; i--)  //for loop initialization,declaration and increment (iterate over rows)
		{
			//print the rows
			for(int j=1; j<=i; j++)  //for loop initialization,declaration and increment (iterate over columns)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	

	public static void main(String[] args)
	{
		Problem4 refProblem4 = new Problem4(); //create an object for class Problem4
		refProblem4.pyramid(); //refProblem4 object calls pyramid method of class Problem4
	}

}
