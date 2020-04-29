// { Driver Code Starts
import java.util.*;
class MinSwaps{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
			int n = sc.nextInt();
			int[] a=new int[n];
			for(int i = 0; i<n ; i++){
				a[i]=sc.nextInt();
			}
			GfG g=new GfG();
			System.out.println(g.minSwaps(a,n));
		}
	}
}// } Driver Code Ends
/*This is a function problem.You only need to complete the function given below*/

class GfG
{
	public static int minSwaps(int[] arr, int N)
	{//add code here.
	
	int count=0,temp=0,min=0;
	
	for(int i=0;i<N;i++)
    {
      min=i;
      for(int j=i+1;j<N;j++)
      {
        if(arr[j]<arr[min])
        {min=j;}
      }
        if(min!=i)
        {
          temp=arr[min];
          arr[min]=arr[i];
          arr[i]=temp;
          count++;
        }
      }
   return count;
}
}