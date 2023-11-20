package test;
import java.util.Scanner;
public class multiplication_of_two_matrices {
	static Scanner abc=new Scanner(System.in);
	public static void main(String[] args) {
		int arr[]=new int[9];
		int str[]=new int[9];
		int ans[]=new int[9];
		for(int a=0;a<9;a++) {
			System.out.println("for first matrix");
			method2(arr);
			int position=abc.nextInt();
			System.out.println("ENTER THE VALUE YOU HAVE TO PUT ON THE CHOSEN POSITION");
			arr[position]=abc.nextInt();
			method1(arr);
		}
		for(int a=0;a<9;a++) {
			System.out.println("for second matrix");
			method2(str);
			int position=abc.nextInt();
			System.out.println("ENTER THE VALUE YOU HAVE TO PUT ON THE CHOSEN POSITION");
			str[position]=abc.nextInt();
			method1(str);
		}
		ans[0]=(arr[0]*str[0])+(arr[1]*str[3])+(arr[2]*str[6]);
		ans[3]=(arr[3]*str[0])+(arr[4]*str[3])+(arr[5]*str[6]);
		ans[6]=(arr[6]*str[0])+(arr[7]*str[3])+(arr[8]*str[6]);
		ans[1]=(arr[0]*str[1])+(arr[1]*str[4])+(arr[2]*str[7]);
		ans[4]=(arr[3]*str[1])+(arr[4]*str[4])+(arr[5]*str[7]);
		ans[7]=(arr[6]*str[1])+(arr[7]*str[4])+(arr[8]*str[7]);
		ans[2]=(arr[0]*str[2])+(arr[1]*str[5])+(arr[2]*str[8]);
		ans[5]=(arr[3]*str[2])+(arr[4]*str[5])+(arr[5]*str[8]);
		ans[8]=(arr[6]*str[2])+(arr[7]*str[5])+(arr[8]*str[8]);
		System.out.println("final answer");
		method1(ans);
	}
	static void method1(int arr[]) {
		System.out.println("                   ");
		System.out.println("                   ");
		System.out.println("                   ");
		System.out.println("|-------|-------|--------|");
		System.out.println("|  "+arr[0]+"    |   "+arr[1]+"   |   "+arr[2]+"    | ");
		System.out.println("|-------|-------|--------|");
		System.out.println("|  "+arr[3]+"    |   "+arr[4]+"   |   "+arr[5]+"    | ");
		System.out.println("|-------|-------|--------|");
		System.out.println("|  "+arr[6]+"    |   "+arr[7]+"   |   "+arr[8]+"    | ");
		System.out.println("|-------|-------|--------|");
		System.out.println("                   ");
		System.out.println("                   ");
		System.out.println("                   ");
		return;


	}
	static void method2(int arr[]) {
		System.out.println("CHOOSE THE POSITION  FORM THE GIVEN NUMBER:");
		System.out.println("                   ");
		System.out.println("                   ");
		System.out.println("                   ");
		System.out.println("|-------|-------|--------|");
		System.out.println("|  "+0+"    |   "+1+"   |   "+2+"    | ");
		System.out.println("|-------|-------|--------|");
		System.out.println("|  "+3+"    |   "+4+"   |   "+5+"    | ");
		System.out.println("|-------|-------|--------|");
		System.out.println("|  "+6+"    |   "+7+"   |   "+8+"    | ");
		System.out.println("|-------|-------|--------|");
		System.out.println("                   ");
		System.out.println("                   ");
		System.out.println("                   ");
		return;

	}

}
