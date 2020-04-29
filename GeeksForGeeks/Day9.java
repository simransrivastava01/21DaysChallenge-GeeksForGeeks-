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
		int multiplier=1;
	    int d=0;
	    int num1=0;
	    int num2=0;
	    int n1=obj.nextInt();
	    int n2=obj.nextInt();
	    
		while(n1>0)
		{
		    d=n1%10;
		    num1=num1+d*multiplier;
		    multiplier=multiplier*2;
		    n1=n1/10;
		}
	  d=0;
	  multiplier=1;
		while(n2>0)
		{
		    d=n2%10;
		    num2=num2+d*multiplier;
		    multiplier=multiplier*2;
		    n2=n2/10;
		}
		System.out.println(num1*num2);
	   }
	}
}