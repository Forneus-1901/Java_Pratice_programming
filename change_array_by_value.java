package test;
import java.util.Scanner;

public class change_array_by_value {
	public static void main(String[] args) {
		
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
				
				System.out.print("Enter the Value to replace");
				int  value_replace=abc.nextInt();
				System.out.print("Enter the Value to put");
				int  value_put=abc.nextInt();
				
				
				for(int d=0;d<arr.length;d++) {
					
					if(value_replace==arr[d]) {
						arr[d]=value_put;
					}
					
						    System.out.println("int["+d+"] arr="+arr[d]);
					
					
					
				}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
