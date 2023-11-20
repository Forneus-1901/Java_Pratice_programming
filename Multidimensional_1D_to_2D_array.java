package test;

public class Multidimensional_1D_to_2D_array {

	public static void main(String[] args) {
		int c=0;
		int arr[] ={1,2,3,4,5,6,7,8,9};
		int str[][]=new int[3][3]; 
		for(int q=0;q<str.length;q++){
			for(int m=0;m<str[q].length;m++){
				str[q][m]=arr[c];
				System.out.println("str["+q+"]["+m+"]="+str[q][m]);
				c++;


			}

		}

	}
}
