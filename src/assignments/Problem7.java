package assignments;

public class Problem7 {
public static void main(String[] args) {
	

	int n =5;
	
	
	for(int i=1; i<=n; i++)
	{
		int number=i;
		for(int j=1; j<=i; j++)
		{
			System.out.print(number);
			number = number +1;
		}
		number = number-2;
		for(int j=i-1; j>=1;j--)
		{
			System.out.print(number);
			number = number-1;
		}
		System.out.println();
	}
	
	}
}
