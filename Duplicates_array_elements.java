package test;


import java.util.Scanner;
public class Duplicates_array_elements{
	public static void main (String[] args){
		Scanner abc=new Scanner(System.in);
		System.out.println("enter the size");
		int size=abc.nextInt();
		int str[]=new int[size];
		int arr[]=new int[size];
		int count=0;
		int z=0;

		for ( int b=0; b<arr.length;b++) {
			System.out.println("enter the value to keep in "+b);
			int c=abc.nextInt();
			str[b]=c;
		}

		for (int d=0;d<str.length;d++) {

			for (int c=0;c<str.length;c++) {

				if (str[d]==str[c]){
					count++; 
				}
			}

			/* if(str[d]==str[d] && z!=str[d]){                             // this is for if the repeated elements are in serial form
	System.out.println( str[d]+"   element repeated  "+count+ "  times") ;  
		z=str[d];
	  }*/


			int flag = 0;

			for (int c=0;c<arr.length;c++){

				if(str[d] == arr[c]){
					flag = 0;
					break;
				}else{
					flag = 1;
				}
				/*if(z==0 && str[d]!=arr[c] ){
			System.out.println( str[d]+"   element repeated  "+count+ "  times") ;  
			arr[c]=str[d];
			count=0;
			z=1;

		}*/
			}
			if(flag ==1){

				System.out.println( str[d]+"   element repeated  "+count+ "  times") ;  
				arr[d] = str[d];
			}
			count=0;

		}

	}

}
