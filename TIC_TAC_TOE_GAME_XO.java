package test;
import java.util.*;
public class TIC_TAC_TOE_GAME_XO {

	public static void main(String[] args) {
		Scanner abc=new Scanner(System.in);
		for(int a=0;a<50000;a++) {
			System.out.println("  ");
			System.out.println("  ");
			System.out.println("  ");
			System.out.println("    *****   STARTING  NEW GAME !!!   ***** ");
			System.out.println("  ");
			System.out.println("  ");
			System.out.println("  ");
			
			String plus=method2(abc);
			method1(abc,plus);
		}
	}

	static void method3(char arr[]) {
		System.out.println("                   ");
		System.out.println("                   ");
		System.out.println("                   ");
		System.out.println("|-------|-------|--------|");
		System.out.println("|  "+arr[0]+"    |   "+arr[1]+"   |   "+arr[2]+"    | ");
		System.out.println("|-------|-------|--------|");
		System.out.println("|  "+arr[3]+"    |   "+arr[4]+"   |   "+arr[5]+"    | ");
		System.out.println("|-------|-------|--------|");
		System.out.println("|  "+arr[6]+"    |   "+arr[7]+"   |   "+arr[8]+"    | ");
		System.out.println("|-------|-------|--------|");
		System.out.println("                   ");
		System.out.println("                   ");
		System.out.println("                   ");
		return;


	}
	static void method4(char arr[]) {
		System.out.println("CHOOSE THE POSITION  FORM THE GIVEN NUMBER:");
		System.out.println("                   ");
		System.out.println("                   ");
		System.out.println("                   ");
		System.out.println("|-------|-------|--------|");
		System.out.println("|  "+0+"    |   "+1+"   |   "+2+"    | ");
		System.out.println("|-------|-------|--------|");
		System.out.println("|  "+3+"    |   "+4+"   |   "+5+"    | ");
		System.out.println("|-------|-------|--------|");
		System.out.println("|  "+6+"    |   "+7+"   |   "+8+"    | ");
		System.out.println("|-------|-------|--------|");
		System.out.println("                   ");
		System.out.println("                   ");
		System.out.println("                   ");
		return;

	}
	static void method1(Scanner abc ,String plus) {
		char F1=plus.charAt(0);
		char F2=plus.charAt(1);
		char arr[]=new char[9];
		int  flag=0;
		if(F1=='X') {
			for(int a=0;a<5;a++) {
				method4(arr);
				System.out.println("FIRST PLAYER CHOICE  ");
				method5( arr, abc);
				method3(arr);
				flag=checking(arr);
				if(flag==1) {
					break;
				}
				if(a!=4) {
					method4(arr);
					System.out.println("SECOND PLAYER CHOICE  ");
					method6( arr, abc);
				}
				flag=checking(arr);
				method3(arr);
				if(flag==1) {
					break;
				}
			}
		}
		else {

			for(int a=0;a<5;a++) {
				method4(arr);
				System.out.println("FIRST PLAYER CHOICE  ");
				method6( arr, abc);
				method3(arr);
				flag=checking(arr);
				if(flag==1) {
					break;
				}
				if(a!=4) {
					method4(arr);
					System.out.println("SECOND PLAYER CHOICE  ");
					method5( arr, abc);
				}
				flag=checking(arr);
				method3(arr);
				if(flag==1) {
					break;
				}
			}
		}
	}
	static void method5(char arr[],Scanner abc) {


		System.out.println("please enter the position : ");
		int position=abc.nextInt();
		if(position>=0 && position<=8) {
			if(arr[position]!='X' && arr[position]!='O') {
				arr[position]='X';
				System.out.println("we have enter   'X'   selected position Sucessfully");
			}
			else {
				System.out.println("please enter the other postion the postion is already occupied");
				method5( arr, abc);
			}
		}
		else {
			System.out.println("please enter the right postion from 0 to 8");
			method5( arr, abc);

		}
	}
	static void method6(char arr[],Scanner abc) {


		System.out.println("please enter the position : ");
		int position=abc.nextInt();
		if(position>=0 && position<=8) {
			if(arr[position]!='X' && arr[position]!='O') {
				arr[position]='O';
				System.out.println("we have enter   'O'   selected position Sucessfully");
			}
			else {
				System.out.println("please enter the other postion the postion is already occupied");
				method6( arr, abc);
			}
		}
		else {
			System.out.println("please enter the right postion from 0 to 8");
			method6( arr, abc);
		}

	}

	static boolean getAsciiValue(char c) {
		return (int)c != 0;
	}


	static int checking(char arr[]) {
		int flag=0;

		if((arr[0] == arr[4]) && (arr[0] == arr[8]) && (getAsciiValue(arr[4]) && getAsciiValue(arr[0])  && getAsciiValue(arr[8]) )) {
			flag=1;
			//System.out.println("1");
			System.out.println("USER WIN = "+arr[0]);
		}

		else   if((arr[0] == arr[1]) && (arr[0] == arr[2] ) && (getAsciiValue(arr[0]) && getAsciiValue(arr[1])  && getAsciiValue(arr[2]) )) {
			flag=1;
			//System.out.println("2");
			System.out.println("USER WIN = "+arr[0]);
		}
		else if((arr[0] == arr[3]) && (arr[0] == arr[6] )&& (getAsciiValue(arr[0]) && getAsciiValue(arr[3])  && getAsciiValue(arr[6]) )) {
			flag=1;
			//System.out.println("3");
			System.out.println("USER WIN = "+arr[0]);
		}
		else if((arr[1] == arr[4]) && (arr[1] == arr[7]) && (getAsciiValue(arr[4]) && getAsciiValue(arr[1])  && getAsciiValue(arr[7]) )) {
			flag=1;
//			System.out.println("4");
			System.out.println("USER WIN = "+arr[1]);
		}
		else if((arr[2] == arr[5]) && (arr[2] == arr[8]) && (getAsciiValue(arr[5]) && getAsciiValue(arr[2])  && getAsciiValue(arr[8]) )) {
			flag=1;
//			System.out.println("5");
			System.out.println("USER WIN = "+arr[2]);
		}
		else if((arr[2] == arr[4]) && (arr[2] == arr[6]) && (getAsciiValue(arr[4]) && getAsciiValue(arr[2])  && getAsciiValue(arr[6]) )) {
			flag=1;
//			System.out.println("6");
			System.out.println("USER WIN = "+arr[2]);
		}
		else if((arr[3] == arr[4]) && (arr[3] == arr[5]) && (getAsciiValue(arr[4]) && getAsciiValue(arr[3])  && getAsciiValue(arr[5]) )) {
			flag=1;
//			System.out.println("7");
			System.out.println("USER WIN = "+arr[3]);
		}
		else if((arr[6] == arr[7]) && (arr[8] == arr[6]) && (getAsciiValue(arr[6]) && getAsciiValue(arr[7])  && getAsciiValue(arr[8]) )) {
			flag=1;
//			System.out.println("8");
			System.out.println("USER WIN = "+arr[6]);
		}
		else if(getAsciiValue(arr[0]) && getAsciiValue(arr[1])  && getAsciiValue(arr[2])&& getAsciiValue(arr[3]) && getAsciiValue(arr[4])  && getAsciiValue(arr[5])&& getAsciiValue(arr[6]) && getAsciiValue(arr[7])  && getAsciiValue(arr[8])) {
			System.out.println("SORRY THE MATCH IS TIE");
		}
		return flag;

	}
	static String method2(Scanner abc) {
		String plus="  ";
		System.out.println( "CHOOSE ONLY ONE FROM =(X) and (O)");
		System.out.println("FOR EXIT = (E) ");
		System.out.println("ENTER THE FIRST PLAYER CHOICE");
		char F1=abc.next().charAt(0);
		char F2=' ';
		if(F1>=97 && F1<=122) {
			int convert=(int)F1-97;
			convert=convert+65;
			F1=(char)convert;
		}
		System.out.println( "Because  player 1 choose="+F1);
		System.out.println("please enter =("+(F1 == 'X'?'O':'X')+")");
		System.out.println("AND FOR EXIT = (E) ");
		System.out.println("ENTER THE SECOND PLAYER CHOICE");
		F2=abc.next().charAt(0);
		if((int)F2>=97 && (int)F2<=122) {
			int convert=(int)F2-97;
			convert=convert+65;
			F2=(char)convert;
		}

		if((F1!='X' || F2!='X') && (F1!='O' || F2!='O')) {
			if(F1=='E' || F1=='Q'||F2=='E' || F2=='Q') {
				System.out.println("YOU HAVE EXIT THE GAME \n GAME START AGAIN !!!");
				method2(abc);
			}
			else {
				System.out.println("THE INPUT CHARACTER SHOULD  BE  X  OR  O");
			}
		}
		else if(F1==F2) {
			System.out.println("    BOTH HAVE SELECTED SAME \n  GAME WILL BE RESTART  !!!!");
			System.out.println("                   ");
			System.out.println("                   ");
			System.out.println("                   ");
			method2(abc);
		}
		else {
			plus=F1+""+F2;
		}

		return plus;
	}
}
