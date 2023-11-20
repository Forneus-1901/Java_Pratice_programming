package test;

public class PRERMUTATIONS_CODE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<9;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(format(p(i,j),8));
			}
			System.out.println();
		}

	}

	static long p(int n,int k) {
		long p=1;
		for(int i=0;i<k;i++) {
			p*=n--;
		}
		return p;
	}

	static String format(long n,int width) {
		String BLANKS="          ";
		String s=String.valueOf(n);
		return BLANKS.substring(0, width-s.length())+s;

	}

}
/*
 package test;
import java.io.*;
import java.util.*;
public class Pratice_for_book_example  {
	public static void main(String args[]) {
		Scanner abc=new Scanner(System.in);
		System.out.println("PLEASE  THE ROW  OF PERMUTATION");
		int row=abc.nextInt();

		for(int a=1;a<=row;a++) {
			if(a==1) {
				System.out.println("1  ");
			}
			for(int g=0;g<1;g++) {
				System.out.print("1  ");
			}
			int m=a;
			for(int d=a;d>=1;) {
				if(d==a)
					System.out.print(d+"  ");
				m=m*(--d);
				if(m==0) {
					break;
				}
				System.out.print(m +"  ");
			}
			System.out.println();
		}
	}
}
/*

1  
1  1  
1  2  2  
1  3  6  6  
1  4  12  24  24  
1  5  20  60  120  120  
1  6  30  120  360  720  720  
1  7  42  210  840  2520  5040  5040  
1  8  56  336  1680  6720  20160  40320  40320  

 */
