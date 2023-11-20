package test;
import java.util.*;
public class Pratice_makes_man_perfect {
	public static void main(String args[]){
		 Scanner abc=new Scanner(System.in);
		   System.out.println("enter the size");
		   int size=abc.nextInt();
		   int num=0;
		    int arr[]=new int[size];
			int str[]=new int[size];
			int count=0;
			for ( int b=0; b<arr.length;b++) {
				System.out.println("enter the value to keep in "+b);
				arr[b]=abc.nextInt();
				}
			for (int d=0;d<arr.length;d++) {
			    System.out.println("int["+d+"] arr="+arr[d]);
				}
				System.out.print("enter the value to remove =");
					int  c=abc.nextInt();
					  // 10 20 10 30 10
					
		    for (int i =0;i<arr.length;i++) {
		   if (c==arr[i]) {
			count++;
		   }	
		   }
		    System.out.println("count="+count);
		    size=size-count;
		    int j=0;
		    for (int i =0;i<arr.length;i++) {
		    	
		    	if(c!=arr[i] && j<=size ) {
		    	str[j]=arr[i];
		    	
		    	System.out.println("str["+j+"]="+str[j]);
		    	j++;
		    	}	
		    		
		    	}
		    	
		    	
		    }
		    
		    
		}
		
			/*for (int d=0;d<arr.length;d++) {
				if(c==arr[d]){
				continue;
				}
			    System.out.println("int["+d+"] arr="+arr[d]);	
			}*/
			
				
	