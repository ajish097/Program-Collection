import java.util.*;
public class QuickDemo {
	
	static Scanner S = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("Enter the number of elements");
		int n = S.nextInt();
		int A[] = new int[n];
		Random R = new Random();
		for(int i=0; i<n; i++){
			A[i] = R.nextInt(100);
			System.out.print(A[i]+" ");
		}
		
		//System.out.println("pass");
		QuickDemo obj = new QuickDemo();
		double st = System.nanoTime(); 
		obj.Partition(A,0,n-1);
		double et = System.nanoTime();
		double totaltime = (et-st)/ 1000000;
		System.out.println("Sorted array is ");
		for(int i=0; i<n; i++){
			System.out.print(A[i]+" ");
		}
		System.out.println();
		System.out.println("Total time take is : " + totaltime);

	}
	
	
	public void Partition(int A[], int low, int high){
		if(low < high) {
			System.out.println("pass");
			int pi = QuickSort(A,low,high);
		    Partition(A,low,pi-1);
			Partition(A,pi+1,high);
		}
	}
	
    int QuickSort (int A[], int low, int high) {
  		int i = low;
		int j = high;
		int temp;
		int pivot=A[low];
		
		while(i < j) {
		     while(A[i]<=pivot && i<=high && j>1)
			 i++;
			 while(A[j]>pivot && j>=low && j>=1)
			 j--;
				
			   if(i < j){
			     temp = A[i];
			     A[i] = A[j];
			     A[j] = temp;
			  }
		}
			temp = A[j];
			A[j] = pivot;
			pivot = temp;
			return j;
	  }
}

