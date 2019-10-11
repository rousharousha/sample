package pack;
import java.util.*;
public class RemoveFriends {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc= new Scanner(System.in);
     int N,K,T;
     int a[]= new int[100];
     int i,j;
     T=sc.nextInt();
     for(int x=0;x<T;x++)
     {
	     N=sc.nextInt();
	     K=sc.nextInt();
	     
	     for(i=0;i<N;i++)
	     {
	    	 a[i]=sc.nextInt();
	     }
	     int M=N;
	     for(i=0;i<K;i++)
	     {
	    	 
	    	 for(j=0;j<M;j++)
	    	 {
	    		 if(a[j]<a[j+1])
	    		 {
	    			 for(int k=j;k< M;k++)
	    			 {
	    				 a[k]=a[k+1];
	    			 }
	    			 M--;
	    			 break;
	    		 } 
	    	 }
	     }
	     
	     for(int k=0;k<M;k++)
	     {
	    	 System.out.print(a[k]+" ");
	    	 
	     }
	     System.out.println();
			
		}
 }
}
