package test;


import java.util.Scanner;
public class String_palidrome_array {
	public static void main(String args[]){
		Scanner abc=new Scanner(System.in );
		System.out.println("enter the string");
		String input=abc.next();
		char arr[]=new char[input.length()];
		int x=0;
		for(int c=0; c<input.length();c++){
			arr[c]=input.charAt(c);
			System.out.println(arr[c]);
		}
		System.out.println(arr.length);
		int total=arr.length;
		System.out.println(total);
		if(total==0 || total==1){
			System.out.println("Sorry we cannot tell because of inappropriate string");
		}
		else if (total%2==0){
			System.out.println("even");
			int half=total/2;
			for( int q=(half-1);q>=0 && half<arr.length;q--, half++) {

				if(arr[q]!=arr[half]){
					System.out.println("not="+arr[q]+"=="+arr[half]);
					x=0;
					break;
				}

				else{
					System.out.println(arr[q]+"=="+arr[half]);
					x=1;
				}
			}
		}
		
		else if (total%2!=0){
			System.out.println("odd");
			total=total+1;
			int half=total/2;
			int start=half;
			int end=half-2;
			for( int q=end;q>=0 && start<arr.length;q--, start++) {

				if(arr[q]!=arr[start]){
					System.out.println("not="+arr[q]+"=="+arr[start]);
					x=0;
					break;
				}

				else{
					System.out.println(arr[q]+"=="+arr[start]);
					x=1;
				}
			}
		}
		
	System.out.println("");
	if(x==1) {
		System.out.println("it is  a plaindrome");
	}
	else {
		System.out.println("it is not  a plaindrome");	
	}
		
	}

}