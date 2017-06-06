import java.util.*;


public class MergeSort {
	static Scanner S = new Scanner(System.in);
	
	public static void main(String[] args) {
		MergeSort M = new MergeSort();
		System.out.println("Enter the number of elements");
		int n = S.nextInt();
		int A[] = new int[n];
		Random R = new Random();
		for(int i=0; i<n; i++){
			A[i] = R.nextInt(1000000);
			System.out.print(A[i]+" ");
		}
		System.out.println();
		double t1 = System.nanoTime();
		M.sort(A, 0, n-1);
		double t2 = System.nanoTime();
		double elapsedtime = (t2-t1)/1000000;
		System.out.println("The sorted array is" ); 
		for(int i=0; i<n; i++){
			System.out.print(A[i]+" ");
		}
		System.out.println();
		System.out.println("Elapsed Time is " + elapsedtime +" milliseconds" );
		
	}
	
	 void sort(int A[], int low, int high){
		
		int mid = (high+low)/2;
		if(low < high){
			sort(A, low, mid);
			sort(A, mid+1, high);
			Merge(A, low, mid , high);
		}
   }
	
    void Merge(int A[], int low, int mid, int high) {
		int n1,n2;
		n1 = mid-low+1;
		n2 = high-mid;
		int L[] = new int[n1];
		int R[] = new int[n2];
		for(int i=0; i<n1; i++) {                      /*copy left array*/
			L[i] = A[low+i];
		}
		for(int j=0; j<n2; j++) {                     /*copy right array*/
			R[j] = A[mid+1+j];
		}
		
		int i=0,j=0;
		int k = low;
		while(i < n1 && j < n2){
			if(L[i] < R[j]){
				A[k] = L[i];
				i++;
				k++;
			}
			else{
				A[k]= R[j];
				j++;
				k++;
			}
		}
		
		while (i < n1){
			A[k] = L[i];
			i++;
			k++;
		}
		
		while (j < n2){
			A[k] = R[j];
			j++;
			k++;
		}
	}

}
