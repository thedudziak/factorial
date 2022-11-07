package factorial;

import java.util.Scanner;
public class factorial {
	




		static int number ;
		int i;
		static int fact=1;
		
		static int factorial;
		static Scanner sc= new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter number");
		int number= sc.nextInt();  
		for (int i=1; i<=number; i++) {
			
			fact=fact*i;
		
		
	}
		System.out.print("The factorial is : "+fact);
	}
}
