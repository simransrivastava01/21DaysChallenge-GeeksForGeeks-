// { Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;


 // } Driver Code Ends
/*This is a function problem.You only need to complete the function given below*/
//User function Template for Java
class Geeks{
    
    // Function to take input using Scanner class
    static void IOFunction(){
        Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t-- > 0){
		    
		    // Your code here
		    int i=sc.nextInt();
		    float f=sc.nextFloat();
		    long l=sc.nextLong();
		    byte b=sc.nextByte();
		    sc.nextLine();
		    String s=sc.nextLine();
		    
		    System.out.println(i);
		    System.out.println(f);
		    System.out.println(l);
		    System.out.println(b);
		    System.out.println(s);
		    
		    
		}
		
    }
    
}