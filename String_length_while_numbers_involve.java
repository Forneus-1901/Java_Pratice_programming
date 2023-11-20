package test;
import java.util.*;
public class String_length_while_numbers_involve {

	public static void main(String[] args) {
		Scanner abc=new Scanner(System.in);
	System.out.println("enter the text");
    String text=abc.nextLine();
    int count=0;
    int arr[]=new int[text.length()];
     for(int q=0;q<arr.length;q++) {
    	 arr[q]=text.charAt(q);
    	 if((int)arr[q]>=65 && (int)arr[q]<=90 ||(int)arr[q]>=97 &&(int)arr[q]<=122 ) {
    		
    		 count++;
    	 }
     }
     
    System.out.println("String Length="+count);
	}

}
