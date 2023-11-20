package test;
import java.util.Scanner;
public class  Reversible{
 public static  void main (String args[]){
  Scanner abc=new Scanner(System.in);
	 System.out.println("Enter the value");
 int num=abc.nextInt();
  int count = 0;
  int b=num;
  int c=0;
  int e=0;
for (; b != 0; b /= 10, ++count) {

}
for(int d=1;d<=count;d++) {	
 for(int a=1;a<=count;a++) {
	  c=num%10;
	   e=num/10;
	 // System.out.println(c);
	  
 }
 System.out.print(c);
   num=e;
}
// System.out.println(c);
// 
 }



}
