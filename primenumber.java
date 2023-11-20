package test;
import java.util.Scanner;
public class primenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner abc=new Scanner(System.in);
		
		System.out.println("enter the no to know prime or not");
		int b=abc.nextInt();
		int a=1;
		int count = 0;
		for(  a=1;a<=b;a++) {
			if(b%a==0) {
				System.out.println(a);
				count++;
			}	}
	System.out.println(count);
if(count>2||b==0||b==1) {
	System.out.println("not aprime");
}
else {	
	System.out.println("it is prime");
	}}}