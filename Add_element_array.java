package test;

import java.util.Scanner;
public class Add_element_array{
	public static  void main(String args[]){
	Scanner abc=new Scanner(System.in);
   System.out.println("enter the size");
   int size=abc.nextInt();
   int str[]=new int[size];
    int arr[]=new int[size];
	
	for ( int b=0; b<arr.length;b++) {
		System.out.println("enter the value to keep in "+b);
		int c=abc.nextInt();
		arr[b]=c;
        str[b]=c;
		}
		
		for (int d=0;d<arr.length;d++) {
	    System.out.println("int["+d+"] arr="+arr[d]);
		}
		
	    System.out.println(" ");
		
		for (int d=0;d<str.length;d++) {
	    System.out.println("int["+d+"] str="+str[d]);
		}
		
		System.out.print("enter the value to enter=");
			int  value=abc.nextInt();	
		System.out.print("enter the value to position=");
			int  location=abc.nextInt();
			int e=0;
			
			size=(arr.length+1);
			arr = new int[size];
		
	for 	(int k=0;k<arr.length;k++) {
	if(e==1) {
	
				arr[k]=str[(k-1)];
		System.out.println("int["+k+"] arr="+arr[k]);
	/*if(k == (size-1)){
		//size=(arr.length+1);
		//arr[]=new int[size];
			arr[(k+1)]=str[k];
	System.out.println("int["+(k+1)+"] arr="+str[k]);
				System.out.println(k+1);
				System.out.println(str[k]);
				//arr[(k+1)]=str[k];
				break;
	}
	*/
	}
	
	 else if( location==k){
		arr[k]=value;
	 System.out.println("int["+k+"] arr="+arr[k]);
	 e=1;
	}
	
	else if(location!=k && e==0){
	arr[k]=str[k];
		System.out.println("int["+k+"] arr="+str[k]);
	}
	
	}
	
	    System.out.println(arr.length);
	for (int d=0;d<arr.length;d++) {
	    System.out.println("int["+d+"] arr="+arr[d]);
		}
		
}}