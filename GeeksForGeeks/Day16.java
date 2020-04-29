/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner obj = new Scanner(System.in);
		int t=obj.nextInt();
		for(int j=0;j<t;j++)
		{
		    int index=0;
		    int flag=0;
		    int n=obj.nextInt();
		    int k=obj.nextInt();
		    int arr[]=new int[n];
		    for(int i=0;i<n;i++)
		    {arr[i]=obj.nextInt();}
		    
		    for(int i=0;i<n;i++)
		    {
		        if(arr[i]<=k)
		        {flag=1;
		            index=i;}
		        else
		        {break;}
		    }
		    if(flag==1)
		    System.out.println(index);
		    else
		    System.out.println("-1");
		}
	}
}