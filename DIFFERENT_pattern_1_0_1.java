package test;

import java.util.Random;
import java.util.Scanner;

public class DIFFERENT_pattern_1_0_1 {

	public static void main(String[] args) {
		Scanner abc=new Scanner(System.in);
		Random random=new Random();
		int	m = 0;
		for(int a=1;a<=9;a++) {
			if(a%2==0) {
				m=1;
			}
			else if(a%2!=0) {
				m=0;
			}
			for(int b=1;b<=a;b++) {

				if(m==0) {
					m=1;
					System.out.print("1 ");
				}
				else if(m==1) {
					m=0;
					System.out.print("0 ");
				}
			}

			System.out.println();


		}



	}
}
/*
1
0 1
1 0 1
0 1 0 1
1 0 1 0 1
 */