package test;

import java.util.Scanner;
public class  Array_asc_desc{
	public static void main(String args[]){
		Scanner abc=new Scanner(System.in);
		System.out.println("enter the size");
		int size=abc.nextInt();
		int arr[]=new int[size];


		for ( int b=0; b<arr.length;b++) {
			System.out.println("enter the value to keep in "+b);
			arr[b]=abc.nextInt();
		}
		for ( int c=0; c<arr.length;c++) {
			int b=0;
			b=c;
			for ( ; b<arr.length;b++) {
				if(arr[c]>arr[b]){
					int subsitute=arr[c];
					arr[c]=arr[b];
					arr[b]=subsitute;
				}
			} 
		}
		for ( int c=0; c<arr.length;c++) {
			System.out.println("int arr["+c+"]="+arr[c]);
		}

		

	}
}