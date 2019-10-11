
import java.util.*;
public class prog1 {

	public static void main(String[] args) throws Exception {
		
Scanner s=new Scanner(System.in);
int t=s.nextInt();
for(int i=0;i<t;i++)
{
	int n=s.nextInt();
	int k=s.nextInt();
	int[] a=new int[n];
	for(int j=0;j<n;j++)
	{
		a[j]=s.nextInt();
	}
	Arrays.sort(a);
	if(k<=a[0])
	{
		System.out.println(0);
	}
	else
	{
		System.out.println(k-a[0]);
	}
}
	}

}
