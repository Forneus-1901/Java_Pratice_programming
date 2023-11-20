package test;

public class Multidimensional_2D_to_1D_array {

	public static void main(String[] args) {
		int length=0;
		int arr[][]= {{1,2,3},{4,5,6},{7,8,9,10}};
		int str[][]= {{11,12,13},{14,15,16},{17,18,19}};
		int count=0;
		for (int i = 0; i <arr.length;++i) {
	        length= length + arr[i].length ;
	    }
		
		for (int i = 0; i <str.length;++i) {
	        length= length + str[i].length ;
	    }
		
		System.out.println(length);
		
		int total[]=new int[length];
		for (int i = 0; i <arr.length;++i) {
			for(int j = 0; j <arr[i].length; ++j) {
				total[count]=arr[i][j];
				System.out.println("total["+count+"]="+total[count]);
				count++;
			}
		}
		for (int i = 0; i <str.length;++i) {
			for(int j = 0; j <str[i].length; ++j) {
				total[count]=str[i][j];
				System.out.println("total["+count+"]="+total[count]);
				count++;
			}
		}
	
	}

}
