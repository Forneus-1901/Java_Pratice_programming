package test;
import java.util.Scanner;
public class Square_measure {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner abc=new Scanner(System.in);
		System.out.println("enter the value in inches:");
  double inch=abc.nextDouble();
  
 System.out.println("1.feet\n2.foot\n3.yard\n4.rod\n5.acres\n6.miles");
	int a=abc.nextInt();

	if(a==1) {
		double m=inch/12;
		
		System.out.println("feet value:"+m);
		
	}
	
	else if(a==2) {
		double m=inch*12;
		
		System.out.println("foot value:"+m);
		
	}
	else if(a==3) {
		double m=inch*0.028;
		
		System.out.println("yard value:"+m);
		
	}
	else if(a==4) {
		double m=inch*0.0056;
		
		System.out.println("rod value:"+m);
		
	}
	else if(a==5) {
		double m=inch*1.6;
		
		System.out.println("acres value:"+m);
		
	}
	else if(a==6) {
		double m=inch*1.58;
		
		System.out.println("mile value:"+m);
		
	}
	
	else {
		System.out.println("number is invalid");
	}	
	}

}
