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
		    int num=n;
		    int count=0;
		    int m=4;
		    int multi=1;
		    int flag=1;
		    for(int i=2;i<=n;i++)
		    {
		       count=0;
		       for(int j=2;j<=i;j++)
		       {
		           if(i%j==0)
		           {count++;}
		       }
		       if(m>0)
		       {
		           if(count==1)
		           {multi=multi*i;}
		           m--;
		       }
		       if(m==0)
		       {flag=1;}
		       else
		       {flag=0;}
		    } 
		       if(num==1)
		       {System.out.println("0");}
		       else if(flag==1 && num==multi)
		       {System.out.println("1");}
		       else
		       {System.out.println("0");}
		}
	}
}