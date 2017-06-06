import java.util.*;
public class Prims {
	static Scanner S = new Scanner(System.in);
	public void my_prim(int adj[][],int n,int visit[]) {
		int min = 999, min_cost = 0;
		int ne = 1,u = 0,v = 0;
		visit[0] = 1;
		while (ne < n){
			min=999;
		for ( int i = 0; i < n; i++) {
			if (visit[i]==1) {
				for (int j = 0; j< n; j++) {
					if (adj[i][j] < min && adj[i][j]!=0) {
						min = adj[i][j];
						u = i;
						v = j;
					}
				}
	 			
			}
		}
		
		if (visit[u]==1 && visit[v]==0) {
			visit[v] = 1;
			min_cost += min;
			ne++;
			
			System.out.println("Edge Selected is "  + u + "-" + v);
			System.out.println(min);
			adj[u][v] = adj[v][u] = 999;
			}
		}
		System.out.println("The min cost is " + min_cost);
	}

	public static void main(String[] args) {
		Prims P = new Prims();
		System.out.print("Enter the value of n");
		int n = S.nextInt();
		int adj[][] = new int[n][n];
		int visit[] = new int[n];
        for (int i = 0; i < n; i++) {
			visit[i] = 0;
		}
		System.out.println("Enter the weighted matrix");
		for(int i = 0; i < n; i++) {
			for(int j = 0; j< n;j++) {
				adj[i][j] = S.nextInt();
				
			}
		}
		
		P.my_prim(adj,n,visit);
	}

}
