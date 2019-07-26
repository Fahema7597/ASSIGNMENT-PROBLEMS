package assignments;

public class Problem5 
{

	int n=5;  //declare the number of rows to be printed
	
	void pyramid()
	{
		//print the rows
		for(int i=n; i>=1; i--)  //for loop initialization,declaration and increment (iterate over rows)
		{
			//print the columns
			for(int j=1; j<=i; j++)  //for loop initialization,declaration and increment (iterate over columns)
			{
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
	

	public static void main(String[] args)
	{
		Problem5 refProblem5 = new Problem5(); //create an object of class Problem5
		refProblem5.pyramid();  //refProblem5 object calls pyramid method of class Problem5
	}
}
