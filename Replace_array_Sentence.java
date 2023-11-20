
package test;

import java.util.Scanner;

public class Replace_array_Sentence {


	public static void main(String[] args) {

		Scanner abc =new Scanner(System.in);
		System.out.println("Enter the Sentence");
		String a=abc.nextLine();
		if((char)32!=a.charAt(0)) {
			a=" "+a;
		}
		System.out.println("enter the word");
		String word=abc.nextLine();
		System.out.println("enter the word to replace");
		String put_word=abc.nextLine();
		int counting=method2(a,word);
		int position[]=new int[a.length()];
		
		int pos=0;
		for(int m=0;m<(counting+1);m++) {
		a=method1(a, word, abc, put_word,position,pos);
		position=method3(a,word);
		pos++;
		}
		System.out.println(a);
	
	}
	static String method1(String a,String word, Scanner abc,String put_word,int position[],int pos){
		char arr[]=new char[a.length()];
		for(int i1=0;i1<arr.length;i1++) {
			arr[i1]=a.charAt(i1);
		}
		System.out.println("");

		char str[]=new char[put_word.length()];
		for(int i1=0;i1<str.length;i1++) {
			str[i1]=put_word.charAt(i1);
		}
		
     if(pos==0) { 
    	 return a;
     }
	int	 c=position[0];
    
		//System.out.println("");
		//System.out.println("the position of word is="+c);
		String word_txt = word;
		//System.out.println("");
		int length1=word_txt.length();
	//	System.out.println("The length of the txt string is: " +length1);


		for(int i=0;i<arr.length;i++) {
			arr[i]=a.charAt(i);
		}
		

		String put_word_txt_2 = put_word;
		//System.out.println("");
		int length2=put_word_txt_2.length();
		//System.out.println("The length of the txt2 string is: " +length2 );

		int total=a.length()+length2-length1;
		char update[]=new char[total];



		int z=length1+c;
		int x=0;
		char sub[]=new char[(a.length()-z)];

		for(int i=z;i<arr.length;i++) {
			sub[x]=arr[i];
			x++;
		}



		
		for(int n=0; n<c;n++) {
			update[n]=arr[n];

		}

		for(int q=0; q<length2;q++) {
			update[c]=str[q];
			c++;
		}
		System.out.println();
		for(int q=0; q<sub.length;q++) {

			update[c]=sub[q];
			++c;

		}




		String n ="";
	for ( int p=0; p<update.length;p++) {
			n=n+update[p];
		}


	//	System.out.println(n);


		return n;
	}


	
	
	

	static int method2(String a,String word) { 


		char str[]=new char[a.length()];
		for(int i=0;i<str.length;i++) {
			str[i]=a.charAt(i);

		}
		int k=0;

		char sub[]=new char[word.length()+2];
		sub[k]=(char)32;
		k++;
		int m=0;
		for(int q=1;q<(sub.length-1);q++) {
			sub[k]=word.charAt(m);
			m++;
			k++;
		}

		sub[k]=(char)32;
		//		for(int q=0;q<sub.length;q++) {
		//		System.out.println("sub["+q+"]="+sub[q]);
		//		}

		int arr[]=new int[a.length()];
		int f=0;
		for(int c=1;c<arr.length;c++) {
			if(str[c]==sub[1]) {
				arr[f]=c;
				//	System.out.println("arr["+f+"]="+arr[f]);
				f++;
			}

		}
		int count=0;
		int final_count=0;
		for(int w=0;w<arr.length;w++) {
			int v=arr[w];
			int value=v-1;


			if(value==-1) {
				break;
			}
			for(int q=0;q<sub.length;q++) {

				//System.out.println(str[value]+"=="+sub[q]);
				if(str[value]==sub[q]) {
					count=1;
					value++;
				}
				else {
					count=0;

					break;
				}

			}

			if(count==1) {
				final_count++;

			}
		}

		return final_count;


	}
	static  int[] method3(String a,String word) { 


		char str[]=new char[a.length()];
		for(int i=0;i<str.length;i++) {
			str[i]=a.charAt(i);

		}
		int k=0;

		char sub[]=new char[word.length()+2];
		sub[k]=(char)32;
		k++;
		int m=0;
		for(int q=1;q<(sub.length-1);q++) {
			sub[k]=word.charAt(m);
			m++;
			k++;
		}

		sub[k]=(char)32;
		//		for(int q=0;q<sub.length;q++) {
		//		System.out.println("sub["+q+"]="+sub[q]);
		//		}

		int arr[]=new int[a.length()];
		int f=0;
		for(int c=1;c<arr.length;c++) {
			if(str[c]==sub[1]) {
				arr[f]=c;
				//	System.out.println("arr["+f+"]="+arr[f]);
				f++;
			}

		}
		int count=0;
		int pos=0;
	int[]	 power=new int[a.length()];
	int	final_count=0;
		for(int w=0;w<arr.length;w++) {
			int v=arr[w];
			int value=v-1;


			if(value==-1) {
				break;
			}
			for(int q=0;q<sub.length;q++) {

				//System.out.println(str[value]+"=="+sub[q]);
				if(str[value]==sub[q]) {
					
					count=1;
					value++;
					
					
				}
				else {
					count=0;

					break;
				}

			}

			if(count==1) {
				final_count++;
				power[pos]=v;
				pos++;			
			}
		}

		return power;


	}

}





