package test;
import java.util.Scanner;
public class percentage_through_array {
	public static void main (String args[]){
		Scanner abc=new Scanner(System.in);
		System.out.println( "enter how many subjects");
		int a=abc.nextInt(); 
		float total=0;	
		float  g = 0;

		int[] arr = new int[a];
		for ( int b=0; b<arr.length;b++) {
			System.out.println("enter the value to keep in "+b);
			float c=abc.nextFloat();
			if(c>g) {
				g=c;
			}
			arr[b] = (int) c;
			total=total+(int)c;

		}
		float q = arr[0]  ;  
		for (int d=0;d<arr.length;d++) {
			System.out.println("int["+d+"] arr="+arr[d]);
			//float total=arr[d]+arr[d];
			if (q>arr[d] ){
				q=arr[d];
			}

		}

		// float total=arr[0]+arr[1]+arr[2]+arr[3]+arr[4];

		float percentage=(total/(a*100))*100;
		System.out.println("percentage="+percentage);

		System.out.println("maximum="+g);
		System.out.println("minimum="+q);


	}}
















//   if (arr[0] > arr[1] && arr[0] > arr[2] && arr[0]  >arr[3] && arr[0] >arr[4] ) {
//	   System.out.println("maximum"+arr[0]);
//   }
//    if (arr[0] < arr[1] && arr[0] < arr[2] && arr[0]  <arr[3] && arr[0] <arr[4] ) {
//	   System.out.println("minimum"+arr[0]);
//   }
//   
//   
//   if (arr[1] > arr[0] && arr[1] > arr[2] && arr[1]  >arr[3] && arr[1] >arr[4] ) {
//	   System.out.println("maximum"+arr[0]);
//   }
//    if (arr[1] > arr[0] && arr[1] > arr[2] && arr[1]  >arr[3] && arr[1] >arr[4] ) {
//	   System.out.println("minimum"+arr[0]);
//   } 
//   
//    if (arr[2] > arr[1] && arr[2] > arr[0] && arr[2]  >arr[3] && arr[2] >arr[4] ) {
//	   System.out.println("maximum"+arr[2] );
//   }
//    if (arr[2] <arr[1] && arr[2] < arr[0] && arr[2]  <arr[3] && arr[2] <arr[4] ) {
//	   System.out.println("minimum"+arr[2] );
//   }
//   
//   
//    if (arr[3] > arr[1] && arr[3] > arr[2] && arr[3]  >arr[0] && arr[3] >arr[4] ) {
//	   System.out.println("maximum"+arr[3]);
//   }
//    if (arr[3] < arr[1] && arr[3] < arr[2] && arr[3]  <arr[0] && arr[3] <arr[4] ) {
//	   System.out.println("minimum"+arr[3]);
//   }
//   
//    if (arr[4] > arr[1] && arr[4] > arr[2] && arr[4]  >arr[3] && arr[4] >arr[0] ) {
//	   System.out.println("maximum"+arr[4]);
//   }
//    if (arr[4] < arr[1] && arr[4] < arr[2] && arr[4]  <arr[3] && arr[4] <arr[0] ) {
//	   System.out.println("minimum"+arr[4]);
//   }


