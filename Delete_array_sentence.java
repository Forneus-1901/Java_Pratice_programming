package test;
import java.util.Scanner;

public class Delete_array_sentence{

	public static void main(String[] args) {

		Scanner abc =new Scanner(System.in);
		System.out.println("Enter the Sentence");
		String a=abc.nextLine();
		if((char)32!=a.charAt(0)) {
			a=" "+a;
		}
		System.out.println("enter the word");
		String word=abc.nextLine();
		Delete_array_sentence obj=new Delete_array_sentence();
		int counting=obj.method2(a,word);
		//System.out.println(counting);
		for(int m=0;m<counting;m++) {
		a=obj.method1(a,word,counting);
		}
		System.out.println("Edit sentence="+a);
	}


	static String method1(String a,String word,int counting) {
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
		int arr[]=new int[a.length()];
		int update[]=new int[counting];
		int f=0;
		for(int c=1;c<arr.length;c++) {
			if(str[c]==sub[1]) {
				arr[f]=c;
				//	System.out.println("arr["+f+"]="+arr[f]);
				f++;
			}

		}
		int count=0;
		int flag=0;
		int o=0;
		for(int w=0;w<arr.length;w++) {
			int v=arr[w];
			int value=v-1;
			int position=value;
			if(value==-1) {
				break;
			}
			for(int q=0;q<sub.length;q++) {
				if(str[value]==sub[q]) {
					flag=1;
					value++;
				}
				else {
					flag=0;
					break;
				}
			}
			
			if(flag==1) {
			update[o]=position;
			count++;
		//	System.out.println("update["+o+"]="+update[o]);
			o++;
			}
		}
		int l=word.length();
		int p=0;
		int ok=0;
		String sen="";
	char total[]=new char[str.length];
		for(int i=0;i<str.length;i++) {
			if(i==update[p]) {
				i=i+l;
			}
			else {
				total[ok]=str[i];
				sen=sen+total[ok];
			//	System.out.println("total["+ok+"]="+total[ok]);
				ok++;
			}
			
		}

		return sen;




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

}


