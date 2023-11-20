package test;

public class Transpose_matrix {

	public static void main(String[] args) {
		int str[][]= {{11,12,13},{14,15,16},{17,18,19}};
		int arr[][]=new int[3][3];
		
		int m=0;
		for (int i = 0; i <str.length;++i) {
			
			for(int j = 0; j <str[i].length; ++j) {
				arr[i][j]=str[m][i];
				
				m++;
				if(m==arr.length) {
					break;
				}
			}
			m=0;
			
		}
		for (int i = 0; i <arr.length;++i) {
			for(int j = 0; j <arr[i].length; ++j) {
			
			System.out.print(arr[i][j]+" ");
			}
			System.out.println("");
			}
	}

}
