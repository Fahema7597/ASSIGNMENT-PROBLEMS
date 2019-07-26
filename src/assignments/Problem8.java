package assignments;

public class Problem8 {

    int k=1; //initialize 1 to k
	void pyramid()
	{
		//print the rows
		for(int i=4; i>=0; i--) //for loop initialization,declaration and decrement (iterate over rows)
		{
			if(i==0)
			{
				k=0;
			}
			if(i != 0 && i!=4)  //print a new line for every rows except for row(i) 1 and row(i) 4
			{
				System.out.println();
			}
			//print the columns
			for(int j=0; j<=i*2-k; j++) //for loop initialization,declaration and decrement (iterate over columns)
			{
				System.out.print("* ");
			
			}
			
			System.out.println();
			}
	}

	public static void main(String[] args)
	{
		Problem8 refProblem8 = new Problem8(); //create an object for class Problem8
		refProblem8.pyramid(); //refProblem8 object calls the pyramid method of class Problem8
	}
}