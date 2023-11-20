package test;
import java.util.Scanner;
public class Number_counting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner abc=new Scanner(System.in);
		System.out.println("enter the number");
		int num=abc.nextInt();
		int count = 0; 

		for (; num != 0; num /= 10, ++count) {
		}

		System.out.println("Number of digits: " + count);
	}
}
