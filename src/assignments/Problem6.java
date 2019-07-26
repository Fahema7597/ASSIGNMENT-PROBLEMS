package assignments;

public class Problem6
{
	
	int n=5; //declare the number of rows to be entered
	int k=0; //initialize 0 to k
	void pyramid()
	{
		//print the rows
		for(int i=0; i<n; i++)  //for loop initialization,declaration and increment (iterate over rows)
		{
			//print the columns
			for(int j=0; j<=((i*2)-k);j++)  //for loop initialization,declaration and increment (iterate over columns)
			{
				System.out.print("* ");
				k=1;  //modify k value from 0 to 1
			}
			System.out.println();
		}
	}

	public static void main(String[] args)
	{
		Problem6 refProblem6 = new Problem6(); //create an object of class problem6
		refProblem6.pyramid(); //refProblem6 object calls the pyramid method of class problem6
	}
}
