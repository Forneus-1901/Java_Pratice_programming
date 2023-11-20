package test;
import java.util.Random;
import java.util.Scanner;
public class Guessing_game {

	public static void main(String[] args) {
		Random cat=new Random();
		Scanner abc=new Scanner(System.in);

		int a=cat.nextInt(101);
		System.out.println("the number is between 0 to 100");
		for(int a1=1;a1<=5;a1++) {

			System.out.println("Guess the number");
			int b=abc.nextInt();
			if(b==a) {
				System.out.println("Huraay you guess a right number ");
				break;
			}
			else if(b>a) {
				System.out.println("sorry you are guessing a high value");

			}

			else if(b<a) {
				System.out.println("sorry you are guessing a low value");
			}
			if(a1==5) {
				System.out.println("the number is="+a);
			}

		}


	}

}
