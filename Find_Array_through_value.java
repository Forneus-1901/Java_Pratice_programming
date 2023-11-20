package test;
import java.util.Scanner;
public class Find_Array_through_value {
	public static void main(String args[]){
		Scanner abc=new Scanner(System.in);
		System.out.println("enter the size");
		int size=abc.nextInt();
		int arr[]=new int[size];
		for ( int b=0; b<arr.length;b++) {
			System.out.println("enter the value to keep in "+b);
			arr[b]=abc.nextInt();

		}
		for (int d=0;d<arr.length;d++) {
			System.out.println("int["+d+"] arr="+arr[d]);
		}
		System.out.println("enter the value");
		int value =abc.nextInt();
		boolean flag = false;
		for (int b=0; b<arr.length;b++ ){
			if(value== arr[b]){
				flag = true;
				System.out.println("int["+(b+1)+"] arr="+arr[b]);
			} 
		}
		if(!flag)
			System.out.println("Not present");

	}
}


