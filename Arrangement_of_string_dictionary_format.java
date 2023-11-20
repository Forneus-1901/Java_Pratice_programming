package test;

import java.util.Scanner;

public class Arrangement_of_string_dictionary_format {

	public static void main(String[] args) {
		Scanner abc=new Scanner(System.in);
		System.out.println("enter the first sting");
		String S1=abc.next();
		System.out.println("enter the second sting");
		String S2=abc.next();
		System.out.println("enter the third sting");
		String S3=abc.next();
		int a=S1.compareTo(S2);
		int b=S1.compareTo(S3);
		int c=S2.compareTo(S3);
		System.out.println(a+", "+b+", "+c);

		if(a<0) {
			if(b<0) {
				if(c<0) { 
					System.out.println(S1+", "+S2+", "+S3);
				}
				else {
					System.out.println(S1+", "+S3+", "+S2);
				}
			}
			else {
				System.out.println(S3+", "+S1+", "+S2);
			}
		}
		else if(b<0) {
			System.out.println(S2+", "+S1+", "+S3);
		}
		else if(c<0) { 
			System.out.println(S2+", "+S3+", "+S1);
		}
		else {
			System.out.println(S3+", "+S2+", "+S1);
		}
	}

}
