package test;


import java.io.*;
import java.util.*;
public class String_multiplication_without_any_inbuilt_and_typecasting_method {

	public static void main(String args[]) {
		Random random=new Random();
		Scanner abc=new Scanner(System.in);
		method(abc);
	}
	static int method( Scanner abc) {
		System.out.println("enter only number  in first string");
		String a=abc.next();
		System.out.println("enter only number  in second string");
		String b=abc.next();
		if(a.length()>=0 && b.length()>=0) {
			System.out.println("LETS START THE MULTIPLICATION OF STRING PROCESS");

		}
		else {
			System.out.println("YOU CANNOT KEEP STRING EMPTY");
			return method(abc);
		}
		int max=a.length();
		if(a.length()<b.length()) {
			max=b.length();
		}
		int min=b.length();
		if(a.length()<b.length()) {
			max=a.length();
		}

		char arr[]=new char[min];
		char str[]=new char[max];



		if(min==a.length()) {
		for(int d=0;d<arr.length;d++) {
			arr[d]=a.charAt(d);
		}
		}
		else {for(int d=0;d<arr.length;d++) {
			arr[d]=b.charAt(d);
		}
		}
		if(max==b.length()) {
		for(int d=0;d<str.length;d++) {
			str[d]=b.charAt(d);
		}
		}
		else {
			for(int d=0;d<str.length;d++) {
				str[d]=a.charAt(d);
			}
		}

		for(int d=0;d<arr.length;d++) {
			if((arr[d]-48)>=0 && (arr[d]-48)<=9) {}
			else {
				System.out.println(" ");
				System.out.println("AlERT !!!!!");
				System.out.println("ENTER INTEGER ONLY PLEASE");
				return method(abc);
			}
		}
		for(int d=0;d<str.length;d++) {
			if((str[d]-48)>=0 &&(str[d]-48) <=9) {}
			else {
				System.out.println(" ");
				System.out.println("AlERT !!!!!");
				System.out.println("ENTER INTEGER ONLY PLEASE");
				return method(abc);
			}
		}
		String one="1";
		String two="1";
		if(a.length()==b.length()) {
		for(int u=1;u<a.length();u++) {
			one=one+0;
		}
		for(int u=1;u<b.length();u++) {
			two=two+0;
		}
		}
		if(a.length()!=b.length()) {
			for(int u=1;u<max;u++) {
				one=one+0;
			}
			for(int u=1;u<min;u++) {
				two=two+0;
			}
			}
		//System.out.println(one+"====="+two);
		int t=0;
		int final_total=0;
		int total=0;
		int zero=str.length;
		int m=Integer.parseInt(one);
		int p=m;
		int n=Integer.parseInt(two);
		
		for(int c=0;c<arr.length;c++) {
			m=p;
			for(int f=0;f<str.length;f++) {
				t=(arr[c]-48)*(str[f]-48);
				t =t*m;
				total=total+t;
				m=m/10;
			}

			total=total*n;
			final_total=final_total+total;
			total=0;
			n=n/10;
		}

		System.out.println("Multiplication of both string ="+final_total);
	
		return 0;
	}	
}
/*package test;
import java.io.*;
import java.util.*;
public class Pratice_for_book_example  {
	public static void main(String args[]) {
		Random random=new Random();
		Scanner abc=new Scanner(System.in);
		System.out.println("enter only number  in first string");
		String a=abc.next();
		System.out.println("enter only number  in second string");
		String b=abc.next();
		
		char arr[]=new char[a.length()];
		char str[]=new char[b.length()];
		
		
		
		int max=a.length();
		if(a.length()<b.length()) {
			max=b.length();
		}
		for(int d=0;d<arr.length;d++) {
			arr[d]=a.charAt(d);
		}
		for(int d=0;d<str.length;d++) {
			str[d]=b.charAt(d);
		}
		int t=0;
		int final_total=0;
		int total=0;
		int zero=str.length;
		int m=10;
		int p=m;
		int n=1;
		for(int c=0;c<arr.length;c++) {
			m=p;
			for(int f=0;f<str.length;f++) {
				t=(arr[c]-48)*(str[f]-48);
				t =t*m;
				total=total+t;
				m=m/10;
			}

			total=total*n;
			final_total=final_total+total;
			total=0;
			n=n/10;
		}

		System.out.println("Multiplication of both string ="+final_total);
	}	
}
*/