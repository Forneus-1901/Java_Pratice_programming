package test;

public class FACTORIAL_FUNCTION {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int a=0;a<25;a++) {
			System.out.println("f["+a+"]="+method(a));
		}
		
	}
	static long method(int a) {
		long f=1;
		while(a>1) {
			f=f*a--;
		}
		return  f;
		
	}
}
/*
package test;
import java.io.*;
import java.util.*;
public class Pratice_for_book_example  {
	public static void main(String args[]) {
		Scanner abc=new Scanner(System.in);
		System.out.println("enter the number till you want factorial");
		int factorial_number_end=abc.nextInt();
		for(int a=1;a<=factorial_number_end;a++) {
			int m=a;
			for(int d=a;d>=1;) {
				--d;
				if(d==0) {
					break;
				}
				m=m*(d);
			}
			System.out.println("f("+a+")="+m);
		}
	}
}
/*

f(1)=1
f(2)=2
f(3)=6
f(4)=24
f(5)=120
f(6)=720
f(7)=5040
f(8)=40320


 */