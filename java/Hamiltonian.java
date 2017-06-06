import java.util.Scanner;
public class Hamiltonian
{
	static boolean found=false;
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of vertices");
		int n=sc.nextInt();
		int g[][]=new int[n+1][n+1];
		int x[]=new int[n+1];
		System.out.println("enter adjacency matrix");
		for(int i=1;i<=n;i++)
			for(int j=1;j<=n;j++)
				g[i][j]=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			x[i]=0;
		}
		x[1]=1;
		System.out.println("solution is");
		hamil(2,g,x,n);
		if(found==false)
			System.out.println("no solution");
		
		sc.close();
		
	}

	static void hamil(int k,int g[][],int x[],int n)
	{
		while(true)
		{
			next(k,g,x,n);
			if(x[k]==0)
				return;
			if(k==n)
			{
				for(int i=1;i<=n;i++)
					System.out.print(x[i]+" ");
				System.out.print(x[1]);
				System.out.println();
				found=true;
			}
			else
				hamil(k+1,g,x,n);
			
			}
		}
	
	static void next(int k,int g[][],int x[],int n)
	{
		while(true)
		{
			x[k]=(x[k]+1)%(n+1);
			if(x[k]==0)
				return;
			if(g[x[k-1]][x[k]]!=0)
			{
				int j;
				for(j=1;j<=k-1;j++)
					if(x[k]==x[j])
						break;
				if(j==k)
					if((k<n)||(k==n)&&g[x[n]][x[1]]!=0)
					return;
				
					
			}
			
		}
	}
}