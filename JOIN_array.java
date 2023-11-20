package test;

import java.util.Scanner;
public class  JOIN_array{
public static void main(String args[]){
 Scanner abc=new Scanner(System.in);
   System.out.println("enter the size");
   int size1=abc.nextInt();
   
     int arr[]=new int[size1];
	 for ( int b=0; b<arr.length;b++) {
				System.out.println("enter the value to keep in "+b);
			    arr[b]=abc.nextInt();
			}
			for (int d=0;d<arr.length;d++) {
	    System.out.println("int["+d+"] arr="+arr[d]);
			}
			
			 System.out.println("enter the size");
   int size2=abc.nextInt();
			
	 int str[]=new int[size2];
	 for ( int c=0; c<str.length;c++) {
				System.out.println("enter the value to keep in "+c);
			    str[c]=abc.nextInt();
			}
			for (int d=0;d<str.length;d++) {
	    System.out.println("int["+d+"] str="+str[d]);
			}
     int c=size1+size2;
	  System.out.println(c);
	 int[] all=new int[c];
  
		System.out.println("New Final Array");
 for (int d=0;d<size1;d++) {
	  all[d]= arr[d];
	    System.out.println("int["+d+"] final="+arr[d]);
			}
			int e=size1;
	for (int d=0;d<size2;d++) {
	  all[e]= str[d];
	    System.out.println("int["+e+"]  final="+str[d]);
			
			e++;
			}
			
			
}}