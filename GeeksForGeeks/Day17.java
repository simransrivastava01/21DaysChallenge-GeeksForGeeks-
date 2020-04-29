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
		    int count=0;
		    int n=obj.nextInt();
		    
		    for(int i=2;i<=n;i++)
		    {
		        if(n%i==0)
		        {count++;}
		    }
		    if(count==1)
		    {System.out.println("1");}
		    else
		    {System.out.println("0");}
		}
	}
}