import java.util.*;

public class KnapSack {
	
    static Scanner S = new Scanner(System.in);
		int i;
		int W_i;
	    int P_i;
	    int ratio;
	
	    public KnapSack(int i, int Weight, int Profit){
	    	this.i = i;
	    	this.W_i = Weight ;
	    	this.P_i = Profit ;
	    	this.ratio = P_i/W_i;
	    
       }
	
	public static  void main(String args[]) {
		int Weight,Profit;
		KnapSack K[] = new KnapSack[10];
		System.out.println("Enter the number of elements");
		int n = S.nextInt();
		for(int i=0; i< n; i++){
			System.out.println("Enter the Weight and Profit");
			Weight = S.nextInt();
			Profit = S.nextInt();
			K[i] = new KnapSack(i+1,Weight,Profit);
		}
		
		for(int i=0 ; i<n-1;i++) {
			for(int j = 0; j< n-i-1;j++){
				if(K[j].ratio<K[j+1].ratio){
					KnapSack temp = K[j];
					K[j]=K[j+1];
					K[j+1] = temp;
				}
			}
		}
		
		System.out.println("Enter the capacity");
		int capacity = S.nextInt();
		int profit =0;
		double x[] = new double[n];
		for(int j=0;j<n;j++)
			x[j]=0;
		
		int i=0;
		while (capacity >= K[i].W_i) {
			x[i]=1;
			capacity=capacity-K[i].W_i;
			profit+=K[i].P_i;
			
			System.out.println(profit+" "+x[i]);
			i++;
		}
		System.out.println(capacity);
		x[i] = capacity/K[i].W_i;
		System.out.println(x[i]);
		profit+=K[i].P_i*(x[i]);
		for(int z=0; z< n; z++){
			System.out.println(K[z].i+" "+K[z].ratio );
		}
		System.out.println(profit);
	}
	


}
