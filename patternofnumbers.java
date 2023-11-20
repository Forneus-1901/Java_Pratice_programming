package test;
import java.util.*;
public class patternofnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=1; 
		
		int b=10;
		for (a=1; a<=b;a++) {		  

			for ( int j=1;j<=a;j++) {
				System.out.print(j);

			} 
			
			for(int k=a;k>0;k--) {
				if(k != a)
					System.out.print(k);
			}
			System.out.println("");
		}


	}

}

//1
//121
//12321