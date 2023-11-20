package test;

import java.util.Scanner;
public class  Second_max_mini_array{
	public static void main(String args[]){
		Scanner abc=new Scanner(System.in);
		System.out.println("enter the size");
		int size=abc.nextInt();
		int arr[]=new int[size];


		for ( int b=0; b<arr.length;b++) {
			System.out.println("enter the value to keep in "+b);
			arr[b]=abc.nextInt();
		}
		
		for ( int c=0; c<arr.length;c++) {
			//int j=0;
			int b=0;
			b=c;
			for ( ; b<arr.length;b++) {
				if(arr[c]<arr[b]){
					int subsitute=arr[c];
					arr[c]=arr[b];
					arr[b]=subsitute;
					}
			} 
		}

		for ( int c=0; c<arr.length;c++) {
			System.out.println("int arr["+c+"]="+arr[c]);
		}
		
		for ( int c=0; c<arr.length;c++) {
			if (size==1){
				System.out.println(" No second minimum this is only maximum ="+arr[0]);
				break;
			}
			else if(size==2){

				if(arr[0]<=arr[1]){
					System.out.println("No second maximum this is only maximum="+arr[1]);
					break;
				}
				else if(arr[0]>=arr[1]){
					System.out.println("No second maximum this is only maximum="+arr[0]);
					break;

				}
			}
			else if(arr[0]>arr[c]  &&  size!=2){
				System.out.println("Second maximum ="+arr[c]);
				break;
			}

		}
		
		for ( int j=size; (j-1)>=0;j--) {
			if (size==1){
				System.out.println(" No second minimum this is only  minimum ="+arr[0]);
				break;
			}
		else if(size==2){

				if(arr[0]<=arr[1]){
					System.out.println(" No second minimum this is only  minimum ="+arr[0]);
					break;
				}
				else if(arr[0]>=arr[1]){
					System.out.println(" No second minimum this is only  minimum ="+arr[1]);
					break;
				}
			}
			else if(arr[(size-1)]<arr[(j-1)]){
				System.out.println("Second minimum ="+arr[(j-1)]);
				break;
			}
		}
		
	}
}
