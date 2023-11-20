package test;

import java.util.Scanner;

public class Remove_odd_number_array {

	public static void main(String[] args) {
		Scanner abc=new Scanner(System.in);
		System.out.println("enter the size");
		int size=abc.nextInt();
		int arr[]=new int[size];
		
int j=0;
		for ( int b=0; b<arr.length;b++) {
			System.out.println("enter the value to keep in "+b);
			arr[b]=abc.nextInt();
		}

		for (int d=0;d<arr.length;d++) {
			System.out.println("int["+d+"] arr="+arr[d]);
		}
		int war[]=new int[size];
		
		for (int d=0;d<arr.length;d++) {
		
		if(arr[d]%2==0) {
			war[j]=arr[d];
			j++;
			
		}
		}
		int n=0;
		int str[]=new int[size];
		for (int d=0;d<arr.length;d++) {
			
		 if(arr[d]%2!=0) {
			str[n]=arr[d];
			n++;
		}
		}
		System.out.println();
		for (int d=0;d<j;d++) {
			System.out.println("int["+d+"] war="+war[d]);
		}
		
		System.out.println();
		for (int d=0;d<n;d++) {
			System.out.println("int["+d+"] str="+str[d]);
		}
		}
	}


