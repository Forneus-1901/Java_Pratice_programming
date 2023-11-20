package test;
import java.util.*;
public class cipher {

	public static void main(String[] args) {
		Scanner abc=new Scanner(System.in);
        System.out.println("Enter the  letter to encrpyt");
        String letter=abc.next();
        char arr[]=new char[letter.length()];
        for(int a=0;a<letter.length();a++) {
        	arr[a]=letter.charAt(a);
        	arr[a]=(char) (arr[a]+2);
        	if(arr[a]>=65 && arr[a]>91) {
        		System.out.println("arr["+a+"]="+arr[a]);
        	}
        }
//        for(int a=0;a<arr.length;a++) {
//        	System.out.println("arr["+a+"]="+arr[a]);
//        }
	}

}
