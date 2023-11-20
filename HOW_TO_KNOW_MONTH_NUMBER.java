package test;
import java.util.Scanner;
public class HOW_TO_KNOW_MONTH_NUMBER {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner  abc=new Scanner(System.in);
		String months="JANFEBMARAPRMAYJUNJULAUGSEPOCTNOVDEC";
		System.out.println("enter the month");
		String b=abc.next();
		String a=b.substring(0,3).toUpperCase();
		System.out.println(months.indexOf(a));
		int c=months.indexOf(a)/3+1;
		if(c>0)
		System.out.println("c="+c);
		else
			System.out.println("not a month");
	}

}
