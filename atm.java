package test;
import java.util.Scanner;


public class atm {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=100000;
		calculate(a);
		System.out.println(a);
	
	}
	
		
	static void calculate(int data) {
		Scanner abc=new Scanner(System.in);
		
		
		System.out.println("1. addcash\n2.withdrawcash\n3.checkbalance\n4.exit");

		System.out.println("enter your choice");
		int b=abc.nextInt();
		
		int d=0;
		int c=0;
		switch(b){
		case 1:
			System.out.println("enter the amount you want to add");
			d=abc.nextInt();
			c=data+d;
//			a = c;
			System.out.println(c);
			calculate(c);
			break;
		case 2:
			System.out.println("enter the amount you want to withdraw");
			d=abc.nextInt();
			c=data-d;
			
			System.out.println(c);
			calculate(c);
			break;
		case 3:
			System.out.println(data);
			calculate(data);
			break;
		case 4:
			System.out.println("exit");
			break;
		default:
			System.out.println("Invalid choice ! Please try again");
			calculate(data);
			break;
		}
	}

}
