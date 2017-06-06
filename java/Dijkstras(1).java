import java.util.*;


public class Dijkstras {
	static Scanner S = new Scanner(System.in);
	static int min(int x,int y){                       /*function to return minimum*/
		return (x < y)?x:y;
	}
	
	public static void main(String[] args) {
		System.out.print("Enter the value of n");
		int n = S.nextInt();
		//int adj[][] = new int[n][n];
		int visit[] = new int[n];
		int d[] = new int[n];
		int cost[][] = new int[n][n];
		for (int i = 0; i < n; i++) {
				visit[i] = 0;
				d[i] = 999;
		}
		System.out.println("Enter the weighted matrix");
		for(int i = 0; i < n; i++) {
			for(int j = 0; j< n;j++) {
				cost[i][j] = S.nextInt();
			}
		}
		System.out.println("Enter the source vertex");
		int source = S.nextInt();
		visit[source] = 1;
		d[source] = 0;
		int u = source;
		int v;
		for (int count = 0;count < n-1;count++) {
			int min = 999;
			for (v = 0; v < n; v++) {
				if (visit[u] == 1 && visit[v] == 0) {
					d[v] = min(d[v],d[u]+cost[u][v]); 
				}
			}
			
			for(v = 0;v < n; v++){
				if(d[v] <= min && d[v]!=0 && visit[v] == 0) {
					min =d[v];
					u = v;
				}
			}
				visit[u] = 1;
		}
		for (int i = 0;i < n;i++) {
			 System.out.println("Dist from " + source + " to " + i + " is " + d[i]);
		}
   }
}