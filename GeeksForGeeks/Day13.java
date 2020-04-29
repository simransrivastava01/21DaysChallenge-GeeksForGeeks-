/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner obj = new Scanner(System.in);
		int t=obj.nextInt();
		for(int i=0;i<t;i++)
		{
		    int e=0;
		    int o=0;
		    int n=obj.nextInt();
		    for(int j=0;j<=n;j++)
		    {
		        if(j%2==0)
		        {e=e+j;}
		        else
		        {o=o+j;}
		    }
		    System.out.println(e +" " + o);
		}
	}
}