import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.*;

// Mike + Dunn

//Thank you so, so much for doing this. I know you werent able to finish it but its so nice to have my script translated at least a bit. <3 Ill clean up the rest.

public class Clinic 
{
	
	private int aBuff, aQuick, aTech, aHacking, aBookSmarts, aStreetSmarts, aDealing, aCool, aSneak, aDodge, aEyes, aCharm, aIntimidate, aLie, aHPmax;

	Clinic(int aBuff, int aQuick, int aTech, int aHacking, int aBookSmarts, int aStreetSmarts, int aDealing, int aCool, int aSneak, int aDodge, int aEyes, int aCharm, int aIntimidate, int aLie, int aHPmax, String aBackground) {
		  this.aBuff = aBuff;
		  this.aQuick = aQuick;
		  this.aTech = aTech;
		  this.aHacking = aHacking;
		  this.aBookSmarts = aBookSmarts;
		  this.aStreetSmarts = aBookSmarts;
		  this.aDealing = aDealing;
		  this.aCool = aCool;
		  this.aHPmax = aHPmax;

		
    int moves = 10 + aBuff;
    
    /*sts - street smarts; bos - book smarts; qck - quick; buf - buff; tech - tech; eyes - eyes; cool - cool; lck - luck; chrm - charm; ice - ICE; inl - intelligence; hst - history; hck - hack; corp - corporate; snk - sneak; laug - leg augment; haug - hand augment; remhk - remote hacking; str - strength*/
    characterAce ace = new characterAce(aStreetSmarts, aBookSmarts, aQuick, aBuff, aTech, aStreetSmarts, aCool, 10, aCool, aBookSmarts, aHacking, aBookSmarts, aQuick);
    List<String> inventory = new ArrayList<String>();
    
    Scanner ent = new Scanner(System.in);
    
    System.out.println("Room 122 shows clear signs of use. The faint, musky smell of rotting architecture is dulled by the influx of fresh air from a heating vent and the sickly citrus of cleaning supplies. The dirty carpet has been covered with plastic plates welded together and polished to a shine. The whole area is such a refreshing sight after walking through ruins all day that you almost miss the automated defense systems hanging right above your head. Fortunately, the tesla beads don’t seem to be active right now, otherwise you and anyone else who came through this door recently would have been fried instantly/n Investigate the room? (yes/no)");

    String c = ent.nextLine();

    if (c == "no")
    {
      System.out.println("You decided not to investigate the room.");
    }
    else if (c == "yes")
    {
      System.out.println("In the center of the room is an augger chair, where operations usually take place. The chair is on an isolated system, it seems. But there is still a Net server in the corner of the room for some reason. Aside from that the only other thing here are closets and drawers full of some Augging materials.");
      
      if (ace.eyes > 6)
      {
        System.out.println("There are visibly wet footprints on the floor, which stand out against the pristine conditions of the room.");
      }
      if (ace.eyes > 10)
      {
        System.out.println("The footprints appear to be exiting the room. There is only one pair.");
      }
      if (ace.eyes > 15)
      {
        System.out.println("One of the panels next to the operating chair is maglocked for some reason.");
      }
      if (ace.tech > 5)
      {
        System.out.println("Yep. This is definitely an Auggers clinic.");
      }
      if (ace.tech > 10)
      {
        System.out.println("Actually, this is too outfitted to be a clinic, this is closer to a lab. No other reason to have a diagnostic chair that high-end.");
      }
      if (ace.chrm > 7 || ace.tech > 8) // I put charm instead of dealing, I can change it later
      {
        System.out.println("The gear here is top-shelf. You’ve only seen these brands of tech pass hands, never actually be implanted in someone. You don’t have an Augger to chip you with it, but everything here could net you a hell of a price.");
      }
      System.out.println("Print what to do: [investigate] chair, steal everything [not nailed down], steal everything [nailed down] or [jack into net].");
      c = ent.nextLine();
      if (c == "investigate")
      {
        System.out.println("There are parts you can interact with: [red button], [blue button], adjustment [lever], [switchboard], synapstring [port].");
        String cc = "";
        int redButtonPressed = 0;
        while (cc != "exit")
        {
          if (cc == "red button")
          {
            redButtonPressed++;
            System.out.println("nothing happens");
          }
          else if (cc == "blue button")
          {
            System.out.println("Nothing happened.");
          }
          else if (cc == "lever")
          {
            if (redButtonPressed < 4)
            {
              System.out.println("Nothing happened.");
            }
            else
            {
              System.out.println("The floor panel next to the chair opens up, revealing a hidden room beneath. It seems like the room was hastily vacated recently, judging by the cluttered piles of things desperately tossed into the secret space.");
            }
          }
          else if (cc == "switchboard")
          {
            System.out.println("Nothing happens as you interact with the switchboard.");
          }
          else if (cc == "port")
          {
            System.out.println("The port is clean and an Augger’s chair is probably safe to jack into, so you take the blue chord from your wrist and insert it into the port.");
            //hacking game
            boolean gamePassed = true;
            if (gamePassed)
            {
              System.out.println("Inputs on the Red Button seem frequent, even when operating programs aren’t in use. The Lever also has a non-mechanical output to a device that is not this chair.");
            }
          }
        }
      }
      if (c == "not nailed down")
      {
        boolean hasRhyzGear = true;
        System.out.println("Pretty good haul. Once you get home you’ll decide whether to sell this or not.");
      }
      if (c == "nailed down")
      {
        if (ace.str > 12)
        {
          System.out.println("You pull the chair up from the ground. The panel adjacent to it flies open by accident, revealing a hidden room beneath. It seems like the room was hastily vacated recently, judging by the cluttered piles of things desperately tossed into the secret space. Within this room you find an active port, Rhyz must have forgotten to log out of this Net. You could jack in if you wish.");
          boolean hasRhyzChair = true;
          String cc = ent.nextLine();
          if (cc.equalsIgnoreCase("jack in"))
          {
            
          }
        }
      }
    }
  }
}
