package test;

import java.util.Scanner;

public class Second_student_percentage {
	float percentage2(Scanner abc,int a) {
		int total_2=0;
		
		int str[]=new int[a];
		for(int b=0;b<a;b++) {

			System.out.println("enter the subject marks for second subject"+b+"=");
			str[b]=abc.nextInt();
			total_2=total_2+str[b];
		}
		
//		for(int q=0;q<str.length;q++) {
//			System.out.println("str["+q+"]="+str[q]);
//			total_2=total_2+str[q];
//		}
		
		
		float percentage_2=((float)total_2/(a*100))*100;
		
		return percentage_2;
		
	}
	}
