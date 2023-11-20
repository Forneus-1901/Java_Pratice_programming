package test;
import java.util.*;
public class Pair_of_sum {

	public static void main(String[] args) {
		Scanner abc=new Scanner(System.in);
		int arr[]= {2,1,3,4,5,6,7,8,9};
		System.out.println("number you want to know the pair of=");
		int num=abc.nextInt();

		int value=0;
		for(int a=0;a<arr.length;a++) {

			for(int b=0;b<arr.length;b++) {
				if(a!=b) {
					value=arr[a]+arr[b];
				}
				
				if(value==num && arr[a]!=arr[b]) {
					System.out.println(arr[a]+","+arr[b]);
				}
			}
		}
	}

}
