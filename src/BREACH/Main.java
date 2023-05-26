import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Dunn

class main {
	public static void main(String args[]) {
		// Test for Hacking Class
		Hacking h1 = new Hacking();

		Scanner sc = new Scanner(System.in);
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

		String statSel;
		while (pointModing == true) {
			System.out.println("You have " + unAloPnts
					+ " unalocated points. Select Stat To Increase: [Buff, Quick, Tech, Hacking, Book Smarts, Street Smarts, Dealing, Cool]\n (you may have to enter your selection twice. We've spent 5 months trying to figure out why, but still have no idea.)");
			statSel = sc.nextLine();
			statSel = sc.nextLine();
			if (statSel.equalsIgnoreCase("buff") && unAloPnts >= 1) {
				System.out.println("how much are you increasing or decreasing Buff by?");
				impStatMod = sc.nextInt();
				aBuff = aBuff + impStatMod;
			} else if (statSel.equalsIgnoreCase("quick") && unAloPnts >= 1) {
				System.out.println("how much are you increasing or decreasing Quick by?");
				impStatMod = sc.nextInt();
				aQuick = aQuick + impStatMod;
			} else if (statSel.equalsIgnoreCase("tech") && unAloPnts >= 1) {
				System.out.println("how much are you increasing or decreasing Tech by?");
				impStatMod = sc.nextInt();
				aTech = aTech + impStatMod;
			} else if (statSel.equalsIgnoreCase("hacking") && unAloPnts >= 1) {
				System.out.println("how much are you increasing or decreasing Hacking by?");
				impStatMod = sc.nextInt();
				aHacking = aHacking + impStatMod;
			} else if (statSel.equalsIgnoreCase("book smarts") && unAloPnts >= 1) {
				System.out.println("how much are you increasing or decreasing Book Smarts by?");
				impStatMod = sc.nextInt();
				aBookS = aBookS + impStatMod;
			} else if (statSel.equalsIgnoreCase("street smarts") && unAloPnts >= 1) {
				System.out.println("how much are you increasing or decreasing Street Smarts by?");
				impStatMod = sc.nextInt();
				aStreetS = aStreetS + impStatMod;
			} else if (statSel.equalsIgnoreCase("dealing") && unAloPnts >= 1) {
				System.out.println("how much are you increasing or decreasing Dealing by?");
				impStatMod = sc.nextInt();
				aDealing = aDealing + impStatMod;
			} else if (statSel.equalsIgnoreCase("cool") && unAloPnts >= 1) {
				System.out.println("how much are you increasing or decreasing Cool by?");
				impStatMod = sc.nextInt();
				aCool = aCool + impStatMod;
			}
			unAloPnts = unAloPnts - impStatMod;
			if (unAloPnts <= 0) {
				pointModing = false;
			}
		}

		// Selecting Background

		System.out.println(
				"What is your background? [Fallen Highriser (Recomended), Highriser, Corpo IT, Street Kid, Gang Runner, BlackMarket Student, Tourist]");
		String backgroundSelect = sc.nextLine();
		backgroundSelect = sc.nextLine();
		if (backgroundSelect.equalsIgnoreCase("Fallen Highriser")) {
			System.out.println(
					"You were born in a penthouse hospital. The doors to the wing you were nursed in were guarded by ex-military to keep the lowlives out. You got to download your basic education so you could spend your childhood playing instead of school. This luxury continued for most of your life. Unfortunately, you messed up somehow and have been cast down from the upper levels, which is where you are now. Still, you nabbed a bit of higher-end chrome on the way out so you weren't left with nothing when you hit the streets.");
			background = "fallenHighriser";
			aBookS = aBookS + 2;
			aCool = aCool + 2;
		}
		if (backgroundSelect.equalsIgnoreCase("Highriser")) {
			System.out.println(
					"You have connections to the highest of places. Sure, you're only barely out of the mid levels but still, you're a Highriser. That title is worth enough on its own to let you recieve auto-invites, targeted deals, upgraded security, and much stronger friends. You can thank your tech skills for getting you here");
			background = "highriser";
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
		}
		if (backgroundSelect.equalsIgnoreCase("BlackMarket Student")) {
			System.out.println(
					"College in the upper levels is expensive. Not to mention the stuffy classrooms and asphyxiating peers. No, hands-on experience is so much better, you just gotta know where to find it. hang around the rippers in the underground long enough and you pick up a few tricks with cyberware. Guard a runner in meatspace for free and they'll share some of their skills. Soon enough you'll be a couple bucks richer and a solid jack-of-all-trades.");
			background = "blackMarketStudent";
			aTech = aTech + 2;
			aHacking = aHacking + 2;
		}
		if (backgroundSelect.equalsIgnoreCase("Tourist")) {
			System.out.println(
					"You've roamed across the world. Hitched rides on cargo planes, smuggled yourself in passenger jets, all the cliche tricks fo the trade. You have your own reasons for traveling, but its made you disconected from all the places you go while at the same time giving you a breadth of experiences to enrich your life.");
			background = "tourist";
			aTech = aTech + 1;
			aHacking = aHacking + 1;
			aStreetS = aStreetS + 1;
			aCool = aCool + 1;
			aQuick = aQuick + 1;
			aBuff = aBuff + 1;
		}

		int aSneak = aQuick;
		int aDodge = aQuick;
		int aEyes = aStreetS;
		int aCharm = aCool;
		int aIntimidate = aCool;
		int aLie = aCool;
		int aHistory = aBookS;
		int aCorporate = aBookS;
		int aLuck = 2;

		int aHPmax = aBuff * 3;
		int aHP = aHPmax;

		System.out.println(ace + "'s Stats: " + "\nBuff: " + aBuff + "\n" + "Quick: " + aQuick + "\n" + "Tech: " + aTech
				+ "\n" + "Hacking: " + aHacking + "\n" + "Book Smarts: " + aBookS + "\n" + "Street Smarts: " + aStreetS
				+ "\n" + "Dealing: " + aDealing + "\n" + "Cool: " + aCool + "\n");

		System.out.println("That will be all, " + acerin + ". Time to wake up.");

		// USE THIS WHERE NEEDED
		// Character Ace = new Character(ace, aQuick/4, aBuff, aQuick, aTech, aHacking,
		// aBookS, aStreetS, aDealing, aCool, int hpMAX, String[][] leveledAttackList,
		// int baseAC) {

		// COMBAT STATS AND CHARACTERS

		// Hacks
		List<String> hackList = new ArrayList<>();

		// For NPCs. Depending on their condition they will use different moves (1 = low
		// danger, 3 = high danger)
		String[][] leveledAttackList = new String[3][2];

		/*
		 * String[][] rhyzLAL = new String[3][2]; rhyzLAL[1][1] = "Punch"; rhyzLAL[1][2]
		 * = ""; rhyzLAL[2][1] = "Bladed Nails"; rhyzLAL[2][2] = ""; rhyzLAL[3][1] = "";
		 * rhyzLAL[3][2] = "";
		 * 
		 * String[][] moriLAL = new String[3][2]; moriLAL[1][1] = ""; moriLAL[1][2] =
		 * ""; moriLAL[2][1] = ""; moriLAL[2][2] = ""; moriLAL[3][1] = ""; moriLAL[3][2]
		 * = "";
		 * 
		 * String[][] telisLAL = new String[3][2]; telisLAL[1][1] = "Punch";
		 * telisLAL[1][2] = ""; telisLAL[2][1] = ""; telisLAL[2][2] = ""; telisLAL[3][1]
		 * = ""; telisLAL[3][2] = "";
		 * 
		 * String[][] abutensLAL = new String[3][2]; abutensLAL[1][1] = "Punch + Kick";
		 * abutensLAL[1][2] = ""; abutensLAL[2][1] = ""; abutensLAL[2][2] = "";
		 * abutensLAL[3][1] = ""; abutensLAL[3][2] = "";
		 * 
		 * String[][] GoliathLAL = new String[3][2]; GoliathLAL[1][1] = "";
		 * GoliathLAL[1][2] = ""; GoliathLAL[2][1] = ""; GoliathLAL[2][2] = "";
		 * GoliathLAL[3][1] = ""; GoliathLAL[3][2] = "";
		 * 
		 * String[][] ORBLAL = new String[3][2]; ORBLAL[1][1] = ""; ORBLAL[1][2] = "";
		 * ORBLAL[2][1] = ""; ORBLAL[2][2] = ""; ORBLAL[3][1] = ""; ORBLAL[3][2] = "";
		 * 
		 * Character Rhyz = new Character("Rhyz", 1, 10, 8, 15, 7, 19, 12, 8, 10, 20,
		 * rhyzLAL, 10); Character Mori = new Character("Mori", 1, 6, 8, 12, 18, 14, 12,
		 * 8, 10, 20, moriLAL, 8); Character Telis = new Character("Telis", 3, 18, 15,
		 * 8, 4, 19, 12, 8, 10, 30, telisLAL, 14); Character Abutens = new
		 * Character("Abutens", 3, 15, 15, 18, 15, 17, 17, 18, 18, 30, abutensLAL, 15);
		 * Character Goliath = new Character("Goliath", 3, 20, 13, 15, 15, 8, 8, 15, 15,
		 * 60, GoliathLAL, 17); Character ORB = new Character("RED ORB", 3, 18, 18, 18,
		 * 18, 18, 18, 18, 18, 100, ORBLAL, 16);
		 * 
		 */

		boolean alive = true;

		int coyn = 200 + aDealing * 20;
		int imBlockers = 100;
		String travelChoice = "";

		WakeUpScene wakeup = new WakeUpScene();

		List<String> contacts = new ArrayList<String>();

		List<String> travelPoints = new ArrayList<String>();
		travelPoints.add("Pier");
		// travelPoints.add("");
		// travelPoints.add("");
		// travelPoints.add("Angel City / Capitol District");

		String isu = "";

		System.out.println(
				"You find your deam interupted not by the usual advertisements, but by a call. It's your augger, Doc Udon.\n\"Hey "
						+ ace
						+ ", this is doc Udon. I know you've got a lot going on right now but I cant keep seein' ya. Times are rough and the streets are running dry of what ya need, so prices are hiking and I'm getting too busy to go out and try to find them. If you need to get chipped come see me again but I cant keep playing a pharmacist, so shop around for someone else to supply your ImmunoBlockers.\n");
		System.out.println(
				"1. What the hell, doc?\n2. Well, where am I supposed to get it then? Nova just hiked it and I couldn't buy for them anyways.\n3. Got it, thanks.");
		isu = sc.nextLine();

		if (isu.equalsIgnoreCase("1")) {
			System.out.println("\"sorry, mate.\"\n [CONTACT HAS BLOCKED YOU]");
		} else {
			System.out.println(
					"\"Hey, look, I've heard tell of an auger selling it on the dark, but they only deal in a certain net, I hear its somewhere around the pier?\"");
			System.out.println(
					"1. Wow. How helpful. \n2. Well that doesn't sound shady at all. \n3. Fine, ill try. What do you know about them?");
			isu = sc.nextLine();
			if (isu.equalsIgnoreCase("1") || isu.equalsIgnoreCase("2")) {
				System.out.println("\"Just check it out. I think their- her? name is Rhyz. Good luck, mate.\"");
			} else {
				System.out.println(
						"\"I think her name is Rhyz. Looks fem, coily hair, polished chrome arms. Possibly connected to Magelan if the bounty on her is any indication. Thats about all I know, but I'll let you know if anything else comes up.\"");
			}
		}
		System.out.println("And you wake up.");

		while (alive) {
			if (coyn <= 40 || imBlockers <= 0) {
				System.out.println(acerin + " is lucky. " + he
						+ " passes away in the night. Unable to purchase immunoblockers on " + his + " way home, " + he
						+ " experiences a pleasant dream created from the excruciating experience of a lethal immune response. "
						+ he
						+ " doesn't even feel a bit of discomfort as organs shut down one by one for want of coin. Its fortunate "
						+ he + " made it this far, given the circumstances.");
				System.out.println(
						"I'm sorry your story had to end this way. But should you get another chance in another life, understand that there is no shame in doing what you need to survive. There are few people in West City who bother with ethics, so if turning a friend in for a payday keeps you alive, no one can blame you for it. Thats just life here.");
			} else {
				coyn -= 40;
				imBlockers = 100;
				aHP = aHPmax;

				wakeup.WakeUp(imBlockers, aHPmax, aBuff, aQuick, aTech, aHacking, aBookS, aStreetS, aDealing, aCool,
						coyn);

				// System.out.print(contacts);

				System.out.println("Where do you want to travel today?");
				System.out.println(travelPoints);
				travelChoice = sc.nextLine();
				if (travelChoice.equalsIgnoreCase("Pier")) {
					Pier pier = new Pier(aBuff, aQuick, aTech, aHacking, aBookS, aStreetS, aDealing, aCool, aSneak,
							aDodge, aEyes, aCharm, aIntimidate, aLie, aHPmax);
				} else if (travelChoice.equalsIgnoreCase("")) {

				} else if (travelChoice.equalsIgnoreCase("")) {

				} else if (travelChoice.equalsIgnoreCase("Meet Rhyz")) {

				} else if (travelChoice.equalsIgnoreCase("Rhyz's Clinic") || travelChoice.equalsIgnoreCase("Clinic")) {
					Clinic clinic = new Clinic(aBuff, aQuick, aTech, aHacking, aBookS, aStreetS, aDealing, aCool,
							aSneak, aDodge, aEyes, aCharm, aIntimidate, aLie, aHPmax, background);
				} else if (travelChoice.equalsIgnoreCase("Angel City")
						|| travelChoice.equalsIgnoreCase("Capitol District")) {

				}

			}

		}

	}
}
