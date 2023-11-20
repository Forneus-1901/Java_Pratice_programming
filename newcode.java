package test;

import java.util.Scanner;

public class newcode {

	public static void main(String[] args) {
 Scanner abc=new Scanner(System.in);
  
  System.out.println("ener  name of subject 1:");
	String subject_1=abc.next();
	System.out.println("enter subjects 1marks:");
	float marks_subject_1=abc.nextFloat();
	
	
	System.out.println("enter name of subject 2:");
	String subject_2=abc.next();
	System.out.println("enter subject 2 marks:");
	float marks_subject_2=abc.nextFloat();
	
	
	System.out.println("enter name of subject 3:");
	String subject_3=abc.next();
	System.out.println("enter subject 3 marks:");
	float marks_subject_3=abc.nextFloat();
	
	
	System.out.println("enter name of subject 4:");
	String subject_4=abc.next();
	System.out.println("enter subject 4 marks:");
	float marks_subject_4=abc.nextFloat();
	
	
	System.out.println("enter name of subject 5:");
	String subject_5=abc.next();
	System.out.println("enter subject 5 marks:");
	float marks_subject_5=abc.nextFloat();

	 float total= marks_subject_1+marks_subject_2+marks_subject_3+marks_subject_4+marks_subject_5;
	float percentage= (total*100)/(5*100);
	System.out.format("\ntotal percentage of 5 subject:%.2f",percentage);
	
	
	}
}
	
// TODO Auto-generated method stub


