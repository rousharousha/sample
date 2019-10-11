import java.util.*;
public class Pro4 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[] a=new int[n];
		int[] b=new int[n];
		int[] c=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		b[0]=a[0];
		for(int i=1;i<n;i++)
		{
			if(b[0]>a[i])
			{
				b[0]=a[i];
			}
		}
		int j=0,top=-1;
		for(int i=0;i<n;i++)
		{
			if(a[i]==b[j]+1)
			{
				j++;
				b[j]=a[i];
			}
			else if(top!=-1&&c[top]<a[i])
			{
				while(top!=-1&&c[top]<a[i])
				{
					j++;
					b[j]=c[top];
					top--;
				}
				top++;
				c[top]=a[i];
			}
			else if(a[i]!=b[0])
			{
				top++;
				c[top]=a[i];
			}
		}
		if(top!=-1)
		{
			while(top!=-1)
			{
				j++;
				b[j]=c[top];
				top--;
			}
		}
		int count=1;
		for(int i=0;i<n-1;i++)
		{
			if(b[i+1]==b[i]+1)
			{
				count++;
			}
		}
		
		if(count==n)
		{
			System.out.println("Happy");
		}
		else
		{
			System.out.println("Sad");
		}
	}

}
