package test;
import java.util.Scanner;
public class loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner abc=new Scanner(System.in);	

		System.out.println("enter the table you want");	
		int a=abc.nextInt();

		System.out.println("enter the start range of table");	
		int b=abc.nextInt();

		System.out.println("enter the end range of table");	
		int c=abc.nextInt();
		if(b>=c) {
		System.out.println("the number must be greater than");
	}
		for(;b<=c;b++) {
		//	System.out.println("the number must be greater than");
			System.out.println(  a+" x "+b+ " = " +(a*b));

		}
	
	//if (b>=c) {
		//System.out.println("the number must be greater than");
	}
	
	
	}
