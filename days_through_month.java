package test;
import java.util.*; 
public class days_through_month {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner abc =new Scanner(System.in);
   System.out.print("please enter the month: ");
 int a =abc.nextInt();
 
 if(a==2) {
	 System.out.print(" please enter  the year:");
    int b=abc.nextInt();
    if (b%4==0) {
    	System.out.println("29 days in  this month:"+b);
    }
    else {
    	System.out.println("28 days in this month:"+b);
    }
 }
  
 else if(a==8) {
	 System.out.println("31 days in this month:"+a);
 }
 else if(a%2!=0 && a!=9 && a!=11 || a==10 ||a==12) {
	 System.out.println("31 days in this month:"+a);
 }
 else {
	 System.out.println("30 days  in this month:"+a);
 }

	 	
	}

}
