// { Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;


 // } Driver Code Ends
/*This is a function problem.You only need to complete the function given below*/
//User function Template for Java
// Function to perform bitwise manipulations
// a, b and c are input integers
class Geeks{
    static void bitWiseOp(int a, int b, int c){
        
        // Your code here
    int d= a ^ a;
    int e = c ^ b;
    int f = a & b;
    int g = c | (a ^ a);
    System.out.println(d);
    System.out.println(e);
    System.out.println(f);
    System.out.println(g);
      e = ~e;
    System.out.println(e);
        
    }
}