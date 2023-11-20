package test;
import java.util.Scanner;
public class Finding_Small_large_Sequence_string {

	public static void main(String[] args) {
		Scanner abc=new Scanner (System.in);
		System.out.println("enter the sentence");
		String text=abc.next();
		if((int)text.length()!=32){
			text=text+" ";
		}
		char arr[]=new char[text.length()];

		for(int a=0;a<text.length();a++) {	
			arr[a]=text.charAt(a);

		}
		int b;
		int start=0;
		int position=(int)text.charAt(0);
		String str[]=new String[arr.length];
		String word=" ";
		for(int a=0;a<arr.length;) {
			if((int)arr[a]==32) {
				break;
			}
			int	c=a;
			int d=(int)arr[a];
			for( int b1=0;b1<arr.length;b1++) {
				//System.out.println((int)arr[c]+"=="+d);
				//System.out.println((int)arr[c]==d);
				if((int)arr[c]==d) {
					word=word+arr[c];

				}
				else if((int)arr[c]!=d)	{

					break;
				}
				d++;
				c++;
			}
			//System.out.println(word.length()+"!="+1);
			if(word.length()!=2) {
				str[start]=word;
				//	System.out.println(	"str["+start+"]="+word);
				start++;

			}
			else {
				a++;
			}
			a=a+(word.length()-1);
			word=" ";
		}
		
		int large=0;
		int pos1=0;
		int pos2=0;
		int small=str[0].length();
		for(int a=0;a<str.length;a++) {
			if(str[a]==null) {
				break;
			}
			if(str[a].length()>large) {
				large=str[a].length();
				pos1=a;
				}
			if(str[a].length()<=small) {
				small=str[a].length();
				pos2=a;
				}

		}
		
		int length1=str[pos1].length();
		int length2=str[pos2].length();
		for(int a=0;a<str.length;a++) {
			if(str[a]==null) {
				break;
			}
			
			if(str[a].length()==length1) {
			System.out.println("Largest String="+str[a]);
			}
			if(str[a].length()==length2) {
				System.out.println("Smallest String="+str[a]);
				}
		
		
		}
	}

}
