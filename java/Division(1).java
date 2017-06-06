import java.util.Scanner;


public class Division {
	static int a;
	static int b;
	static int result;
	static Scanner S = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Enter the value of a and b");
	    a = S.nextInt();
		b = S.nextInt();
	
	try {
		result = a/b;
		
	}
	
	catch(Exception e) {
		System.out.print(e);
	}
	System.out.println(result);
  }
}
