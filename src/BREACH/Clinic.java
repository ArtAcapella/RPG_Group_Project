import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.*;

// Mike + Dunn

//Thank you so, so much for doing this. I know you werent able to finish it but its so nice to have my script translated at least a bit. Ill clean up the rest.

public class Clinic {

	private int aBuff, aQuick, aTech, aHacking, aBookSmarts, aStreetSmarts, aDealing, aCool, aSneak, aDodge, aEyes,
			aCharm, aIntimidate, aLie, aHPmax;

	Clinic(int aBuff, int aQuick, int aTech, int aHacking, int aBookSmarts, int aStreetSmarts, int aDealing, int aCool,
			int aSneak, int aDodge, int aEyes, int aCharm, int aIntimidate, int aLie, int aHPmax, String aBackground) {
		this.aBuff = aBuff;
		this.aQuick = aQuick;
		this.aTech = aTech;
		this.aHacking = aHacking;
		this.aBookSmarts = aBookSmarts;
		this.aStreetSmarts = aBookSmarts;
		this.aDealing = aDealing;
		this.aCool = aCool;
		this.aHPmax = aHPmax;
		this.aEyes = aEyes;
		this.aSneak = aSneak;

		int aHP = aHPmax;

		int moves = 10 + aBuff;
		String isu = " ";
		Random rand = new Random();

		// Hacking Variables
		Hacking h1 = new Hacking();
		boolean jackedIn = true;
		int floor = 1;
		int type = 1;
		int delve = 0;

		/*
		 * sts - street smarts; bos - book smarts; qck - quick; buf - buff; tech - tech;
		 * eyes - eyes; cool - cool; lck - luck; chrm - charm; ice - ICE; inl -
		 * intelligence; hst - history; hck - hack; corp - corporate; snk - sneak; laug
		 * - leg augment; haug - hand augment; remhk - remote hacking; str - strength
		 */
		CharacterAce ace = new CharacterAce(aBuff, aQuick, aTech, aHacking, aBookSmarts, aStreetSmarts, aEyes, aCool,
				aCharm, aSneak);
		List<String> inventory = new ArrayList<String>();

		Scanner ent = new Scanner(System.in);

		System.out.println(
				"Room 122 shows clear signs of use. The faint, musky smell of rotting architecture is dulled by the influx of fresh air from a heating vent\nand the sickly citrus of cleaning supplies. The dirty carpet has been covered with plastic plates welded together and polished to a shine.\nThe whole area is such a refreshing sight after walking through ruins all day that you almost miss the automated defense systems hanging\nright above your head. Fortunately, the tesla beads don’t seem to be active right now, otherwise you and anyone else who came through\nthis door recently would have been fried instantly\nInvestigate the room? (yes/no)");

		String c = ent.nextLine();
		// System.out.println(c);

		if (c.equalsIgnoreCase("no")) {
			System.out.println("You decided not to investigate the room.");
		} else if (c.equalsIgnoreCase("yes")) {
			System.out.println(
					"In the center of the room is an augger chair, where operations usually take place. The chair is on an isolated system, it seems. But there\nis still a Net server in the corner of the room for some reason. Aside from that the only other thing here are closets and drawers full\nof some Augging materials.");

			if (ace.eyes > 6) {
				System.out.println(
						"There are visibly wet footprints on the floor, which stand out against the pristine conditions of the room.");
			}
			if (ace.eyes > 10) {
				System.out.println("The footprints appear to be exiting the room. There is only one pair.");
			}
			if (ace.eyes > 15) {
				System.out.println("One of the panels next to the operating chair is maglocked for some reason.");
			}
			if (ace.tech > 5) {
				System.out.println("Yep. This is definitely an Auggers clinic.");
			}
			if (ace.tech > 10) {
				System.out.println(
						"Actually, this is too outfitted to be a clinic, this is closer to a lab. No other reason to have a diagnostic chair that high-end.");
			}
			if (ace.chrm > 7 || ace.tech > 8) // I put charm instead of dealing, I can change it later
			{
				System.out.println(
						"The gear here is top-shelf. You’ve only seen these brands of tech pass hands, never actually be implanted in someone. You don’t have an Augger to chip you with it, but everything here could net you a hell of a price.");
			}
			System.out.println(
					"Print what to do: [investigate] chair, steal everything [not nailed down], steal everything [nailed down], [jack into net], [wait in the room, or [leave room].");
			c = ent.nextLine();
			if (c.equalsIgnoreCase("investigate")) {
				moves--;
				System.out.println(
						"There are parts you can interact with: [red button], [blue button], adjustment [lever], [switchboard], synapstring [port]. ");
				String cc = "";
				int redButtonPressed = 0;
				while (cc != "exit") {
					cc = ent.nextLine();
					if (cc.equalsIgnoreCase("red button")) {
						redButtonPressed++;
						System.out.println("nothing happens");
					} else if (cc.equalsIgnoreCase("blue button")) {
						moves--;
						System.out.println("Nothing happened.");
					} else if (cc.equalsIgnoreCase("lever")) {
						moves--;
						if (redButtonPressed < 4) {
							System.out.println("Nothing happened.");
						} else {
							System.out.println(
									"The floor panel next to the chair opens up, revealing a hidden room beneath. It seems like the room was hastily vacated recently, judging by the cluttered piles of things desperately tossed into the secret space.");
						}
					} else if (cc.equalsIgnoreCase("switchboard")) {
						moves--;
						System.out.println("Nothing happens as you interact with the switchboard.");
					} else if (cc.equalsIgnoreCase("port")) {
						moves--;
						System.out.println(
								"The port is clean and an Augger’s chair is probably safe to jack into, so you take the blue chord from your wrist and insert it into the port.");
						h1.Overload(2, aHacking);
						boolean gamePassed = true;
						// if () {}
						if (gamePassed) {
							System.out.println(
									"Inputs on the Red Button seem frequent, even when operating programs aren’t in use. The Lever also has a non-mechanical output to a device that is not this chair.");
						}
					}
				}
			} else if (c.equalsIgnoreCase("not nailed down")) {
				moves--;
				boolean hasRhyzGear = true;
				System.out.println("Pretty good haul. Once you get home you’ll decide whether to sell this or not.");
			} else if (c.equalsIgnoreCase("nailed down")) {
				moves--;
				if (ace.str > 12) {

					System.out.println(
							"You pull the chair up from the ground. The panel adjacent to it flies open by accident, revealing a hidden room beneath. It seems like the room was hastily vacated recently, judging by the cluttered piles of things desperately tossed into the secret space. Within this room you find an active port, Rhyz must have forgotten to log out of this Net. You could jack in if you wish. You could also just leave a note");
					boolean hasRhyzChair = true;
					String cc = ent.nextLine();
					if (cc.equalsIgnoreCase("jack in")) {
						moves--;
						System.out.println(
								"You tap into a flood of information. The main two bits you find are of Mori, who you realize is presumed dead for her role in inciting the Independence day riots, and fragments of MageLan data, the rumored society of hackers who attack Corporate interests. You learn Mori and MageLan are somewhere in downtown -San Island-");
					} else {
						moves--;
						System.out.println("You leave a note in the room for Rhyz with your contact info.");
						if (ace.tech > 18) {
							String b = ent.nextLine();
							System.out.println(
									"You find a way to unbolt the Auggers chair from the floor, it's really a simple matter of applying an interfering magfield and a plasma cutter. Carrying it will be a pain in the ass, but something like this could net you a month's worth of expenses if you sell at the right price. Most interesting, though, is that the panel adjacent to it flies open by accident, revealing a hidden room beneath. It seems like the room was hastily vacated recently, judging by the cluttered piles of things desperately tossed into the secret space. Investigating the space you find a port you can jack into");
							if (b.equalsIgnoreCase("jack in")) {
								System.out.println(
										"You tap into a flood of information. The main two bits you find are of Mori, who you realize is presumed dead for her role in inciting the Independence day riots, and fragments of MageLan data, the rumored society of hackers who attack Corporate interests. You learn Mori and MageLan are somewhere in downtown -San Island-.");
							} else {
								System.out.println("You leave a note in the room for Rhyz with your contact info.");
							}
						}
					}
				}
			} else if (c.equalsIgnoreCase("jack into net")) {

				moves--;
				jackedIn = true;
				floor = 1;
				while (jackedIn) {
					System.out.println("Currently on floor " + floor + ". \nDIVE? [y/n]");
					isu = ent.nextLine();
					if (isu.equalsIgnoreCase("y")) {
						// Selecting Encounter
						int encounter = rand.nextInt(9) + floor;
						if (encounter <= 8) {
							System.out.println("No hostile entities on this floor.");
						} else if (encounter <= 20) {
							System.out.println(
									"BLACK ICE DETECTED. BEGINING ICEPICK. FAILURE WILL LIKELY RESULT IN AN OVERLOAD");
							if (type == 1) {
								delve = h1.FragCon(floor, aHacking);
							} else if (type == 2) {
								delve = h1.Overload(floor, aHacking);
							} else if (type == 3) {
								delve = h1.PasswordHunt(floor, aHacking);
							} else if (type == 4) {
								delve = h1.Calculate(floor, aHacking);
							}
							if (delve == 0) {
								System.out.println(
										"You feel the black ICE begin to seep into your system. The pain is overwhelming and you black out. Once you come to, its been a few hours and you're on the edge of a deadly immune response.");
								jackedIn = false;
								aHP = 0;
								moves = 1;
							}
						} else if (encounter >= 11) {
							// DAEMON fight
						} else if (encounter >= 15) {
							// Hostile Netrunner
						}

						type = rand.nextInt(4) + 1;
						if (type == 1) {
							delve = h1.FragCon(floor, aHacking);
						} else if (type == 2) {
							delve = h1.Overload(floor, aHacking);
						} else if (type == 3) {
							delve = h1.PasswordHunt(floor, aHacking);
						} else if (type == 4) {
							delve = h1.Calculate(floor, aHacking);
						}
						if (delve <= 0) {
							System.out.println("TRACE AT CRITICAL. EXIT NOW BEFORE DAMAGE BECOMES MORE SEVERE.");
							aHP -= 5;
							jackedIn = false;
						} else {
							floor += delve;
						}
					} else if (isu.equalsIgnoreCase("n")) {
						System.out.println("SCRUBBING TRACE... DISCONECTING...");
						jackedIn = false;
					}

				}

				// Netrun rewards
				if (floor >= 3) {
					System.out.println(
							"There are messages on the early floor. Several that came through around the time you walked into this building. They’re encrypted, but you can make out that they were warnings of some sort");
				}
				if (floor >= 5) {
					System.out.println(
							"There's another Net architecture connected to this one, judging by the pings its somewhere in this room.");
					if (ace.bos >= 8) {
						System.out.println(
								"Base record data seems to indicate that right before leaving, whoever was here before I arrived pressed the red button on the Chair four times and then pulled the adjustment lever.");
					}
				}
				if (floor >= 10) {
					System.out.println(
							"You find the ghosts of messages long since deleted, but not effectively scrubbed. They describe something called “Sunray,” which appears to be an underground AI development team. They’re connected to MageLan somehow, judging from how often the two words appear in allied texts. The  person named Mori seemingly knows more about both of this. Rhyz seems to only be connected to Mori, not MageLan or Sunray..");
				}

			} else if (c.equalsIgnoreCase("Wait in the room")) {
				moves--;
				int waitedRounds = 0;
				boolean call = false;
				while (call == false) {
					System.out.println("Nothing happened yet.\nWould you like to keep waiting? [yes or no]");
					moves--;
					String ans = ent.nextLine();
					if (ans.equalsIgnoreCase("yes")) {
						waitedRounds++;
						if (waitedRounds == 10) {
							call = true;
						}
					} else {
						break;
					}
				}
				System.out.println(
						"You recive a call from an unknown ID...\n and thats all of the script we've translated into code so far! hope you liked it, and congrats on reaching this far considering this is probably a buggy mess and also a very difficult puzzle game. So, yay! please tell Kaptie we did good so we dont lose our GPAs right before we graduate!");
			} else if (c.equalsIgnoreCase("leave room")) {
				System.out.println(
						"You return home to sell off the gear you've collected and refill your blockers. You're just about to go to sleep when something odd happens.");
				System.out.println(
						"You recive a call from an unknown ID...\n and thats all of the script we've translated into code so far! hope you liked it, and congrats on reaching this far considering this is probably a buggy mess and also a very difficult puzzle game. So, yay! please tell Kaptie we did good so we dont lose our GPAs right before we graduate!");

			} else {
				System.out.println("Invalid Input");
			}
		}
	}
}
