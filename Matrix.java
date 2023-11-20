package test;

public class Matrix {
	  public static void main(String[] args) {
		  int total=0;
	    int[][] arr = { {1, 2, 3}, {6, 7, 8},{9,4,5} };
	    for (int i = 0; i <arr.length;++i) {
	        total= total + arr[i].length ;
	    }
	    System.out.println(total);
	  }
	}