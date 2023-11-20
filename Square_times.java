package test;
//import java .util.Scanner;
//public  class  Square_times{
// public static void main(String args[]){
// Scanner abc =new Scanner(System.in);
// System.out.print("enter the number:");
// int a=abc.nextInt();
// int m=a;
// System.out.print("enter the multiple time");
// int b=abc.nextInt();
// if (b==1) {
//	 System.out.println(a);
// }
// for(int c=1;c<=b && b!=1 ;c++) {
//	m=m*a;
// 
// }
// m=m/a;
// System.out.println(m);
// }
//
//
//}
//
//
//
import java .util.Scanner;

public  class  Square_times{

 public static void main(String args[]){
 Scanner abc =new Scanner(System.in);
	System.out.println("enter the number:");
 int r=abc.nextInt();
 System.out.println("enter the multiple time");
 int w=abc.nextInt();
Square_times mthd=new Square_times();
	int z = mthd.method(r,w);
	
 System.out.println(z); 
 }


  int method(int a,int b){
	  int m=a;
if (b==1) {
	 System.out.println(a);
 }else{
	 for(int c=1;c<b;c++) {
	m=m*a;
 
 }
 //m=m/a;
 
 }
 return m;
  
	
	
 }	
	
}













	









