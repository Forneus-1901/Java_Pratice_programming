package test;


public class Combine_array_same_different{

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		
		int arr[]= {5,8,1,3,6};

		int str[]= {3,4,1,2,9};	
		int total = arr.length+str.length;
		int sub[]=new int[total];
		int k=0;

		for (int i =0;i<str.length;i++) {


			for (int j=0;j<arr.length;j++) {

				if(str[i]==arr[j]) {
					sub[k]=str[i];
					System.out.print(str[i]+" ");
					k++;
				}


			}
		}
		int m=k-1;
		int flag=0;
		for(int j=0;j<arr.length;j++) {

			for(int n=0;n<=m;n++) {
				if(arr[j]==sub[n]) {
					flag=1;
				}


			}

			if(flag==0) {
				sub[k]	=arr[j];
				System.out.println("\n This is different element in the array arr[]="+arr[j]);
				k++;
			}

			flag=0;
		}

		int fowl=0;
		for(int j=0;j<str.length;j++) {

			for(int n=0;n<=m;n++) {
				if(str[j]==sub[n]) {
					fowl=1;
				}


			}

			if(fowl==0) {
				
				System.out.println("\n This is different element in the array str[]="+str[j]);
				sub[k]	=str[j];
				k++;
			}

			fowl=0;
		}
		for(int j=0;j<k;j++) {
			System.out.println("int["+j+"] sub="+sub[j]);
		}
	}
}