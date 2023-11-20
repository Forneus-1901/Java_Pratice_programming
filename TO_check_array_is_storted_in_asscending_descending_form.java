package test;

import java.util.Random;
import java.util.Scanner;

public class TO_check_array_is_storted_in_asscending_descending_form {

	public static void main(String args[]) {
		Random random=new Random();
	Scanner abc=new Scanner(System.in);
	
	 
	int arr[]=new int[6];
	arr[0]=11;
	arr[1]=12;
	arr[2]=10;
	arr[3]=14;
	arr[4]=15;
	arr[5]=16;
	System.out.println(isStorted(arr));
	}
	
	static boolean isDescending(int[] a) {
		for( int i=1;i<a.length;i++) 
			if(a[i]>a[i-1]) return false;
		return true;
	}
	static boolean isAscending(int[] a) {
		for( int i=1;i<a.length;i++) 
			if(a[i]<a[i-1]) return false;
		return true;
	}
	static boolean isStorted(int a[] ){
		System.out.println(isDescending(a)+"||"+isAscending(a));
		return isDescending(a)||isAscending(a);
	}
	

}