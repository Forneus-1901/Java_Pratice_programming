package test;
import java.util.Scanner;
public class Swap_array_values{
 public static void main (String args[]){
  Scanner abc=new Scanner(System.in);
  System.out.println("enter the 1st value");
  int a=abc.nextInt();
    int arr[]=new int[a];
  arr[0] = a;
	System.out.println("enter the 2nd value");
  int b=abc.nextInt();
 arr[1]=b;
 
 arr[2]=a+b;
 //System.out.println( arr[2]);
  arr[1]=arr[2]-arr[1];
  arr[0]=arr[2]-arr[0];
  System.out.println("0 position value"+arr[0]);
  System.out.println("1 position value"+arr[1]);
  
  }}