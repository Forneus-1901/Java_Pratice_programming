package test;

public class NUMBER_REPEATED_MAXIMUM_TIME_SEARCH_CODE_IN_ARRAY {

	public static void main(String[] args) {
		int arr[]= { 1,4,6,4,6,3,8,3,5,4,4,4,4,7,7,7,7,5,2,5,3,5,4,6,4,6};
		int str[]=new int[arr.length];
		int m=0;
		for(int a=0;a<arr.length;a++) {
			int check=0;
			for(int b=0;b<str.length;b++) {
				if(arr[a]==str[b]) {
					check=1;
					break;
				}
			}
			if(check==0) {
				str[m]=arr[a];
				m++;
			}
		}
		int total[]=new int[m];
		//		for(int b=0;b<m;b++) {
		//			System.out.println("str["+b+"]="+str[b]);
		//		}	
		int num=0;
		int repeat=0;
		for(int b=0;b<m;b++) {
			int count=0;
			for(int a=0;a<arr.length;a++) {
				if(str[b]==arr[a]) {
					count++;
				}
			}
			total[b]=count;
			if(count>repeat) {
				num=b;
				repeat=count;
			}
		}
		for(int b=0;b<m;b++) {
					if(repeat==total[b]) {
						System.out.println("The number repeated maximum time are="+str[b]);
					}
				}
		
	
	}
}
