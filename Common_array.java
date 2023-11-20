package test;

public class Common_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub



		int arr[]= {5,7,9,3,6};

		int str[]= {3,4,7,1,9};		


		for (int i =0;i<arr.length;i++) {


			for (int j=0;j<arr.length;j++) {

				if(str[i]==arr[j]) {
					System.out.print(str[i]+" ");

				}


			}
		}


	}

}
