package test;
import java.util.Scanner;
public class forloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner abc=new Scanner(System.in);

		int a=1;

		float total = 0;
System.out.println("enter total subjects");
int d = abc.nextInt(); 

		for(;a<=d ;a++) {
			System.out.println("enter name of subject "+a+":");
			String subject__name=abc.next();
			System.out.println("enter subject  marks"+a+":");
			float marks_subject=abc.nextFloat();
			total = total + marks_subject;
		}


		float percentage = (total*100)/(d*100) ;    
		System.out.format("total percentage:%.2f",percentage);	



	}
}