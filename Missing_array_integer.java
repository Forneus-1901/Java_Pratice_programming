package test;

public class Missing_array_integer {

	public static void main(String[] args) {

		int arr[]=new int[100];

		for(int a=1,b=0;b<arr.length;a++,b++) {
			arr[b]=a;
		}

		int str[]=new int[100];

		for(int a=1,b=0;b<str.length;a++,b++) {
			if(a==2 || a==9 || a==7) {
				a++;
				b++;
			}
			str[b]=a;
			//System.out.println(str[b]);
		}
		int present[]=new int[100];
		int start=0;
		int flag=0;
		for(int a=1;a<arr.length;a++) {

			for(int b=1;b<str.length;b++) {
				if(arr[a]==str[b]) {
					flag=0;
					break;
				}
				else {
					flag=1;
				}
			}
			if(flag==1) {
				present[start]=arr[a];
				System.out.println(present[start]);
				start++;
				flag=0;
			}


		}
	}

}
