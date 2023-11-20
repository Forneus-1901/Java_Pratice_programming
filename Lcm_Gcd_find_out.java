package test;

import java.util.Random;
import java.util.Scanner;

public class Lcm_Gcd_find_out {

	public static void main(String[] args) {
		Random random=new Random();
		Scanner abc=new Scanner(System.in);
		int a=random.nextInt(100);
		int b=random.nextInt(100);
		System.out.println(a+"  and "+b);
		long c=method(a,b);
System.out.println(method2(a,b,c));
	}
	static long method(long n,long k) {
		long c=n;
		if(k>n) {
			c=k;
		}
		long gcd=0;
		int count=0;
		for(long m=1;m<=c;m++) {
			
			if(n%m==0 && k%m==0) {
				gcd=m;
			}	
			
		}
		return gcd;
	}
	
	static long method2(long n,long k,long gcd) {
		long lcm=(n*k)/gcd;
		
		
		return lcm;
	}
		
}
