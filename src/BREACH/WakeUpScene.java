import java.util.*;
import java.util.concurrent.TimeUnit;

public class WakeUpScene {

//	public static void main(String[] args) {
//		int imBlockers;
//		int hp, aBuff, aQuick, aTech, aHacking, aBookS, aStreetS, aDealing, aCool, coyn;

	// made by Alice Leppert 4/24/23
	public static void WakeUp(int imBlockers, int hp, int aBuff, int aQuick, int aTech, int aHacking, int aBookS,
			int aStreetS, int aDealing, int aCool, int coyn) {
		String[] weather = { "cloudy", "sunny", "rainy", "windy", "snowy", "dangerous", "wet" };
		String[] incon = { "cold air", "hot air", "rain", "wind", "snow", "acid rain", "street mud" };
		Random rand = new Random(); // can be taken out if already stated
		Scanner sc = new Scanner(System.in); // can be taken out if already stated
		int r = rand.nextInt(0, 7);
		System.out.println(
				"It looks like a " + weather[r] + " day. The glitchy window has opened itself in the night again and "
						+ incon[r] + " is flowing into the room again.");
		System.out.println("Your newly refilled immunoblockers sit on the bedside table.");
		// taken from Character_Building_BetaPhase by Henry Dunn and revamped by Alice
		// Leppert
		while (true) {
			System.out.println("Press 1: close window\nPress 2: go back to sleep\nPress 3. take blockers");
			int moveChoice = sc.nextInt();
			if (moveChoice == 1 && imBlockers <= 2) {
				System.out.println(
						"You try to hold back the symtoms, but as you reach out to close the window you accidentally focus on your hand, and you fall to the floor in pain, fluids leaking from your eyes.");
				System.out.println("Try again!");
			}
			if (moveChoice == 1 && imBlockers != 0) {
				System.out.println("You snap the window shut");
			}
			if (moveChoice == 2) {
				System.out.println("Its not worth getting out of bed right now... you fall back asleep.");
				try {
					TimeUnit.SECONDS.sleep(2);
					System.out.println("...");
					TimeUnit.SECONDS.sleep(2);
					System.out.println("You wake up again, the window is still open.");
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			if (moveChoice == 3) {
				System.out.println(
						"You tap your thumb on the small dispenser and two pills pop out, you down both of them.");
				imBlockers = imBlockers + 10;
				break;
			}
		}
		// Alice Leppert
		while (true) {
			System.out.println("You hear you stomach rumble. It's time for breakfast.");
			System.out.println("Coyn in Account: " + coyn);
			System.out.println("Please Select One:");
			System.out.println("Press 1: Get a BARR (5 coyn) [No benefit]");
			System.out.println("Press 2: Water (5 coyn) [No benefit]");
			System.out.println("Press 3: Get Noodles (10 coyn) [+1 HP]");
			System.out.println("Press 4: Get Cinnamon Onigiri (10 coyn) [+1 Booksmarts]");
			System.out.println("Press 5: Get Syrnyky (20 coyn) [+1 buff, +1 quick, +1 cool]");
			System.out.println("Press 6: Get Breakfast Platter (30 coyn) [+5 HP]");
			System.out.println("Press 7: Get Wagyu Meal (100 coyn) [+10 HP, +4 to all stats]");
			System.out.println("Press 8: Get a 10-Course Breakfast (500 coyn) [+15 HP, +10 to all stats]");
			int bf = sc.nextInt();
			switch (bf) {
			case 1:
				if (coyn < 1) {
					System.out.println(
							"A cheerful electronic voice eminates from the machine: Sorry you don't have enough money for that!");
					continue;
				} else {
					coyn -= 1;
					break;
				}
			case 2:
				if (coyn < 1) {
					System.out.println(
							"A cheerful electronic voice eminates from the machine: Sorry you don't have enough money for that!");
					continue;
				} else {
					coyn -= 1;
					break;
				}
			case 3:
				if (coyn < 3) {
					System.out.println(
							"A cheerful electronic voice eminates from the machine: Sorry you don't have enough money for that!");
					continue;
				} else {
					hp += 1;
					coyn -= 3;
					break;
				}
			case 4:
				if (coyn < 5) {
					System.out.println(
							"A cheerful electronic voice eminates from the machine: Sorry you don't have enough money for that!");
					continue;
				} else {
					aBookS += 1;
					coyn -= 5;
					break;
				}
			case 5:
				if (coyn < 20) {
					System.out.println(
							"A cheerful electronic voice eminates from the machine: Sorry you don't have enough money for that!");
					continue;
				} else {
					aBuff += 1;
					aQuick += 1;
					aCool += 1;
					coyn -= 20;
					break;
				}
			case 6:
				if (coyn < 30) {
					System.out.println(
							"A cheerful electronic voice eminates from the machine: Sorry you don't have enough money for that!");
					continue;
				} else {
					hp += 8;
					coyn -= 30;
					break;
				}
			case 7:
				if (coyn < 100) {
					System.out.println(
							"A cheerful electronic voice eminates from the machine: Sorry you don't have enough money for that!");
					continue;
				} else {
					hp += 10;
					aBuff += 1;
					aQuick += 1;
					aTech += 1;
					aHacking += 1;
					aBookS += 1;
					aStreetS += 1;
					aDealing += 1;
					aCool += 1;
					coyn -= 100;
					break;
				}
			case 8:
				if (coyn < 500) {
					System.out.println(
							"A cheerful electronic voice eminates from the machine: Sorry you don't have enough money for that!");
					continue;
				} else {
					hp += 15;
					aBuff += 2;
					aQuick += 2;
					aTech += 2;
					aHacking += 2;
					aBookS += 2;
					aStreetS += 2;
					aDealing += 2;
					aCool += 2;
					coyn -= 500;
					break;
				}
			}

			break;
			// sc.close();// may have to take away later
		}
	}
}
