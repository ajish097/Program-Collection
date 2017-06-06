import java.util.*;


public class StackImplimentation {
	int max = 50;
    int arr[] = new int[max];
    int top = -1;
	static Scanner S = new Scanner(System.in);
	public void push(int x) {
		if (top == max-1) {
			System.out.println("Stack overflow");
			return;
		}
		//top++;
		arr[++top] = x;
	}
	
	public int pop() {
		if (top == -1) {
			System.out.print("Stack underflow");
			return 0;
		}
		//top--;
		return arr[--top];
	}
	
	public void display() {
		System.out.println("The contents of the stack is");
		for(int i=top; i>=0; i--){
			System.out.println(arr[i]);
		}
	}
	public static void main(String[] args) {
		StackImplimentation obj = new StackImplimentation();
		while (true) {
			System.out.println("Enter your choice\n1.To push an element\n2.To pop an element\n3.To display the contents of stack");
		    int choice = S.nextInt();
		    switch(choice){
		          case 1 : System.out.println("Enter the element you want to enter into the stack : ");
		                   int x = S.nextInt();
                           obj.push(x);break;
		          case 2 : int element = obj.pop();
		                   System.out.println("The popped element is : " + element);break;
		          case 3 : obj.display();break;
		          case 4 : return ;
		    }
		}
		
   }

}
