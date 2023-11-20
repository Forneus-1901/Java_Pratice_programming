package test;
import java.util.Scanner;
public class Replace_String_array_value {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner abc =new Scanner(System.in);
		System.out.println("enter the string");
		String a=abc.next();
		int count=0;

		char arr[]=new char[a.length()];
		int j=0;
		for(int i=0;i<arr.length;i++) {

			arr[i]=a.charAt(i);



		}

		for ( int q=0; q<arr.length;q++) {
			System.out.println("int arr["+q+"]="+arr[q]);
		}

		System.out.println("Enter the value to change");
		char b=abc.next().charAt(0);
		for ( int q=0; q<arr.length;q++) {
			if(b==arr[q]) {
				count++;
			}
		}
		char c=(char) ((a.length()+(count*3))-(count));
		char str[]=new char[c];


		int f=0;
		int m=0;
		for(int i=0;i<arr.length;i++) {

			if (arr[i]==b) {

				for(char k=1;k<=3;k++) {
					str[f]= (char)(49+m);
					f++;
					m++;
				}
				if(i!=(arr.length-1)) {
				str[f]=arr[i];	
				m=0;
				}
			}

			else {
				str[f]=arr[i];
				f++;
			}
		}

		for ( int q=0; q<str.length;q++) {
			System.out.println("int str["+q+"]="+str[q]);
		}  


		System.out.println("");

		String n ="";
		for ( int p=0; p<c;p++) {
			n=n+str[p];



		}


		System.out.println(n);







	}

}
