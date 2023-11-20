package test;
import java.util.Scanner;
public class Pascal_traingle {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);  
		int i, j, k, l, r; 
		System.out.println("Enter the number of rows ");
		r=sc.nextInt();  
		int a[]=new int[30];
		for(i=0;i<r;i++) {
			a[i] = 1;  
			for(j=0;j<=i;j++)   
			{
				System.out.print(a[i]+ " ");    
				a[i] = a[i] * (i - j) / (j + 1);   
				System.out.println();
			}
			System.out.println();  
		}

	}
}
/*
1
1 1
1 2 1
1 3 3 1
1 4 6 4 1
1 5 10 10 5 1
1 6 15 20 15 6 1
1 7 21 35 35 21 7 1
1 8 28 56 70 56 28 8 1
1 9 36 84 126 126 84 36 9  1 
1 10 45 130 210 252 210 120 45 10 1

package test;
import java.util.Random;
import java.util.Scanner;
public class Pratice_for_book_example {
	public static void main(String args[]) {	
		Scanner sc = new Scanner(System.in);
		int num, a, b, arr[][], p;
		System.out.println("Please enter number of rows: ");
		num = sc.nextInt();
		p = num - 1;
		arr = new int[num][num];
		for(a = 0; a < num; a++)
		{
			for(b = 0; b <= a; b++)
				if(b == 0 || b == a) {
					arr[a][b] = 1;
				}
				else {
					arr[a][b] = arr[a - 1][b - 1] + arr[a - 1][b];
				}
		}
		System.out.println("Pascal's triangle: \n");
		for(a = 0; a < num; a++) {
			for(b = 0; b <= a; b++) {
				System.out.print(arr[a][b] + " ");
			}
			System.out.println();
		}
		//sc.close();
	}

}

// MY OWN DONE WITHOUT GOOGLE
 
 
 
 
 
 
package test;
import java.io.*;
import java.util.*;
public class Pratice_for_book_example  {
	public static void main(String args[]) {
		Scanner abc=new Scanner(System.in);
		int arr[];
		arr=new int[1];	
		System.out.println("TELL THE ROWS OF THE PASCAL");
		int row=abc.nextInt();
		int str[]=new int [row];
		arr[0]=1;
		int a=1;
		while(a<=row) {

			for(int b=0;b<arr.length;b++) {
				System.out.print(arr[b]+ " ");
			}
			System.out.println();
			a++;
			str=arr;
			arr=new int[a];
			for(int b=0;b<arr.length;b++) {
			if(b==0 || b==(arr.length-1)) {
				arr[b]=1;
			}
			else {
			arr[b]=str[b]+str[b-1]	;
			}
				
			}
			
		}
	}
}

1
1 1
1 2 1
1 3 3 1
1 4 6 4 1
1 5 10 10 5 1
1 6 15 20 15 6 1
1 7 21 35 35 21 7 1
1 8 28 56 70 56 28 8 1
1 9 36 84 126 126 84 36 9  1 
1 10 45 130 210 252 210 120 45 10 1
 

 */