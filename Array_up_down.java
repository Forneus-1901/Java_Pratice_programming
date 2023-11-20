package test;

import java.util.Scanner;
public class  Array_up_down{
public static void main(String args[]){
 Scanner abc=new Scanner(System.in);
   System.out.println("enter the size");
   int size=abc.nextInt();
   
     int arr[]=new int[size];
	 for ( int b=0; b<arr.length;b++) {
				System.out.println("enter the value to keep in "+b);
			    arr[b]=abc.nextInt();
			}
			for (int d=0;d<arr.length;d++) {
	    System.out.println("int["+d+"] arr="+arr[d]);
			
			}
/*		for(   int a=1;a<=arr[d];a++) {
			if(arr[d]%a==0) {
				//System.out.println(a);
				count++;
			}	}
	//System.out.println(count);
if(count>2||arr[d]==0||arr[d]==1) {
	System.out.println("not aprime");
}
else {	
	System.out.println("it is prime");
	}
	}
	}
}		
/*int str[]=new int[size];
 for (int d=0;d<arr.length;d++) {
	  str[d]= arr[d];
	   
			}
		for (int d=(size-1);d>-1;d--) {
	    System.out.println("int["+d+"] str="+str[d]);
			
			}*/	
	
	int str[]=new int[size];
	str = arr;
	System.out.println("New Final Array");
 for (int d=(size-1);d>-1;d--) {
	  //str[d]= arr[d];
	    System.out.println("int["+d+"] str="+str[d]);
			}
			
	}
}