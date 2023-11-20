package test;
import java.util.Scanner;
public class forloop2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner abc=new Scanner(System.in);
		System.out.println("enter how many numbers you want:");  

		int b=1;
		float e=0;
		int d=abc.nextInt();
		for(b=1;b<=d;b++) {
			System.out.println(" enter the number "+b+":");
			float c=abc.nextFloat(); //3 
			if(e > c||e==0 ) {
				e = c;
			}
		}
	System.out.println("minimum number is="+e);
	}
}
