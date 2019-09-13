package pblm1;
import java.util.*;
public class Pro2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s =new Scanner(System.in);
		int n=s.nextInt();
		int k=0;
		int[] a=new int[n+1];
		int[] b=new int[n+1];
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			int j=i+1;
			while((j<=n)&&(a[i]>a[j]))
			{
				j++;
			}
			if(j==n+1)
			{
				b[k]=a[i];
				k++;
			}
		}
		for(int i=0;i<k;i++)
		{
			System.out.print(b[i]+" ");
		}
	}

}
