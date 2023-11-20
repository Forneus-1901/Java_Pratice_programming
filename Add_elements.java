package test;


import java.util.Scanner;
public class Add_elements{
	public static  void main(String args[]){
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
		System.out.print("enter the value to enter=");
			int  value=abc.nextInt();	
		System.out.print("enter the value to position=");
			int  location=abc.nextInt();	
		int e=0;
	for 	(int k=0;k<arr.length;k++) {
		 if(e==1) {
			if(k == (arr.length+1)){
				break;
			}
		
			arr[k]=arr[k-1];
			
		}

	
		 else if( location==k){
	 arr[k]=value;
	 System.out.println("int["+k+"] arr="+arr[k]);
	 e=1;
	}
	
		
	else if(location!=k){
		System.out.println("int["+k+"] arr="+arr[k]);
		}	
	}
	for (int d=0;d<arr.length;d++) {
	    System.out.println("int["+d+"] arr="+arr[d]);
		}
		
		}
	}