package test;
import java.util.Scanner;
public class First_char_capital_String_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner abc=new Scanner(System.in);
		System.out.println("enter the sentence");
		String a=abc.nextLine();
		char arr[]=new char[a.length()];
		for(int i=0;i<arr.length;i++) {
			arr[i]=a.charAt(i);
			//System.out.println("arr["+i+"]="+arr[i]);
		}
		int j=0;
		int update[]=new int[arr.length];
		char str[]=new char[1];
		str[0]= (char)32;
		for(int i=0;i<arr.length;i++) {
			if((char)arr[i]==str[0]) {
			update[j]= i;
			//System.out.println("update["+j+"]="+update[j]);
			j++;
			}

		}
	
	if((int)arr[0]>=97 && (int)arr[0]<=122) {
	int value=	(int)arr[0];
		int pos=value-97;
		arr[0]=(char) (65+pos);
		
	}
	 for (int i=0;i<update.length;i++) {
		 
		 if((int)arr[(update[i]+1)]>=97 && (int)arr[(update[i]+1)]<=122 && (update[i]+1)!=1) {
				int value=	(int)arr[(update[i]+1)];
					int pos=value-97;
					arr[(update[i]+1)]=(char) (65+pos);
				//	System.out.println("arr["+(update[i]+1)+"]="+(char) (65+pos));
		 }
		 }
	 String  update_version="";
		 for(int i=0;i<arr.length;i++) {
			 update_version=update_version+arr[i];
			// System.out.println("arr["+i+"]="+arr[i]);
			}
	 System.out.println(update_version);
	}

}
