package test;
import java.util.Scanner;
public class Palidrome_largest_smallest_string {

	public static void main(String[] args) {
		Scanner abc =new Scanner (System.in);
		System.out.println("enter the sentence");
		String text=abc.nextLine();
		char arr[]=new char[text.length()];
		for (int a=0;a<arr.length;a++) {
			arr[a]=text.charAt(a);
		}
		char str[]=new char [arr.length];
		int start=0;
		int flag=0;
		int lol=0;
		int now=0;
		int bob = 0;
		String smaller=" ";
		String larger=" ";
		String hype[]=new String[text.length()];
		int first=0;
		for (int a=0;a<arr.length;a++) {

			if((int)arr[a]==32) {

				if(start==0 ||start==1) {
					start=0;
					str=null;

					str=new char [arr.length];

					continue;
				}
				int  s=0;
				String word=" ";
				char count[] = null;
				int end=str.length-1;
				count=new char[start];
				for(int q=(start-1);q>=0;q--) {

					count[s]=str[q];
					//	System.out.println("count["+s+"]="+count[s]);
					word=word+count[s];
					end--;
					s++;
				}

				for(int q=0;q<count.length;q++) {
					//System.out.println(count[q]+"=="+str[q]);
					if(count[q]==str[q]) {
						flag=1;

					}
					else {
						flag=0;
						break;
					}
				}
				if(flag==1) {
					System.out.println("Word which are palindrome in sentence="+word);

					if(word.length()>=lol) {
						if(word.length()==lol) {
							hype[first]=word;
							first++;
						}
						else {
							lol=word.length();
							larger=word;
						}
					}

					if(word.length()<=bob || now==0) {
						if(word.length()==bob) {
							hype[first]=word;
							first++;

						}
						else {
							bob=word.length();
							smaller=word;

						}
						now=1;
					}


				}
				start=0;
				str=null;
				count=null;
				str=new char [arr.length];
				count=new char[str.length];
			}
			else {
				str[start]=arr[a];
				
				if(str[start]==(text.length()-1 )) {
					break;
				}
				//System.out.println("str["+start+"]="+str[start]);
				start++;
			}}
		System.out.println("larger="+larger);
		System.out.println("smaller="+smaller);

		for(int a=0;a<hype.length;a++) {
			if(hype[a]!=null) {
				if(hype[a].length()==larger.length()) {
					System.out.println("larger="+hype[a]);	
				}
				if(hype[a].length()==smaller.length()) {
					System.out.println("smaller="+hype[a]);	
				}
			}
			else {
				break;
			}
		}

		
	}

}