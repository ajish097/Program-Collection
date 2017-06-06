import java.util.*;

public class Student {
	String name;
	String usn;
	String branch;
	int ph_no;
	static Scanner S = new Scanner(System.in);
	public void read() 
	{
		
		System.out.println("Enter the name: ");
		name = S.next();
		System.out.println("Enter the usn: ");
		usn = S.next();
		System.out.println("Enter the branch: ");
		branch = S.next();
		System.out.println("Enter the ph_no: ");
		ph_no = S.nextInt();
		
	}
	
	public static void main(String[] args) {
//		Scanner S= new Scanner(System.in);
		System.out.print("Enter the number of students : ");
		int n = S.nextInt();
		Student[] obj = new Student[n];
		for (int i=0; i<n; i++) {
			obj[i] = new Student();
			System.out.println("Enter the details of the " + i+1 + " student");
			obj[i].read();
		}
		
		for (int i=0; i<n; i++) {
			System.out.println("The name is: "+ obj[i].name);
			System.out.println("The usn is: "+ obj[i].usn);
			System.out.println("The branch is: "+ obj[i].branch);
			System.out.println("The phone no is: "+ obj[i].ph_no);
		}

		}

}
