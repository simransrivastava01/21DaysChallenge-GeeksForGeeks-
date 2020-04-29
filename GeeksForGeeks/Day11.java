/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner obj = new Scanner(System.in);
		int t=obj.nextInt();
		obj.nextLine();
		for(int k=0;k<t;k++)
		{
		    String s=obj.nextLine();
		    int l=s.length();
		    
		    for(int i=l-1;i>=0;i--)
		    {
		        System.out.print(s.charAt(i));
		    }
		    System.out.println();
		}
	}
}