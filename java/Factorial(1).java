import java.util.Scanner;


public class Factorial {
	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		System.out.print("Enter the number: ");
        int  n = S.nextInt();
		int fact=factorial(n);
		System.out.print("The factorial of the number is: "+fact);
		

	}

	public static int factorial(int n) {
		if(n<=1)
			return 1;
		return n*factorial(n-1);
		
	}
}
