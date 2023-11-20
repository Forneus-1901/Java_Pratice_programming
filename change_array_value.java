package test;
import java.util.Scanner; 
public class change_array_value {
	boolean count = false;
	public static void main(String args[]) {
		change_array_value obj=new change_array_value();
		obj.getInput();
		
	}
	
	void getInput(){
			Scanner abc=new Scanner(System.in);
				
			System.out.println( "enter the number how many times you want");
			int a=abc.nextInt();  
			int[] arr = new int[a];
			for ( int b=0; b<arr.length;b++) {
				System.out.println("enter the value to keep in "+b);
			    arr[b]=abc.nextInt();
			   
			}
			
			print(arr);
			  
	} 
	
	void print(int[] arr) {
		for (int d=0;d<arr.length;d++) {
			System.out.println("int["+d+"] arr="+arr[d]);
		}
		if(!count){
			count = true;
			update(arr);
		}
		
	}
	
	void update(int[] arr){
		Scanner abc=new Scanner(System.in);
		System.out.println("enter the position");
        int position=abc.nextInt();
		System.out.println("enter the position value");
        int value=abc.nextInt();
		arr[position]= value;
		print(arr);
		
	}
}
		 