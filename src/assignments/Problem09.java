package assignments;


import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Problem09 {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	 List<Integer> list = Arrays.asList(3, 4, 6, 12, 20);  //store input values in an array
	 
	 System.out.print(list);
	 System.out.println();
	 
	 System.out.println("Enter number to check: ");
	 int n1= sc.nextInt();       //enter a number to check if it is present in an array
	 
	 boolean answer = list.stream().anyMatch(n -> n == n1); //anyMatch function to check the entered number with the array elements,store true if match found else false
	 
	 System.out.println(answer);  //print the answer
	 
	 
}
}

