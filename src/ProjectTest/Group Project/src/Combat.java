// Ethan Reynolds

import java.util.*;
import java.time.LocalTime;
import java.io.*;

public class Combat {

	Combat(int cLevel) {
		int level = cLevel;
	}
	
	// Henry Dunn
		public static void FragCon() {
			int ICElvl = 1;
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
							+ word9[rand.nextInt(word9.length)] + ", " + wordC[rand.nextInt(wordC.length)] + ", "
							+ wordW[rand.nextInt(wordW.length)] + ", " + wordK[rand.nextInt(wordK.length)]);
				}
				if (ICElvl == 2) {
					wordList.add(wordA[rand.nextInt(wordA.length)] + ", " + wordB[rand.nextInt(wordB.length)] + ", "
							+ wordM[rand.nextInt(wordM.length)] + ", " + wordF[rand.nextInt(wordF.length)]);
					wordList.add(word9[rand.nextInt(word9.length)] + ", " + wordC[rand.nextInt(wordC.length)] + ", "
							+ wordW[rand.nextInt(wordW.length)] + ", " + wordK[rand.nextInt(wordK.length)]);
				}
				if (ICElvl == 3) {
					wordList.add(word9[rand.nextInt(word9.length)] + ", " + wordC[rand.nextInt(wordC.length)] + ", "
							+ wordW[rand.nextInt(wordW.length)] + ", " + wordK[rand.nextInt(wordK.length)]);
				} else {
					wordList.add(word9[rand.nextInt(word9.length)] + ", " + wordC[rand.nextInt(wordC.length)] + ", "
							+ wordW[rand.nextInt(wordW.length)] + ", " + wordK[rand.nextInt(wordK.length)]);
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
		}
		

		// Ethan Reynolds
		public static void Overload() {
			Timer t1 = new Timer();
			Scanner sc = new Scanner(System.in);
			int level = 1;
			t1.Start();
			if (level == 1) {
				int required = 40;
				String input = sc.nextLine();
				if (input.length() >= required) {
					System.out.println("Success!");
				} else {
					System.out.println("Fail!");
				}
			} else if (level == 2) {
				int required = 80;
				String input = sc.nextLine();
				if (input.length() >= required) {
					System.out.println("Success!");
				} else {
					System.out.println("Fail!");
				}
			} else if (level == 3) {
				int required = 120;
				String input = sc.nextLine();
				if (input.length() >= required) {
					System.out.println("Success!");
				} else {
					System.out.println("Fail!");
				}
			} else if (level == 4) {
				int required = 160;
				String input = sc.nextLine();
				if (input.length() >= required) {
					System.out.println("Success!");
				} else {
					System.out.println("Fail!");
				}
			} else {
				int required = 200;
				String input = sc.nextLine();
				if (input.length() >= required) {
					System.out.println("Success!");
				} else {
					System.out.println("Fail!");
				}
			}

		}
		

		// Ethan Reynolds
		public static void PasswordHunt() {
			Scanner sc = new Scanner(System.in);
			String pwrd = "Bud";
			String hpwrd = "Budrocks!";
			int level = 1;
			int guess = 0;
			boolean play = true;
			try {
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
					if (guess <= 4) {
						String g = sc.nextLine();
						if (g.equals(pwrd)) {
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
		}
		

		// Ethan Reynolds
		public static void Calculate() {
			Random rand = new Random();
			Scanner sc = new Scanner(System.in);
			Timer t1 = new Timer();
			int up = 100;
			int h = 4;
			int a = rand.nextInt(up);
			int b = rand.nextInt(up);
			int level = rand.nextInt(h);
			boolean play = true;
			int g = 0;
			

			while (play) {
				if (level == 1) {
					int ans = a + b;
					System.out.println(a + "+" + b + "= ?\nSolve.");
					t1.Start();
					float input = sc.nextFloat();
					
					if (input == ans) {
						System.out.println("You got it!");
						play = false;
					} else if (g <= 2) {
						System.out.println("Try Again");
						g++;
					} else {
						System.out.println("You Failed!");
						play = false;
					}
				} else if (level == 2) {
					float ans = a - b;
					System.out.println(a + "-" + b + "= ?\nSolve.");
					float input = sc.nextFloat();
					if (input == ans) {
						System.out.println("You got it!");
						play = false;
					} else if (g <= 2) {
						System.out.println("Try Again");
						g++;
					} else {
						System.out.println("You Failed!");
						play = false;
					}
				} else if (level == 3) {
					float ans = a * b;
					System.out.println(a + "X" + b + "= ?\nSolve.");
					float input = sc.nextFloat();
					if (input == ans) {
						System.out.println("You got it!");
						play = false;
					} else if (g <= 2) {
						System.out.println("Try Again");
						g++;
					} else {
						System.out.println("You Failed!");
						play = false;
					}
				} else if (level == 4) {
					float ans = a / b;
					System.out.println(a + "÷" + b + "= ?\nSolve.");
					float input = sc.nextFloat();
					if (input == ans) {
						System.out.println("You got it!");
						play = false;
					} else if (g <= 2) {
						System.out.println("Try Again");
						g++;
					} else {
						System.out.println("You Failed!");
						play = false;
					}
				}
			}
		}

}
