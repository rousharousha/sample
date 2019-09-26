import java.util.*;
public class Pro5 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int k=s.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++)
		{
			switch(s.next().charAt(0))
			{
			case 'g':a[i]=0;
			break;
			case 'r':a[i]=1;
			break;
			case 'y':a[i]=2;
			break;
			}
		}
		int j,l,r=0;
		for(int i=0;i<n;i++)
		{
			int x=0;
			if((i+k-1)<n)
			{
				j=i+k-1;
			}
			else
			{
				j=n;
			}
			l=i;
			switch(a[l]%3)
			{
			case 0:x=x+0;r=r+0;
			break;
			case 1:x=x+2;r=r+2;
			break;
			case 2:x=x+1;r=r+1;
			break;
			}
			l++;
			while(l<=j&&l<n)
			{
				a[l]=a[l]+x;
				l++;
			}
		}
		System.out.println(r);
	}
}
