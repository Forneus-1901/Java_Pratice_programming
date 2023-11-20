package test;
import java.util.Scanner ;
public class Armstrong_number {

	public static void main(String[] args) {
		
		Scanner abc =new Scanner(System.in);

		System.out.println("Enter the number :");
		int num=abc.nextInt();
		int p=0;
		int count = 0; 
		int digit=num;
		int f=1;
int x=0;
  
	int b=0;
		for (; digit != 0; ++count) {
			digit /= 10;
		}
System.out.println("count:"+count);
		int a=count;
 int q = 1;
for (int d=1;d<=a;d++) {
	 int w = 0;

		for(int c=1;c<=a;c++) {
			

			int l = num%10;
     q=  q*l;
      //System.out.println( q*l);
     w=q;
 }
 
 
		 x=x+w;
		 
		

p= num/10; 

	num=p;	

 q=1;
}
System.out.println("sum of number:"+x);	
	}}

