// { Driver Code Starts
//Initial Template for Java
//Initial Template for C++

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class GFG {
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
		    int n =sc.nextInt();
		    Geeks obj=new Geeks();
		    obj.isPrime(n);
		}
	
		
	}
}


 // } Driver Code Ends
/*This is a function problem.You only need to complete the function given below*/
//User function Template for Java
//Back-end complete function Template for Java
class Geeks {
	 static void isPrime (int n) 
	 {
	     int count=0;
            for(int i=2;i<=n;i++)
            {
                //Your code here
                if(n%i==0)
                {count++;}
            }
            if(count==1)
            {System.out.print("Yes");}
            
            else 
            {System.out.print("No");}
            
        System.out.println();
	 }
}
