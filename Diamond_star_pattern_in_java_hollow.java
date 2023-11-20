package test;

public class Diamond_star_pattern_in_java_hollow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int v=5;
		int j=4;
		int z=1;

		for(int a=1;a<=5;a++) {

			for(int n=0;n<j;n++ ) {
				System.out.print(" ");
			}
			j--;
			for(int q=0;q<5;q++) {
				if(q==0) {
					System.out.print("*");
				}			
			}
			for(int n=0;n<z;n++ ) {
				System.out.print(" ");
			}
			z=z+(z++);
			if(z>4) {
				z=z-2;
				if(z>7) {
					z=z-2;
				}
			}
			if(a!=1) {
				for(int q=0;q<4;q++) {
					if(q==0) {
						System.out.print("*");
					}			
				}
			}


			System.out.println("");
		}	
		int y=6;
		int l=1;
		for(int i=0;i<4;i++) {
			for(int n=0;n<l;n++) {
				System.out.print(" ");
			}
			l++;
			for(int q=0;q<5;q++) {
				if(q==0) {
					System.out.print("*");
				}			
			}
			for(int m=0;m<y;m++) {
				System.out.print(" ");
			}
			y=y-2;
			if(i<3) {

				for(int q=0;q<3;q++) {
					if(q==0) {
						System.out.print("*");
					}			
				}
			}
			System.out.println("");

		}

	}

}
