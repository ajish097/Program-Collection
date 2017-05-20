/*This is an implementation of quicksort as done in CLSR.
The unsorted input array is given by generating random numbers.*/
import java.util.* ;
public class QuickSort {
    static Scanner S = new Scanner(System.in);
	public static void main(String[] args) {
		QuickSort Q = new QuickSort();
		System.out.println("Enter the number of elements");
		int n = S.nextInt();
		int Arr[] = new int[n];
		for (int i=0; i<n; i++) {
			Random R = new Random();
		    Arr[i] = R.nextInt(1000000);
		} 
		System.out.println();
		double t1 = System.nanoTime();                //Time before execution 
		Q.quicksort_function(Arr,0,n-1);
		double t2 = System.nanoTime();                //Time after execution
		for (int i=0; i<n; i++) {
		    System.out.print(Arr[i]+" ");
		}
		System.out.println();
		double ElapsedTime = (t2-t1)/1000000;
		System.out.println("The elapsed time is : "+ ElapsedTime +" milliseconds"); 
	}
	
	public void quicksort_function(int Arr[], int low, int high) {
		if (low < high) {
			int pivot = Partition(Arr, low, high);
			quicksort_function(Arr, low, pivot-1);
			quicksort_function(Arr, pivot+1, high);
		}
	}
    
	public int Partition(int Arr[], int low, int high){
		int pivot = Arr[high];
		int i = low-1;
		for(int j=low; j<high; j++) {
			if(Arr[j] <= pivot) {
				i++;
			    int temp = Arr[i];
				Arr[i] = Arr[j];
			    Arr[j] =temp;
			}
		}
		
		int temp = Arr[i+1];
		Arr[i+1] = Arr[high];
		Arr[high] = temp;
		return i+1;
	}
}
