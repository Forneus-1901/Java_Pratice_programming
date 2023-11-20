package test;

import java.util.Scanner;

public class Pratice {


	public static void main(String[] args) {

		Scanner abc =new Scanner(System.in);
		System.out.println("enter the sentence");
		String a=abc.nextLine();
		System.out.println("enter the word");
		String word=abc.nextLine();
		
		int times=method2(a, word);
		
		System.out.println("enter the word you want to put");
		String put_word=abc.nextLine();

		for(int repeat=0;repeat<times;repeat++) {
			char arr[]=new char[a.length()];
			for(int i1=0;i1<arr.length;i1++) {
				arr[i1]=a.charAt(i1);
			}
			//System.out.println("");

			char str[]=new char[put_word.length()];
			for(int i1=0;i1<str.length;i1++) {
				str[i1]=put_word.charAt(i1);
			}
			char easy[]=new char[1];

			easy[0]=word.charAt(0);

			
			a=method1(word, a, abc, arr,put_word,str);

			
			arr=new char[a.length()];
		}
		System.out.println("output="+a);
	}
	static String method1(String word,String a,Scanner abc,char arr[],String put_word,char str[]){




		int c=a.indexOf(word);
	//System.out.println("");
	//	System.out.println("the position of word is="+c);
		if(c==-1) {
		return a;
		}
		String word_txt = word;
		//System.out.println("");
		int length1=word_txt.length();
		//System.out.println("The length of the txt string is: " +length1);


		for(int i=0;i<arr.length;i++) {
			arr[i]=a.charAt(i);
		}
	
		String put_word_txt_2 = put_word;
	//	System.out.println("");
		int length2=put_word_txt_2.length();
	//	System.out.println("The length of the txt2 string is: " +length2 );

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
		//System.out.println();
		for(int q=0; q<sub.length;q++) {

			update[c]=sub[q];
			++c;

		}

	//System.out.println("");
	

		String n ="";
		for ( int p=0; p<update.length;p++) {
			n=n+update[p];
		}


		//System.out.println(n);


		return n;
	}
	
	static int method2(String a,String word) { 


		char str[]=new char[a.length()];
		for(int i=0;i<str.length;i++) {
			str[i]=a.charAt(i);

		}
		int k=0;

		char sub[]=new char[word.length()];
		
		
		for(int q=0;q<sub.length;q++) {
			sub[q]=word.charAt(q);
			
		}

		
		//		for(int q=0;q<sub.length;q++) {
		//		System.out.println("sub["+q+"]="+sub[q]);
		//		}

		int arr[]=new int[a.length()];
		int f=0;
		for(int c=1;c<arr.length;c++) {
			if(str[c]==sub[1]) {
				arr[f]=c;
				
				f++;
			}

		}
		int count=0;
		int final_count=0;
		for(int w=0;w<arr.length;w++) {
			
			int value=arr[w];


			
			for(int q=0;q<sub.length;q++) {

				
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
	

}