package test;

public class Number_patten {

	public static void main(String[] args) {
		int a=4;
		int b=4;
		int c=2;
		int d=2;
		for(int m=1;m<=4;m++){
		for(int i=1;i<=a;i++) {
			System.out.print(i);
		}
		a--;
		if(m>1) {
			for(int k=1;k<=c;k++) {
				System.out.print("*");
			}
			c=c+2;
		}
		for(int i=b;i>0;i--) {
			System.out.print(i);
		}
		b--;
		if(a==0) {
			break;
		}
		System.out.println("");
		}
	}

}
