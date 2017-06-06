import java.util.Scanner;

public class Staff {
	String name;
	String staff_id;
	int salary;
	int ph_no;
	static Scanner S = new Scanner(System.in);
	
	public void GetInfo() {
		System.out.println("Enter the name: ");
		name = S.next();
		System.out.println("Enter the staff_id: ");
		staff_id = S.next();
		System.out.println("Enter the salary: ");
		salary = S.nextInt();
		System.out.println("Enter the ph_no: ");
		ph_no = S.nextInt();
	}
	
	public void PrintInfo() {
		System.out.println("The name is : "+ name);
		System.out.println("The staff_id is : "+ staff_id);
		System.out.println("The salary is : "+ salary);
		System.out.println("The phone no is : "+ ph_no);
	}
	public static void main(String[] args) {
		System.out.print("Enter the number of employee : ");
		int n = S.nextInt();
		//Staff[] Staff_Object = new Staff[n];
		Teaching[] Teaching_object = new Teaching[n];
		Contract[] Contract_Object = new Contract[n];
		Technical[] Technical_Object = new Technical[n];
		
		for (int i=0; i<n; i++) {                               //loop to get info of Teaching_object class
			Teaching_object[i]= new Teaching();
			Teaching_object[i].GetInfo();
		}
		
		for (int i=0; i<n; i++) {                               //loop to get info of Contract_Object class
			Contract_Object[i] = new Contract();
			Contract_Object[i].GetInfo();
		}

		for (int i=0; i<n; i++) {                               //loop to get info of Staff Technical_Object class
			Technical_Object[i] = new Technical();
			Technical_Object[i].GetInfo();
		}
		
		for (int i=0; i<n; i++) {                               //loop to print info of Teaching_object class
			Teaching_object[i].PrintInfo();
		}
		
		for (int i=0; i<n; i++) {                               //loop to print info of Contract_Object class
			Contract_Object[i].PrintInfo();
		}

		for (int i=0; i<n; i++) {                               //loop to print info of Staff Technical_Object class
			Technical_Object[i].PrintInfo();
		}
	}

}

class Teaching extends Staff {
	String domain;
	String publication;
	
	public void GetInfo() {
		super.GetInfo();
		System.out.println("Enter the Domain: ");
		domain = S.next();
		System.out.println("Enter the publication: ");
		publication = S.next();
	}
	
	public void PrintInfo() {
		super.PrintInfo();
		System.out.println("The domain is : "+ domain);
		System.out.println("The publication is : "+ publication);

	}
}

class Technical extends Staff {
	String skill;
	
	public void GetInfo() {
		super.GetInfo();
		System.out.println("Enter the Skill: ");
		skill = S.next();
	}
	
	public void PrintInfo() {
		super.PrintInfo();
		System.out.println("The skill is : "+ skill);
    }
}

class Contract extends Staff {
	int period;
	
	public void GetInfo() {
		super.GetInfo();
		System.out.println("Enter the period: ");
		period = S.nextInt();
    }
	
	public void PrintInfo() {
		super.PrintInfo();
		System.out.println("The period is : "+ period);
    }
	
}
