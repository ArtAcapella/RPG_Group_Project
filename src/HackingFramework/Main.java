import java.util.*;
import java.time.LocalTime;

public class Main {

	public static void main(String[] args) {
		Random rand = new Random();
		int upperbound = 10;
		//int en = rand.nextInt(upperbound);
		int en = 4;
		int up = 6;
//		int mini = rand.nextInt(up);
		int mini = 1;
		int level = 1;
		
		switch (en){
		case 1:
			//Daemon();
			break;
		case 2:
			//BlackIce();
			break;
		case 3:
			FragCon();
			break;
		case 4:
			Overload();
			break;
		case 5:
			//PasswordHunt();
			break;
		case 6:
			//Calculate();
			break;
		case 7:
			//DataTap();
			break;
		case 8:
			//LockPick();
			break;
		}
		
//		if (en<4) {
//			Daemon();
//		} else if(en<7) {
//			BlackIce();
//		} else if (mini == 1) {
			//FragCon();
//		} else if(mini == 2) {
			Overload();
//		} else if (mini == 3) {
//			PasswordHunt();
//		} else if (mini == 1) {
//			Calculate();
//		} else if(mini == 2) {
//			DataTap();
//		} else if (mini == 3) {
//			LockPick();
//		}
		

	}
	
//	public static boolean Daemon() {}
//	
//	public static boolean BlackIce() {}
	
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
	    
	    String[] wordA = {"AB", "AF", "AA", "AM"};
	    String[] wordB = {"BA", "BF", "BB", "BM"};
	    String[] wordM = {"MB", "MF", "MM", "MA"};
	    String[] wordF = {"FB", "FA", "FF", "FM"};
	    String[] word9 = {"9F", "9A", "9B", "9M", "C9"};
	    String[] wordC = {"CB", "CA", "CC", "FC", "9C", "CW"};
	    String[] wordW = {"WA", "WF", "WW", "WC", "W9", "AW"};
	    String[] wordK = {"BK", "FK", "KF", "KM", "9K", "KA", "CK"};

	    
	    wordList.add(wordA[rand.nextInt(wordA.length)] +", " +  wordB[rand.nextInt(wordB.length)] +", " +  wordM[rand.nextInt(wordM.length)] +", " +  wordF[rand.nextInt(wordF.length)]);
	    

	      if (ICElvl == 1) {
	        wordList.add(wordA[rand.nextInt(wordA.length)] +", " +  wordB[rand.nextInt(wordB.length)] +", " +  wordM[rand.nextInt(wordM.length)] +", " +  wordF[rand.nextInt(wordF.length)]);
	        wordList.add(word9[rand.nextInt(word9.length)] +", " +  wordC[rand.nextInt(wordC.length)] +", " +  wordW[rand.nextInt(wordW.length)] +", " +  wordK[rand.nextInt(wordK.length)] +", " +  word9[rand.nextInt(word9.length)] +", " +  wordC[rand.nextInt(wordC.length)] +", " +  wordW[rand.nextInt(wordW.length)] +", " +  wordK[rand.nextInt(wordK.length)]);
	      } if (ICElvl == 2) {
	        wordList.add(wordA[rand.nextInt(wordA.length)] +", " +  wordB[rand.nextInt(wordB.length)] +", " +  wordM[rand.nextInt(wordM.length)] +", " +  wordF[rand.nextInt(wordF.length)]);
	        wordList.add(word9[rand.nextInt(word9.length)] +", " +  wordC[rand.nextInt(wordC.length)] +", " +  wordW[rand.nextInt(wordW.length)] +", " +  wordK[rand.nextInt(wordK.length)]);
	      } if (ICElvl == 3) {
	        wordList.add(word9[rand.nextInt(word9.length)] + ", " + wordC[rand.nextInt(wordC.length)] +", " +  wordW[rand.nextInt(wordW.length)] +", " +  wordK[rand.nextInt(wordK.length)]);
	      } else {
	        wordList.add(word9[rand.nextInt(word9.length)] +", " +  wordC[rand.nextInt(wordC.length)] +", " +  wordW[rand.nextInt(wordW.length)] +", " +  
	 wordK[rand.nextInt(wordK.length)]);
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
	    while (i <= (input.length()-3) && runHack) {
	      l1 = sb.charAt(i);
	      l2 = sb.charAt(i+1);
	      if (l1 != l2) {
	        System.out.println("ERROR");
	        runHack = false;
	        play = false;
	      } if (l1 == l2) {
	        System.out.println(l1 + " = " + l2 + " VERIFIED");
	        validInp++;
	        i = i + 2;
	      }
	    }
	    System.out.println("ICE score: " + validInp);
	    if (validInp >= toBeatICE) {
	      System.out.println("ICE layer passed! Additional breaches: " + (validInp-toBeatICE));
	      addBreach = validInp - toBeatICE;
	      System.out.println("Decending... \n. \n..\n...");
	      ICElvl++;
	    }
	  }
	}
	
	public static void Overload() {
		Scanner sc = new Scanner(System.in);
		int level = 5;
		LocalTime start = LocalTime.now();
		System.out.println("Time starts now!");
		LocalTime next1 = start.plusMinutes(1);
		LocalTime next2 = next1.plusMinutes(1);
		LocalTime next3 = next2.plusMinutes(1);
		LocalTime next4 = next3.plusMinutes(1);
		LocalTime next5 = next4.plusMinutes(1);		
		while(true) {
			if (LocalTime.now().compareTo(next1) ==0) {
			System.out.println("You have 4 minutes left.");
			} else if (LocalTime.now().compareTo(next2) ==0) {
				System.out.println("You have 3 minutes left.");
			}else if (LocalTime.now().compareTo(next3) ==0) {
				System.out.println("You have 2 minutes left.");
			}else if (LocalTime.now().compareTo(next4) ==0) {
				System.out.println("You have 1 minutes left.");
			}else if (LocalTime.now().compareTo(next5) ==0) {
				System.out.println("Time is up!");
				break;
			}
		if (level == 1) {
			int required = 40;
			String input = sc.nextLine();
			if (input.length() >= required) {
				System.out.println("Success!");
			} else {
				System.out.println("Fail!");
			}
		} else if (level == 2){
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
	}
//	
//	public static boolean PasswordHunt() {}
//	
//	public static boolean Calculate() {}
//	
//	public static boolean DataTap() {}
//	
//	public static boolean LockPick() {}

}
