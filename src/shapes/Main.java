package shapes;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int userChoice;
		do {
			System.out.println("Do you want to:");
			System.out.println("1. Create a shape");
			System.out.println("2. View a shape");
			System.out.println("3. Change a shape");
			System.out.println("4. Quit");
			try {
				userChoice = in.nextInt();
			} catch (InputMismatchException e) {
				userChoice = 4;
				System.out.println("I guess you don't want to use this program today");
			}
			
			if (userChoice==1) {
				
			}else if (userChoice==2) {
				
			}else if (userChoice==3) {
				
			}
		} while (userChoice != 4);
	}
}
