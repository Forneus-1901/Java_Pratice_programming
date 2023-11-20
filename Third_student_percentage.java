package test;

import java.util.Scanner;

public class Third_student_percentage {

	float percentage3(Scanner abc,int a) {
		int total_3=0;
		
		int sub[]=new int[a];
		for(int b=0;b<a;b++) {

			System.out.println("enter the subject marks for  third subject"+b+"=");
			sub[b]=abc.nextInt();
			total_3=total_3+sub[b];
		}
		
//		for(int q=0;q<sub.length;q++) {
//			System.out.println("str["+q+"]="+sub[q]);
//			total_3=total_3+sub[q];
//		}
		
		float percentage_3=((float)total_3/(a*100))*100;
		return percentage_3;
		
	}
}
