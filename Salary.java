package test;

import java.util.*;

public class Salary {

	public static void main(String[] args) {

		Scanner  sc =new Scanner(System.in);
		System.out.println("Enter the number to check even or odd");
		int x = sc.nextInt(); 
		if(x%2==0) {
			System.out.println( "even");
		}else {
			System.out.println("odd");
		}
	}	
}
