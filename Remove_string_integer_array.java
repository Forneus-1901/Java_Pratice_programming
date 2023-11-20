package test;
import java.util.*;
public class Remove_string_integer_array {



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner abc =new Scanner(System.in);
		System.out.println("enter the string");
		String a=abc.next();

		char arr[]=new char[a.length()];
		int j=0;
		for(int i=0;i<arr.length;i++) {

			arr[i]=a.charAt(i);



		}

		for ( int c=0; c<arr.length;c++) {
			System.out.println("int arr["+c+"]="+arr[c]);
		}


		for(int i=0;i<arr.length;i++) {

			if((int)arr[i]>=65 &&  (int)arr[i]<=90 || (int)arr[i]>=97 &&  (int)arr[i]<=122){
				arr[j]=arr[i];
				//	System.out.println(arr[j]);
				j++;
			}



		}
		System.out.println("");
		for ( int c=0; c<j;c++) {
			System.out.println("int arr["+c+"]="+arr[c]);
		}
		String b ="";
		for ( int c=0; c<j;c++) {
			b=b+arr[c];

			
			
		}

		
		System.out.println(b);
	}




}





