import java.util.*;
public class Customer {
	String Name;
	String DOB;
	static Scanner S = new Scanner(System.in);
	
	public void GetInfo() {
		System.out.println("Enter the Name: ");
		Name = S.nextLine();
		System.out.println("Enter the Date of birth: ");
		DOB = S.nextLine();
	}
	public void PrintInfo() {
	//	Customer C = new Customer();
		StringTokenizer St = new StringTokenizer(DOB,"/");
		System.out.print("<"+ Name);
		while(St.hasMoreTokens()) {
			System.out.print("," + St.nextToken());
		}
		
        System.out.print(">");
	}
	
	public static void main(String[] args) {
		Customer C = new Customer();
		
		C.GetInfo();
		
		C.PrintInfo();

	}

}
