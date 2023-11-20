package test;

import java.util.Scanner;

public class first {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner abc =new Scanner (System.in);


		System.out.println("enter  the value of a");
		int a =  abc.nextInt();
		System.out.println("enter the value of b");
		int b= abc.nextInt();

		

	
		System.out.println("1.Add:");
		System.out.println("2. sub:");
		System.out.println("3. multiply:");
		System.out.println("4. divide:");

		
		System.out.println("enter your choice: ");
		int d=abc.nextInt();

		if(1==d) {
			int  add=a+b;
			
			System.out.println("a+b"+add);     
		}
		else if(2==d) {
			int sub= a-b;
			System.out.println("2. sub:");
			System.out.println("a-b"+sub);
		}
		else if(3==d) {
			int multiply=a*b;
			System.out.println("a*b"+multiply);
		}
		else if(4==d) {
			int divide=a/b;
			System.out.println("a/b"+divide);
		}
		else  {
			System.out.println("number is invalid");
		}

	}
	

}

