package test;
import java.util.Scanner;
public class Method_of_Integer_to_Binary {

	public static void main(String args[]) {
		Scanner abc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int num=abc.nextInt();
		if(num==0) {
			System.out.println("00000000");

		}
		int size=num;
		int arr[]=new int[100];
		int i=0; 
		arr[0]=0;
		while(num>0) {
			//System.out.println(num+"%"+2 +"=="+ num%2 );
			arr[i++]=num%2;

			//System.out.println(num+"/"+2 +"=="+ num/2 );
			num=num/2;

		}

		for(int j=i-1;j>=0;j--){

			System.out.print(arr[j]); 
		}



	}
}


