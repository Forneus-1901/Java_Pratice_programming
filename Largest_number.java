package test;
import java.util.Scanner;
public  class Largest_number{
   public static void main(String args[]){
   Scanner abc=new Scanner(System.in);
   System.out.println("Enter the value");
	int a=abc.nextInt();
 System.out.println("Enter the value");
 int b=abc.nextInt();
 System.out.println("Enter the value");
 int c=abc.nextInt();
      if(a>=b && a>=c){  
System.out.println(a+" is the largest Number");  
 }

else if (b>=a && b>=c){  
System.out.println(b+" is the largest Number"); 
} 
else{
System.out.println(c+" is the largest number");  
}  
   
   
   
   
   
   
   }



}


