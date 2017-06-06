import java.util.*;
public class Travelling
{
	static int cost=0;
	public static void main(String args[]) 
	{
        int a[][]=new int[10][10];
        int visited[]=new int[10];
        int n;
        System.out.println("Enter the number of cities");
        Scanner s=new Scanner (System.in);
        n=s.nextInt();
        create(a,visited,n);
        System.out.println("The path is");
        mincost(a,n,0,visited);
        display();
	}
	public static void create(int a[][],int visited[],int n)
	{
        int i,j;
        System.out.println("Enter the cost matrix");
        for(i=0;i<n;i++)
        { 
        	System.out.println("Row"+(i+1));

                for(j=0;j<n;j++)
                {
                        Scanner sc=new Scanner(System.in);
                        a[i][j]=sc.nextInt();
                }
                visited[i]=0;
        }
        System.out.println("The cost Matrix is" );
        for(i=0;i<n;i++)
        {
                System.out.println("\n");
                for(j=0;j<n;j++)
                        System.out.println(" "+a[i][j]);
         }
    
	}


	public static void mincost(int a[][],int n,int city,int visited[])
	{
		int cityno;
        visited[city]=1;
        System.out.print((city+1)+"-->");
        cityno=least(a,visited,n,city);
        if (cityno==999)
        {
                cityno=0;
                System.out.println(" "+ (cityno+1));
                cost+=a[city][cityno];
                return;
        }
        mincost(a,n,cityno,visited);
	}

	public static int least(int a[][],int visited[],int n,int c)
	{
         int i,minnode=999;
         int min=999,Newmin=0;
         for(i=0;i<n;i++)
         {
                  if((a[c][i]!=0) && (visited[i]==0))
                  {
                          if (a[c][i]<min)
                          {
                                 min=a[i][0]+a[c][i];
                                 Newmin=a[c][i];
                                 minnode=i;
                          }
                  }
         }
         if(min!=999)
          cost+=Newmin;
         return minnode;
	}
	public static void display()
	{
         System.out.println("Total cost of tour:" + cost);
	}
}

                                                                                                                         