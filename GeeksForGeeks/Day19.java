/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner obj = new Scanner(System.in);
		int t=obj.nextInt();
		for(int k=0;k<t;k++)
		{
		    int n=obj.nextInt();
		    int arr[]=new int[n];
		    int count=0;
		    int value=0;
		    for(int i=0;i<n;i++)
		    {arr[i]=obj.nextInt();}
		    
		    for(int i=0;i<n;i++)
		    {
		        count=0;
		        for(int j=0;j<n;j++)
		        {
		            if(arr[i]==arr[j])
		            {count++;}
		        }
		        if(count==1)
		        {value=arr[i];
		            break;}
		    }
		    System.out.println(value);
		}
	}
}