package test;

import java.util.Scanner;
public class Sum_of_array_elements{
	public static void main(String args[]){
	Scanner abc=new Scanner(System.in);
   System.out.println("enter the size");
   int size=abc.nextInt();
   int c=0;
     int arr[]=new int[size];
	 for ( int b=0; b<arr.length;b++) {
				System.out.println("enter the value to keep in "+b);
			    arr[b]=abc.nextInt();
			 c=c+arr[b];
			}
			for (int d=0;d<arr.length;d++) {
	    System.out.println("int["+d+"] arr="+arr[d]);
			}
			
				System.out.println("Sum of all elements="+c);
		
		
		
		
		
		
		
	}
}