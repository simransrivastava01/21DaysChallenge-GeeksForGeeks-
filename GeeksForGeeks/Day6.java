// { Driver Code Starts
//Initial Template for Java

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
		    obj.isDivisibleByPrime(n);
		}
	
		
	}
}

 // } Driver Code Ends
/*This is a function problem.You only need to complete the function given below*/
//User function Template for Java
//Back-end complete function Template for Java
class Geeks {
	 static void isDivisibleByPrime (int n) 
	 {
             //Your code here
         if(n%3==0 && n%2==0 && n%11==0)
       {System.out.println("Eleven");}
       
       else if(n%11==0 && n%3==0)
       {System.out.println("Eleven");}
       
       else if(n%2==0 && n%3==0)
       {System.out.println("Three");}
       
        else if(n%3==0)
       {System.out.println("Three");}
      
       else if(n%11==0 && n%2==0)
       {System.out.println("Eleven");}
       
        else if(n%2==0)
       {System.out.println("Two");}
       
       else if(n%11==0)
       {System.out.println("Eleven");}
    
       else
       {System.out.println("-1");}
	 }
}
