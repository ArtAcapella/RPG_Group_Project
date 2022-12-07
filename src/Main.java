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
		
		
		if(play == 1) {
		    // Ace's Data
		    String ace = "Ace"; // street name
		    String acerin = "Acerin"; // real name
		    String he = "he"; // pronouns for dialogue
		    String him = "him";
		    String his = "his";
		    String background = "highriser";
		    // Ace MAIN Stats
		    int aBuff = 0;
		    int aQuick = 0;
		    int aTech = 0;
		    int aHacking = 0;
		    int aBookS = 0;
		    int aStreetS = 0;
		    int aDealing = 0;
		    int aCool = 0;
		    // Ace SUB stats (see chart)
		    int aCyberTolerance = 0;
		    int aSneak = 0;
		    int aDodge = 0;
		    int aHackEffect = 0;
		    int aHackNum = 0;
		    int aHackLvl = 0;
		    int aHistory = 0;
		    int aCorporate = 0;
		    int aEyes = 0;
		    int aInsight = 0;
		    int aBarter = 0;
		    int aBribing = 0;
		    int aCharm = 0;
		    int aIntimidate = 0;
		    int aLie = 0;
		    int aMovesStat = 0;

		    // Ace Names
		    System.out.println("Welcome, Hacker! What is your name? [recomended: Acerin]");
		    acerin = sc.nextLine();
		    System.out.println("What is your street name? [recomended: Ace]");
		    ace = sc.nextLine();
		    System.out.println("Select Gender [m, f, nb, manual]");
		    String gendSel = sc.nextLine();
		    if (gendSel.equalsIgnoreCase("m")) {
		      System.out.println("pronouns updated");
		    }
		    if (gendSel.equalsIgnoreCase("f")) {
		      he = "she";
		      him = "her";
		      his = "her";
		      System.out.println("pronouns updated");
		    }
		    if (gendSel.equalsIgnoreCase("nb")) {
		      he = "they";
		      him = "them";
		      his = "their";
		      System.out.println("pronouns updated");
		    }
		    if (gendSel.equalsIgnoreCase("manual")) {
		      System.out.println("first pronoun (i.e. he, she, etc)");
		      he = sc.nextLine();
		      System.out.println("Second pronoun (i.e. him, her, etc)");
		      him = sc.nextLine();
		      System.out.println("Second pronoun (i.e. his, hers, etc)");
		      his = sc.nextLine();
		      System.out.println("pronouns updated");
		    }

		    int unAloPnts = 20;
		    int impStatMod = 0;
		    System.out.println("Initiating Stat Generation... \n. \n.. \n...");
		    System.out.println(
		        "You have 9 primary stats: \n Buff affects your overall strength and cyber tolerance.\n Quick affects how fast you can move, how well you can dodge, and how well you can hide.\n Tech affects your skills with technology, including your understanding of it and your use of it through hacking hardware and using cyberware.\n Hacking is exactly what it sounds like: How well you can hack and what your can pull off. \n Book Smarts is your academic knowledge. This affects what you know about history, science, corporate politics, etc. It also has a slight effect on your hacking ability. \n Street Smarts is how well you can handle yourself and how much you know about stoaying on your feet in the world. Watch your back, catch a lie, and find a gig are all aspects of Street Smarts. \n Dealing is how well you exchange things. Not just buying or bartering, but bribing, blackmailing, and anything else where you need to make a trade. \n Cool is how you carry yourself. Chaming a corpo, lying to a guard, and intimidating a mark all apply to Cool.\n");
		    boolean pointModing = true;
		    
		    // HEY WTF IS THIS LOOP RUNNING TWICE????
		    // NEED TO FIX THIS
		    // HELP
		    // PLEASE
		    String statSel;
		    while (pointModing == true) {
		      System.out.println("You have " + unAloPnts
		          + " unalocated points. Select Stat To Increase: [Buff, Quick, Tech, Hacking, Book Smarts, Street Smarts, Dealing, Cool]");
		      statSel = sc.nextLine();
		        if (statSel.equalsIgnoreCase("buff") && unAloPnts >= 1) {
		          System.out.println("how much are you increasing or decreasing Buff by?");
		          impStatMod = sc.nextInt();
		          aBuff = aBuff + impStatMod;
		        }
		        if (statSel.equalsIgnoreCase("quick") && unAloPnts >= 1) {
		          System.out.println("how much are you increasing or decreasing Quick by?");
		          impStatMod = sc.nextInt();
		          aQuick = aQuick + impStatMod;
		        }
		        if (statSel.equalsIgnoreCase("tech") && unAloPnts >= 1) {
		          System.out.println("how much are you increasing or decreasing Tech by?");
		          impStatMod = sc.nextInt();
		          aTech = aTech + impStatMod;
		        }
		        if (statSel.equalsIgnoreCase("hacking") && unAloPnts >= 1) {
		          System.out.println("how much are you increasing or decreasing Hacking by?");
		          impStatMod = sc.nextInt();
		          aHacking = aHacking + impStatMod;
		        }
		        if (statSel.equalsIgnoreCase("book smarts") && unAloPnts >= 1) {
		          System.out.println("how much are you increasing or decreasing Book Smarts by?");
		          impStatMod = sc.nextInt();
		          aBookS = aBookS + impStatMod;
		        }
		        if (statSel.equalsIgnoreCase("street smarts") && unAloPnts >= 1) {
		          System.out.println("how much are you increasing or decreasing Street Smarts by?");
		          impStatMod = sc.nextInt();
		          aStreetS = aStreetS + impStatMod;
		        }
		        if (statSel.equalsIgnoreCase("dealing") && unAloPnts >= 1) {
		          System.out.println("how much are you increasing or decreasing Dealing by?");
		          impStatMod = sc.nextInt();
		          aDealing = aDealing + impStatMod;
		        }
		        if (statSel.equalsIgnoreCase("cool") && unAloPnts >= 1) {
		          System.out.println("how much are you increasing or decreasing Cool by?");
		          impStatMod = sc.nextInt();
		          aCool = aCool + impStatMod;
		        }
		          unAloPnts = unAloPnts - impStatMod;
		          if (unAloPnts <= 0) {
		            pointModing = false;
		          }
		      //Hey how TF do I work with this?
		      //Thread.sleep(1000);
		    }

		    //Selecting Background
		    
		    System.out.println(
		        "What is your background? [Fallen Highriser (Recomended), Highriser, Corpo IT, Street Kid, Gang Runner, BlackMarket Student, Tourist]");
		    String backgroundSelect = sc.nextLine();
		    if (backgroundSelect.equalsIgnoreCase("Fallen Highriser")) {
		      System.out.println(
		          "You were born in a penthouse hospital. The doors to the wing you were nursed in were guarded by ex-military to keep the lowlives out. You got to download your basic education so you could spend your childhood playing instead of school. This luxury continued for most of your life. Unfortunately, you messed up somehow and have been cast down from the upper levels, which is where you are now. Still, you nabbed a bit of higher-end chrome on the way out so you weren't left with nothing when you hit the streets.");
		      background = "fallenHighriser";
		      aDealing = aDealing + 1;
		      aBookS = aBookS + 2;
		      aCool = aCool + 2;
		    }
		    if (backgroundSelect.equalsIgnoreCase("Highriser")) {
		      System.out.println(
		          "You have connections to the highest of places. Sure, you're only barely out of the mid levels but still, you're a Highriser. That title is worth enough on its own to let you recieve auto-invites, targeted deals, upgraded security, and much stronger friends. You can thank your tech skills for getting you here");
		      background = "highriser";
		      aDealing = aDealing + 2;
		      aBookS = aBookS + 2;
		      aCool = aCool + 1;
		    }
		    if (backgroundSelect.equalsIgnoreCase("Corpo IT")) {
		      System.out.println(
		          "You work for the corporation Horizon. They have their tendrills wrapped around hundreds of sectors and people, and you're the one who keeps those tendrils from shutting down. You have access to the inner systems and Corporate Clearance that will get you almost anywhere you need on the planet, so long as you can give your boss a good reason for being there.");
		      background = "corpoIT";
		      aTech = aTech + 2;
		      aHacking = aHacking + 2;
		    }
		    if (backgroundSelect.equalsIgnoreCase("Street Kid")) {
		      System.out.println(
		          "You were looking up your entire life. You only get direct sunlight at noon, assuming you're not at work or home, thanks to the size of the buildings around you. You scrape by, got yourself an apartment of your own a few years ago. Found a friend of a friend who lets you use their workshop sometimes. Overall, could be worse.");
		      background = "streetKid";
		      aBuff = aBuff + 2;
		      aQuick = aQuick + 1;
		      aStreetS = aStreetS + 2;
		    }
		    if (backgroundSelect.equalsIgnoreCase("Gang Runner")) {
		      System.out.println(
		          "You got lucky with the Silvers. Ordinarily they'd be the biggest pain where you live, but you managed to sweet talk your way into becoming their netrunner. You get to handle all their tech for free- well, actually, they pay you to do what you love. And if anything gets in your way just talk to Ray, the leader of the Silvers, and he'll call in the boys favors to ya.");
		      background = "gangRunner";
		      aTech = aTech + 1;
		      aHacking = aHacking + 2;
		      aStreetS = aStreetS + 1;
		      aDealing = aDealing + 1;
		    }
		    if (backgroundSelect.equalsIgnoreCase("BlackMarket Student")) {
		      System.out.println(
		          "College in the upper levels is expensive. Not to mention the stuffy classrooms and asphyxiating peers. No, hands-on experience is so much better, you just gotta know where to find it. hang around the rippers in the underground long enough and you pick up a few tricks with cyberware. Guard a runner in meatspace for free and they'll share some of their skills. Soon enough you'll be a couple bucks richer and a solid jack-of-all-trades.");
		      background = "blackMarketStudent";
		      aTech = aTech + 2;
		      aHacking = aHacking + 2;
		      aDealing = aDealing + 1;
		    }
		    if (backgroundSelect.equalsIgnoreCase("Tourist")) {
		      System.out.println(
		          "You've roamed across the world. Hitched rides on cargo planes, smuggled yourself in passenger jets, all the cliche tricks fo the trade. You have your own reasons for traveling, but its made you disconected from all the places you go while at the same time giving you a breadth of experiences.");
		      background = "tourist";
		      aTech = aTech + 1;
		      aHacking = aHacking + 1;
		      aStreetS = aStreetS + 1;
		      aDealing = aDealing + 1;
		      aCool = aCool + 1;
		      aQuick = aQuick + 1;
		      aBuff = aBuff + 1;
		    }

		    System.out.println(ace + "'s Stats: " + "Buff: " + aBuff + "\n" + "Quick: " + aQuick + "\n" + "Tech: " + aTech
		        + "\n" + "Hacking: " + aHacking + "\n" + "Book Smarts: " + aBookS + "\n" + "Street Smarts: " + aStreetS + "\n"
		        + "Dealing: " + aDealing + "\n" + "Cool: " + aCool + "\n");

		    // Zai data
		    String zai = "Zai"; // street name
		    String mari = "Mari"; // real name
		    String she = "he"; // pronouns for dialogue
		    String her = "him";
		    String hers = "his";

		    // Zai Name
		    System.out.println(
		        "You have a partner who handles the work in meatspace. You dont know their name, but what is their streetname? [Recomended: Zai]");
		    zai = sc.nextLine();
		    System.out.println("Select Partner's Gender [m, f, nb, manual]");
		    gendSel = sc.nextLine();
		    if (gendSel.equalsIgnoreCase("m")) {
		      she = "he";
		      her = "him";
		      hers = "hers";
		      System.out.println("pronouns updated");
		    }
		    if (gendSel.equalsIgnoreCase("f")) {
		      System.out.println("pronouns updated");
		    }
		    if (gendSel.equalsIgnoreCase("nb")) {
		      she = "they";
		      her = "them";
		      hers = "their";
		      System.out.println("pronouns updated");
		    }
		    if (gendSel.equalsIgnoreCase("manual")) {
		      System.out.println("first pronoun (i.e. he, she, etc)");
		      she = sc.nextLine();
		      System.out.println("Second pronoun (i.e. him, her, etc)");
		      her = sc.nextLine();
		      System.out.println("Second pronoun (i.e. his, hers, etc)");
		      hers = sc.nextLine();
		      System.out.println("pronouns updated");
		    }

		    System.out.println("That will be all, " + ace + ". Time to wake up.");
		    
		    //BEGIN OPENING SCENE
		      int imBlockers = 0;
		      int account = 210;
		      int moveChoice;
		      char yesNo = 'a';
		      boolean deckMenu = false;
		  
		      //Ace must close window. Intro to imBlocks and choices.
		      System.out.println("You wake up in the soft fluff of your bed. You're senses are greeted by the sour, acidic smell of the west coast mist that pours through the crack in the window across the room. Your Nova-brand immuno blockers lie on the bedside table");
		      boolean windowClosed = false;
		      while (windowClosed == false) {
		      System.out.println(" 1: close window \n 2: go back to sleep \n 3. take blockers");
		      moveChoice = sc.nextInt();
		        if(moveChoice==1 && imBlockers<=2) {
		          System.out.println("You try to hold back the symtoms, but as you reach out to close the window you accidentally focus on your hand, and you fall to the floor in pain, fluids leaking from your eyes.");
		        } if(moveChoice==1 && imBlockers!=0) {
		          System.out.println("You snap the window shut");
		          windowClosed = true;
		        } if(moveChoice==2) {
		          System.out.println("Its not worth getting out of bed right now... you fall back asleep. \n .\n .\n .\n .\n .\n .\n .\n .\n .\n .\nYou wake up again, the window is still open.");  
		        } if(moveChoice==3 && imBlockers!=0) {
		            System.out.println("You think you shouldn't take over the dose.");
		        } if(moveChoice==3 && imBlockers==0) {
		          System.out.println("You tap your thumb on the small dispenser and two pills pop out, you down both of them.");
		          imBlockers = imBlockers + 10;
		          }    
		      }
		      
		      //Ace must get food. Intro to money ("Coyn")
		        System.out.println("With the window closed, you could probably afford to turn on the heating now.");
		      boolean eating = false;
		      boolean heatingOn = false;
		      while (eating == false) {
		        System.out.println(" 1: turn on heat \n 2: [Skip Menu Tutorial] go back to sleep \n 3. get food");
		        moveChoice = sc.nextInt();
		        yesNo = 'a';
		        if (moveChoice == 1 && heatingOn == false) {
		          System.out.println("You pull the roll of synapstring from your arm and plug it into your home's centeral control system. You read your current account balance after last nights rent as " + account + ". Turning on the heating for the morining will cost 2 Coyn.\n Do you want to turn on the heating? y/n");
		          yesNo = sc.next().charAt(0);
		          if (yesNo == 'y') {
		            System.out.println("You Jack Out, then run your hand over the flow of hot air coming from the ceiling vent.");
		            heatingOn = true;
		            account = account - 2;
		          } else if (yesNo == 'n') {
		            System.out.println("You Jack Out, not worth spending that when Nova just hiked their immune blockers price.");
		          }
		        } else if (moveChoice == 2) {
		          System.out.println("You walk over to your bed and fall back asleep. \n .\n .\n .\n .\n .\n .\n .\n .\n .\n .\n");
		        } else if (moveChoice == 3) {
		          System.out.println("You head over to vending machine across the room, ten steps from where you were sleeping. The neon advertisements entice you to purchase a cinamon onigiri egg, though you feel its likely safer to simply purchase your usual.");
		          //open shop menu here?
		          eating = true;
		        }
		      }

		    System.out.println("You grab your food and sit down to eat. Your deck has finished rebooting and is now fully turned on, allowing you to access your digital systems through your AR eye implants. [type OPEN DECK]");
		    String deckOppening = sc.nextLine();
		    
		    if (deckOppening.equalsIgnoreCase("open deck")) {
		    System.out.println("You see before you your Common Architecture of choice, DEiNet, and the gateway buttons to your favorite sites and programs.");
		    deckMenu = true;
		    while (deckMenu == true) {
		        System.out.println(" 1: Run Diagnostic \n 2: Open News \n 3. Open Messages \n 4. Open CyberDeck \n 5. Exit");
		        moveChoice = sc.nextInt();
		        yesNo = 'a';
		        if (moveChoice == 1) {
		          System.out.println("Running Diagnostic........\n Immune Blocker Levels: " + 
		imBlockers + "\nStatistics\n Buff = " + aBuff + "\nQuick = " + aQuick + "\nTech = " + aTech + "\nHacking = " + aHacking + "\nBookSmarts = " + aBookS + "\nStreetSmarts = " + aStreetS + "\nDealing = " + aDealing + "\nCool = " + aCool);
		        } else if (moveChoice == 2) {
		          
		        } else if (moveChoice == 3) {
		          
		        } else if (moveChoice == 4) {
		          
		        } else if (moveChoice == 5) {
		          
		        }
		  
		      }
		    }
		  
		  
		      
		      String fin = "thats all for the scene so far.";
		        System.out.println(fin);
		 
		} else {
			System.out.println("Invalid Input");
		}
		
	}

}
