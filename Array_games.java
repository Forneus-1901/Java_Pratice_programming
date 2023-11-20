package test;
import java.util.*;
public class Array_games {

	
		public static void main(String args[]){
			Scanner abc=new Scanner(System.in);
		 
		 int[] arr=new int[3];
		 arr[0]=10;
		 arr[1]=20;
		 arr[2]=30;
		 
		 
		 
		  for (int d=0;d<arr.length;d++) {
			    
				int k=	arr[d];
		 
		  Games(k,arr,abc);
		  
		  }
			}
		
		static void Games(int data,int[] arr,Scanner abc) {
			int[] str=new int[3];
			 for (int d=0;d<str.length;d++) {
				 str=arr;
	   
			 
			 }
				
		 System.out.println(data);
		 
		 System.out.println("Enter the position of value ");
		 int place=abc.nextInt();
		
		
		 
		  if(data==str[0] && place==1){
			 System.out.println("you won");
			 System.out.println(" ");
			 data=20;
		  }
		else if(data==str[1] && place==2){
			 System.out.println("you won"); 
			  System.out.println(" ");
			  data=30;
		  }
		 else if(data==str[2] && place==3){
			 System.out.println("you won"); 
 System.out.println(" ");
 data=10;
			 
		  }
		  else if(place==4){
			  System.out.println("EXIT");
			  System.exit(0);
		  } 
		 else {
			
			 System.out.println("you lose");
			  System.out.println(" ");
		 }
		  Games(data,arr,abc);
		 
		 }

}
