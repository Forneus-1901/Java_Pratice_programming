package test;

import java.util.Scanner;

public class Reverse_combine_character_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner abc=new Scanner(System.in);
		System.out.println("enter the size");
		int size=abc.nextInt();
		char[] arr=new char[size];
		int j=0;
		for ( int b=0; b<arr.length;b++) {
			System.out.println("enter the value in character "+b);
			 char c=abc.next().charAt(0);
			
			if(c>=65 && c<=90 || c>=97 && c<=122) {
				arr[j]=(char)c;
				j++; 
			}
			
			else {
				System.out.println("");
				System.out.println("SORRY PLEASE ENTER CHARACTER OR CHARACTER INTGER  VALUE");
			}
			

			System.out.println("");
			}	

		for ( int b=0; b<j;b++) {
			System.out.println("int ["+b+"] arr="+arr[b]);
		}

		
		for ( int b=0; b<j;b++) {
			System.out.print(arr[b]);
		}

		int c=j;
		j=j-1;
		char[] str=new char[c];
		System.out.println("");
		for ( int b=0; b<c;b++) {
			
			str[b]=arr[j];
			j--;
			
			System.out.print(str[b]);
	}
		System.out.println("");
		for ( int b=0; b<str.length;b++) {
			System.out.println("int ["+b+"]str="+str[b]);
		}

		
			
	}
}

