import java.util.Scanner;
public class subsetsum {
	
	static int c=0;

	public static void main(String[] args) {
		
		int w[]=new int[10];
		int n,d,i,sum=0;
		int x[]=new int[10];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of elements");
		n=sc.nextInt();
		System.out.println("enter elements is increasing order");
		for(i=0;i<n;i++)
		{
			w[i]=sc.nextInt();
			
		}
		System.out.println("Enter value of d");
		d=sc.nextInt();
		for( i=0;i<n;i++)
		{
			sum=sum+w[i];
		}
		if(sum<d || w[0]>d)
		{
			System.out.println("Subset not possible");
			System.exit(0);
		}
		subset(0,0,sum,x,w,d);
		if(c==0)
			System.out.println("subset not possible");
		
	}
	
	static void subset(int cs,int k,int r,int x[],int w[],int d)
	{
		x[k]=1;
		if(cs+w[k]==d)
		{
			c++;
			System.out.print("solution "+c+" is {");
			for(int i=0;i<=k;i++)
			{
				if(x[i]==1)
					System.out.print(w[i]+",");
			
			}
			
			System.out.println("}");
		}
		else if((cs+w[k]+w[k+1])<=d)
			subset(cs+w[k],k+1,r-w[k],x,w,d);
		if((cs+r-w[k])>=d)
		{
			x[k]=0;
			subset(cs,k+1,r-w[k],x,w,d);
		}
		
		}
	}

