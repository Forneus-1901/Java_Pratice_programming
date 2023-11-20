package test;

public class Multidimesional_add_two_array {

	public static void main(String[] args) {
		int length=0;
		int arr[][]= {{1,2,3},{4,5,6},{7,8,9}};
		int str[][]= {{1,2,3},{4,5,6},{7,8,9}};
		for (int i = 0; i <arr.length;++i) {
	        length= length + arr[i].length ;
	    }
		
		for (int i = 0; i <str.length;++i) {
	        length= length + str[i].length ;
	    }
		
		System.out.println(length);
		int count =0;
		int total[]=new int[length];
		 for (int i = 0; i <arr.length;++i) {
			 for(int j = 0; j <arr[i].length; ++j) {
			 int q=arr[i][j]+str[i][j];
			 total[count]=q;
			 System.out.println("total["+count+"]="+total[count]);
			 count++;
			 }
		 }
	}

}
