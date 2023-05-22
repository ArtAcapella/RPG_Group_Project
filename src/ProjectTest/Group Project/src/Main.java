// Ethan Reynolds

import java.util.*;
import java.lang.Thread;

public class Main {

	public static void main(String[] args) {
		System.out.println("Welcome to Breach!\nYou are a hacker in the future and you will need to hack to stay alive?");
		System.out.println("Group Members: Henry Dunn, Alice Leppert, Ethan Reynolds, Mike Torianyk, and Soonhwi Kwon");
		System.out.println("To start the game, press 1");
		Scanner sc = new Scanner(System.in);
		int play = sc.nextInt();

		if (play == 1) {
			Combat c1 = new Combat(5);
			c1.FragCon();
			//Pier p1 = new Pier(10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10);


		} else {
			System.out.println("Invalid Input");
		}

	}

}
