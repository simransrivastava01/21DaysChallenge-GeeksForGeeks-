/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner obj=new Scanner(System.in);
		int t=obj.nextInt();
		for(int i=0;i<t;i++)
		{
		    float sum=0;
		    int n=obj.nextInt();
		    int arr[]=new int[n];
		    
		    for(int j=0;j<n;j++)
		    {arr[j]=obj.nextInt();}
		    
		    for(int j=0;j<n;j++)
		    {
		        sum=sum+arr[j];
		    }
		    
		    System.out.print((int)sum + " ");
		    System.out.printf("%.2f",sum/n);
		    System.out.println();
		}
	}
}