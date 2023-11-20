package test;
import java.util.Scanner;
public class ROCK_PAPER_SCISSOR_GAME {



	public static void main(String[] args) {
		Scanner abc=new Scanner(System.in);
		System.out.println("START THE GAME");
		System.out.println("//   RULES   // \nEnter  your choice :\nFOR THE SCISSOR=S \nFOR THE PAPER=P \nFOR THE ROCK=R \nFOR EXIT THE GAME OR QUIT=Q/E ");
		System.out.println(" ");
		for(int a=0;a<1000;a++) {
			method(abc);
		}
	}
	static  String method(Scanner abc) {
		
			char S='S',P='P',R='R',E='E',Q='Q';
			System.out.println("ENTER FIRST PERSON CHOICE?(R/S/P/Q/E):");
			String FirstPerson=abc.next().toUpperCase();
			char FP=FirstPerson.charAt(0);
			if(FP==E || FP==Q) {
				System.out.println("GAME END");
				return null;
			}
			if(FP==S || FP==P || FP==R) {
				System.out.println("OK NEXT PERSON TURN TO ENTER PLEASE WAIT FOR WHILE");
			}
			else {
				System.out.println("PLEASE ENTER  THE CHOICE FROM GIVEN OPTIONS");
				method(abc);
				
			}
			System.out.println(" ");
			System.out.println("ENTER SECOND PERSON CHOICE ?(R/S/P/Q/E):");
			String SecondPerson=abc.next().toUpperCase();
			char SP=SecondPerson.charAt(0);
			if( SP==E || SP==Q) {
				System.out.println("GAME END");
				return null;
			}
			if(SP==S || SP==P || SP==R) {
				System.out.println("OK LETS PROCEED");
			}
			else {
				System.out.println("PLEASE ENTER  THE CHOICE FROM GIVEN OPTIONS");
				method(abc);
				
			}
		
		if(FP==P && SP==P || FP==R&& SP==R || FP==S && SP==S) {
			System.out.println("THE GAME IS TIE NO ONE WIN \n PLAY AGAIN!!!");
		}
		else if(FP==P && SP==S) {
			System.out.println("Second person win beacuse paper cut by scissor");
		}
		else if(FP==P && SP==R) {
			System.out.println("First person win beacuse paper stop  rock ");
		}
		else if(FP==R && SP==S) {
			System.out.println("First person win beacuse rock destroy by scissor");
		}

		else if(FP==R && SP==P) {
			System.out.println("Second person win beacuse paper stop  rock");
		}
		else if(FP==S && SP==P) {
			System.out.println("First person win beacuse paper cut by scissor");
		}
		else if(FP==S && SP==R) {
			System.out.println("Second person win beacuse rock destroy by scissor");
		}
		return null;

	}
}
