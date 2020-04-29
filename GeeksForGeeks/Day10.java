/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner obj = new Scanner(System.in);
		
		int t = obj.nextInt();
		obj.nextLine();
		for(int i=0;i<t;i++)
		{
		String s=obj.nextLine();
		System.out.println(s.toLowerCase());
		}
	}
}