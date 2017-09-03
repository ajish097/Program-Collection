/*This program implements kruskals algorithm by union-find method.*/
import java.util.*;
class Graph{
	int src;
	int dest;
	int weight;
}
public class Kruskals {
	void sort(Graph G[],int n) {                     /*sorting method*/
		for (int i = 0; i < n-1;i++) {
			for (int j = 0; j < n-i-1; j++) {
				if(G[j].weight>G[j+1].weight){
					Graph temp = G[j];
					G[j] = G[j+1];
					G[j+1] = temp; 
				}
			}
	    }
    }
	int find_set(int set[],int node){               /*finds the parent of the node*/
		if (set[node]==-1) 
			return node;
		return find_set(set,set[node]);
	}	  
    static Scanner S = new Scanner(System.in);	 
	public static void main(String[] args) {
		Kruskals K = new Kruskals();
		Graph G[] = new Graph[100];
		int set[] = new int[100];
	    System.out.println("Enter the value of n ");
		int n = S.nextInt();
		for (int i = 0; i < n; i++) {
			set[i]=-1;
		}
		System.out.println("Enter the egde and weight");     // Reading input
		for (int i = 0; i < n; i++) {
			     G[i] = new Graph();
			     G[i].src = S.nextInt();
			     G[i].dest = S.nextInt();
			     G[i].weight= S.nextInt();
		}
		
		K.sort(G,n);
		int total_wt = 0;
		System.out.println("Output");
		for (int i = 0; i < n; i++) {
			int x = K.find_set(set,G[i].src);
			int y = K.find_set(set,G[i].dest);
			if(x==y)
				continue;
			set[x] = y;
			total_wt += G[i].weight; 
			System.out.println(G[i].src + " " + G[i].dest+ " with weight "+ G[i].weight + " added");
		}
		System.out.println("Total weight is " + total_wt);
	}

}

/*
Enter the value of n 
14
Enter the egde and weight
0 1 4
0 7 8
3 5 14
1 7 11
1 2 8
7 6 1
7 8 7 
2 8 2
8 6 6
2 5 4
6 5 2
2 3 7
3 4 9
5 4 10
Output
7 6 with weight 1 added
2 8 with weight 2 added
6 5 with weight 2 added
0 1 with weight 4 added
2 5 with weight 4 added
2 3 with weight 7 added
0 7 with weight 8 added
3 4 with weight 9 added
Total weight is 37
*/