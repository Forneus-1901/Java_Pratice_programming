package test;
import java.util.*;
public class First_student_percentage {

	public static void main(String[] args) {
		Scanner abc=new Scanner(System.in);
		System.out.println("enter how many subjects");
		int a=abc.nextInt();
		int arr[]=new int[a];
		int total_1=0;
		Second_student_percentage obj=new Second_student_percentage();
		Third_student_percentage obj2=new Third_student_percentage();
		for(int b=1;b<=a;b++) {
			System.out.println("enter the subject :"+b+"=");
			String subject=abc.next();
			
		}
		for(int b=0;b<a;b++) {
			System.out.println("enter the subject marks first student of subject"+b+"=");
			arr[b]=abc.nextInt();
			total_1=total_1+arr[b];
		}
		float percent2= obj.percentage2(abc, a);
	float percent3= obj2.percentage3(abc, a);
//		for(int q=0;q<arr.length;q++) {
//			System.out.println("arr["+q+"]="+arr[q]);
//		}
		System.out.println("enter the student number you want to see percentage");
		int number=abc.nextInt();
		
		if(number==1) {
			float percent1=((float)total_1/(a*100))*100;
			 System.out.println("The percentage of student 1 is="+percent1);

		}
		else if(number==2) {
		 
		 System.out.println("The percentage of student 2 is="+percent2);
		}
		else if(number==3) {
			
			 System.out.println("The percentage of student 3 is="+percent3);
		}
		else {
			System.out.println("sorry student record is not there");
		}
	}
	

}
