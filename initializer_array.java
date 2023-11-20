package test;

import java.util.Scanner;
public class initializer_array{
	
 public static void main (String args[]){
	Scanner abc=new Scanner(System.in);
	System.out.println( "enter the number how many times you want");
    int a=abc.nextInt();  
	 int[] arr = new int[a];
  for ( int b=0; b<arr.length;b++) {
System.out.println("enter the value to keep in "+b);
   int c=abc.nextInt();
   arr[b] = c;
  }
  for (int d=0;d<arr.length;d++) {
	    System.out.println("int["+d+"] arr="+arr[d]);
   }
}
}