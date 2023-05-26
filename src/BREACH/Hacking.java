// Ethan Reynolds

import java.util.*;
import java.time.LocalTime;
import java.io.*;

public class Hacking {

	// Henry Dunn
	public static int FragCon(int level, int aHacking) {
		int ICElvl = level;
		int toBeatICE = 1;
		int addBreach = 0;
		boolean play = true;
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);

		System.out.println("Initiating Breach Protocol...");
		System.out.println(".");
		System.out.println("..");
		System.out.println("...");

		while (play) {
			toBeatICE++;
			System.out.println("ICE level " + ICElvl + ": Minimum " + toBeatICE + " fragments to upload.");

			List<String> wordList = new ArrayList<>();

			String[] wordA = { "AB", "AF", "AA", "AM" };
			String[] wordB = { "BA", "BF", "BB", "BM" };
			String[] wordM = { "MB", "MF", "MM", "MA" };
			String[] wordF = { "FB", "FA", "FF", "FM" };
			String[] word9 = { "9F", "9A", "9B", "9M", "C9" };
			String[] wordC = { "CB", "CA", "CC", "FC", "9C", "CW" };
			String[] wordW = { "WA", "WF", "WW", "WC", "W9", "AW" };
			String[] wordK = { "BK", "FK", "KF", "KM", "9K", "KA", "CK" };

			wordList.add(wordA[rand.nextInt(wordA.length)] + ", " + wordB[rand.nextInt(wordB.length)] + ", "
					+ wordM[rand.nextInt(wordM.length)] + ", " + wordF[rand.nextInt(wordF.length)]);

			if (ICElvl == 1) {
				wordList.add(wordA[rand.nextInt(wordA.length)] + ", " + wordB[rand.nextInt(wordB.length)] + ", "
						+ wordM[rand.nextInt(wordM.length)] + ", " + wordF[rand.nextInt(wordF.length)]);
				wordList.add(word9[rand.nextInt(word9.length)] + ", " + wordC[rand.nextInt(wordC.length)] + ", "
						+ wordW[rand.nextInt(wordW.length)] + ", " + wordK[rand.nextInt(wordK.length)] + ", "
						+ wordK[rand.nextInt(wordK.length)] + ", " + word9[rand.nextInt(word9.length)] + ", "
						+ word9[rand.nextInt(word9.length)] + ", " + wordC[rand.nextInt(wordC.length)] + ", "
						+ wordW[rand.nextInt(wordW.length)] + ", " + wordK[rand.nextInt(wordK.length)] + ", "
						+ wordK[rand.nextInt(wordK.length)]);
			}
			if (ICElvl == 2) {
				wordList.add(wordA[rand.nextInt(wordA.length)] + ", " + wordB[rand.nextInt(wordB.length)] + ", "
						+ wordM[rand.nextInt(wordM.length)] + ", " + ", " + wordK[rand.nextInt(wordK.length)]
						+ wordF[rand.nextInt(wordF.length)]);
				wordList.add(word9[rand.nextInt(word9.length)] + word9[rand.nextInt(word9.length)] + ", " + ", "
						+ wordC[rand.nextInt(wordC.length)] + ", " + wordW[rand.nextInt(wordW.length)] + ", "
						+ wordK[rand.nextInt(wordK.length)] + ", " + wordK[rand.nextInt(wordK.length)]);
			}
			if (ICElvl == 3) {
				wordList.add(word9[rand.nextInt(word9.length)] + ", " + wordC[rand.nextInt(wordC.length)] + ", "
						+ wordW[rand.nextInt(wordW.length)] + ", " + wordK[rand.nextInt(wordK.length)] + ", "
						+ wordK[rand.nextInt(wordK.length)]);
			} else {
				wordList.add(word9[rand.nextInt(word9.length)] + ", " + wordC[rand.nextInt(wordC.length)] + ", "
						+ wordW[rand.nextInt(wordW.length)] + ", " + wordK[rand.nextInt(wordK.length)] + ", "
						+ wordK[rand.nextInt(wordK.length)]);
			}
			while (addBreach >= 1) {
				wordList.add(wordK[rand.nextInt(wordK.length)]);
				addBreach = addBreach - 1;
			}

			System.out.println(wordList);

			String input = sc.nextLine();
			int validInp = 0;

			StringBuilder sb = new StringBuilder(input);
			int i = 1;
			char l1 = 'x';
			char l2 = 'x';
			boolean runHack = true;
			while (i <= (input.length() - 3) && runHack) {
				l1 = sb.charAt(i);
				l2 = sb.charAt(i + 1);
				if (l1 != l2) {
					System.out.println("ERROR");
					runHack = false;
					play = false;
					ICElvl--;
				}
				if (l1 == l2) {
					System.out.println(l1 + " = " + l2 + " VERIFIED");
					validInp++;
					i = i + 2;
				}
			}
			System.out.println("ICE score: " + validInp);
			if (validInp >= toBeatICE) {
				System.out.println("ICE layer passed! Additional breaches: " + (validInp - toBeatICE));
				addBreach = validInp - toBeatICE;
				System.out.println("Decending... \n. \n..\n...");
				ICElvl++;
			}
		}
		return ICElvl;
	}

	// Ethan Reynolds + Henry Dunn
	public static int Overload(int level, int aHacking) {
//			Timer t1 = new Timer();
		LocalTime start = LocalTime.now();
		LocalTime end = start.plusSeconds(5);
		Scanner sc = new Scanner(System.in);
//			t1.Start(10);
		boolean play = true;
		while (play) {
			if (start == end) {
				play = false;
				System.out.println("!!!WARNING!!! LOCAL COUNTERMEASURES ACTIVE");
			}
			if (level == 1) {
				int required = 40 - aHacking;
				System.out.println("BEGIN OVERLOAD. TARGET " + required + " INPUTS");
				String input = sc.nextLine();
				if (input.length() >= required) {
					System.out.println("Level Breached");
					level++;
				} else {
					System.out.println("Detection iminent, jacking out...");
					play = false;
				}
			} else if (level == 2) {
				int required = 80 - aHacking;
				System.out.println("BEGIN OVERLOADING NEXT POINT. TARGET " + required + " INPUTS");
				String input = sc.nextLine();
				if (input.length() >= required) {
					System.out.println("Level Breached");
					level++;
				} else {
					System.out.println("Detection iminent, jacking out...");
					play = false;
				}
			} else if (level == 3) {
				int required = 120 - aHacking;
				System.out.println("BEGIN OVERLOADING NEXT POINT. TARGET " + required + " INPUTS");
				String input = sc.nextLine();
				if (input.length() >= required) {
					System.out.println("Level Breached");
					level++;
				} else {
					System.out.println("Detection iminent, jacking out...");
					play = false;
				}
			} else if (level == 4) {
				int required = 160 - aHacking;
				System.out.println("BEGIN OVERLOADING NEXT POINT. TARGET " + required + " INPUTS");
				String input = sc.nextLine();
				if (input.length() >= required) {
					System.out.println("Level Breached");
					level++;
				} else {
					System.out.println("Detection iminent, jacking out...");
					play = false;
				}
			} else {
				int required = level * 40 - aHacking;
				System.out.println("BEGIN OVERLOADING NEXT POINT. TARGET " + required + " INPUTS");
				String input = sc.nextLine();
				if (input.length() >= required) {
					System.out.println("Level Breached");
					level++;
				} else {
					System.out.println("Detection iminent, jacking out...");
					play = false;
				}
			}

		}
		System.out.println("Overload terminated. Breached " + level + " points.");
		return level;

	}

	// Ethan Reynolds + Henry
	public static int PasswordHunt(int level, int aHacking) {
		Scanner sc = new Scanner(System.in);
		String pwrd = "Bud";
		String hpwrd = "Budrocks!";
		level = 1;
		int guess = 0;
		boolean play = true;
		try {
			// [1AM all-nighter anger comment] REALLY? ONE DOC? THATS ALL YOU COULD DO???
			// YOU REALIZE THERE NEEDS TO BE VARIATIONS OF THIS, RIGHT?!?!?!??!
			File docs = new File("Docs.txt");
			BufferedReader br = new BufferedReader(new FileReader(docs));
			String sr;
			while ((sr = br.readLine()) != null) {
				System.out.println(sr);
			}
			br.close();
		}

		catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("Type your first guess:");

		if (level == 1) {
			while (play == true) {
				if (guess <= aHacking / 2) {
					String g = sc.nextLine();
					if (g.equals(pwrd)) {
						guess++;
						if (guess == 1) {
							System.out.println("Nice! You goot it! It took you 1 guess.");
						} else {
							System.out.println("Nice! You goot it! It took you " + guess + " guesses.");
						}
					} else {
						System.out.println("Wrong! Try again!");
						guess++;
					}
				} else {
					play = false;
				}
			}
			System.out.println("You are out of guesses. You Lose!");
		} else {
			while (play == true) {
				if (guess <= 4) {
					String g = sc.nextLine();
					if (g.equals(hpwrd)) {
						guess++;
						if (guess == 1) {
							System.out.println("Nice! You goot it! It took you " + guess + " guess.");
						} else {
							System.out.println("Nice! You goot it! It took you " + guess + " guesses.");
						}
					} else {
						System.out.println("Wrong! Try again!");
						guess++;
					}
				} else {
					play = false;
				}
			}
			System.out.println("You are out of guesses. You Lose!");
		}
		return level;
	}

	// Ethan Reynolds
	public static int Calculate(int level, int aHacking) {

		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		Timer t1 = new Timer();
		int up = 100;
		int h = 4;
		int a = rand.nextInt(up);
		int b = rand.nextInt(up);
		level = level - aHacking / 4;
		// int level = rand.nextInt(h);
		boolean play = true;
		int g = 0;

		while (play) {
			if (level <= 0) {
				System.out.println("[HACKING] This code is crackable by your passive processing.");
				level++;
			} else if (level == 1) {
				int ans = a + b;
				System.out.println(a + " + " + b + " = ?\nSolve.");
				t1.Start(40);
				float input = sc.nextFloat();

				if (input == ans) {
					System.out.println("You got it!");
					level++;
				} else if (g <= aHacking / 5) {
					System.out.println("Try Again");
					g++;
				} else {
					System.out.println("You Failed!");
					play = false;
				}
			} else if (level == 2) {
				float ans = a - b;
				System.out.println(a + " - " + b + " = ?\nSolve.");
				float input = sc.nextFloat();
				if (input == ans) {
					System.out.println("You got it!");
					level++;
				} else if (g <= aHacking / 5) {
					System.out.println("Try Again");
					g++;
				} else {
					System.out.println("You Failed!");
					play = false;
				}
			} else if (level == 3) {
				float ans = a * b;
				System.out.println(a + " X " + b + " = ?\nSolve.");
				float input = sc.nextFloat();
				if (input == ans) {
					System.out.println("You got it!");
					level++;
					play = false;
				} else if (g <= aHacking / 5) {
					System.out.println("Try Again");
					g++;
				} else {
					System.out.println("You Failed!");
					play = false;
				}
			} else if (level == 4) {
				float ans = a / b;
				System.out.println(a + " ÷ " + b + " = ?\nSolve.");
				float input = sc.nextFloat();
				if (input == ans) {
					System.out.println("You got it!");
					level++;
					play = false;
				} else if (g <= aHacking / 5) {
					System.out.println("Try Again");
					g++;
				} else {
					System.out.println("You Failed!");
					play = false;
				}
			} else if (level == 5) {
				float ans = a * b - a;
				System.out.println(a + " X " + b + " - " + a + " = ?\nSolve.");
				float input = sc.nextFloat();
				if (input == ans) {
					System.out.println("You got it!");
					level++;
					play = false;
				} else if (g <= aHacking / 5) {
					System.out.println("Try Again");
					g++;
				} else {
					System.out.println("You Failed!");
					play = false;
				}
			} else if (level >= 6) {
				float ans = a / (b + a);
				System.out.println(a + "÷ (" + b + " + " + a + ") = ?\nSolve.");
				float input = sc.nextFloat();
				if (input == ans) {
					System.out.println("You got it!");
					level++;
					play = false;
				} else if (g <= aHacking / 5) {
					System.out.println("Try Again");
					g++;
				} else {
					System.out.println("You Failed!");
					play = false;
				}
			}
		}
		return level;
	}
}
