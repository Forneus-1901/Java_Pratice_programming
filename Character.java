package test;
import java.util.Scanner;
public class Character{
   public static void main (String args[]){
    Scanner abc =new Scanner(System.in);
	System.out.println("enter the value");
//  char a=abc.next().charAt(0); 
  
  String a=abc.next();
   
  char b=a.charAt(0);
  if(b>=(char)65 && b<=(char)91 ) {
    	System.out.println("it is character");
    }
   else {
	 int c= Integer.parseInt(a);
	   if (c>=65 && c<=91) {
		  
		  System.out.println("it is character");
	  }
	   
	  else {
	   
	   System.out.println("it is not a character");
	  }
	  }
   
   
   }
   
   }
