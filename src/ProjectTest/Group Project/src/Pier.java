import java.util.*;

public class Pier 
{
	
	
	private int aBuff, aQuick, aTech, aHacking, aBookSmarts, aStreetSmarts, aDealing, aCool, aSneak, aDodge, aEyes, aCharm, aIntimidate, aLie, aHPmax;

	Pier(int aBuff, int aQuick, int aTech, int aHacking, int aBookSmarts, int aStreetSmarts, int aDealing, int aCool, int aSneak, int aDodge, int aEyes, int aCharm, int aIntimidate, int aLie, int aHPmax) {
		  this.aBuff = aBuff;
		  this.aQuick = aQuick;
		  this.aTech = aTech;
		  this.aHacking = aHacking;
		  this.aBookSmarts = aBookSmarts;
		  this.aStreetSmarts = aBookSmarts;
		  this.aDealing = aDealing;
		  this.aCool = aCool;
		  this.aHPmax = aHPmax;

		
		
    int moves = 20;
    
    /*sts - street smarts; bos - book smarts; qck - quick; buf - buff; tech - tech; eyes - eyes; cool - cool; lck - luck; chrm - charm; ice - ICE; inl - intelligence; hst - history; hck - hack; corp - corporate; snk - sneak; laug - leg augment; haug - hand augment; remhk - remote hacking; str - strength*/
    Character ace = new Character(10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 20, true, true, true);
    List<String> inventory = new ArrayList<String>();
    
    // START
    while (moves > 0) {
    
    if (ace.bos > 8 || ace.tech > 8)
    {
      System.out.println("Augger clinics tend to be in covered areas to protect from rain, might want to look at for with a roof.");
    }
    if (ace.bos > 10 || ace.tech > 10)
    {
      System.out.println("Salt is notorious for screwing up cyberware, the clinic probably wouldn’t be anywhere near the sea with all the spray it's kicking up.");
    }
    if (ace.inl > 13 || ace.tech > 13)
    {
      System.out.println("<No text for this option>");
    }
    if (ace.eyes > 5)
    {
      System.out.println("Power is off right now, but the litter around here isn’t that wet. I’d bet this place was open recently.");
    }
    if (ace.eyes > 17)
    {
      System.out.println("The cameras in this area are active and possibly looking at you.");
    }
    if (ace.sts > 9)
    {
      System.out.println("This pier has been falling out of popularity recently, whoever owns it probably only holds onto this for the property value. What a waste, but at least I know that means no ones living on it. Otherwise the landlord would have brought in a goliath to clear them out.");
    }
    if (ace.hst > 10)
    {
      System.out.println("That abandoned mall over there is run by the L34Ders, they’ll probably shoot me on sight if I go in there, but they would also know this area very well.");
    }

    //ENTERING PIER SURFACE AREA

    Scanner ent = new Scanner(System.in);
    System.out.println("You enter pier surface area. There are many objects you can interact with: telephone pole, old ferris wheel, carnival game, inactive security cameras, pier subsurface area, pier ruined apartments and abandoned mall. To see interaction options enter object's name.");
    
    String isu = "";
    boolean isTPJacked = false;

    while (isu != "return home")
    {
      System.out.println("Enter Interaction Point Name. Or enter [Return home]");
      isu = ent.nextLine();
      
      if(isu.equalsIgnoreCase("telephone pole") || isu.equalsIgnoreCase("pole") || isu.equalsIgnoreCase("telephone"))
      {
        System.out.println("Power is running through this.");
        if(ace.hck > 8)
        {
          System.out.println("Jack it?");

          while (isu.equalsIgnoreCase("no") || isu.equalsIgnoreCase("yes"))
          {
            isu = ent.nextLine();
            if (isu.equalsIgnoreCase("no"))
            {
              System.out.println("You decided not to jack the pole.");
            }
            else if (isu.equalsIgnoreCase("yes"))
            {
              System.out.println("The pole is jacked. Power runs somewhere below the pier and the nearby abandoned hall.");
              isTPJacked = true;
            }
          }
        }
      }
    
      else if(isu.equalsIgnoreCase("old ferris wheel") || isu.equalsIgnoreCase("ferris wheel") || isu.equalsIgnoreCase("wheel") || isu.equalsIgnoreCase("ferris"))
      {
        int car = 0;
        System.out.println("There are 24 cars in the ferris wheel. To climb to next one, enter 'climb'.");
        while (isu.equalsIgnoreCase("climb") && car < 15)
        {
          car++;
          System.out.println("The car number " + car + " is empty.");
        }
        System.out.println("In car number " + car + " is a dead woman in military gear.");
        if (ace.sts > 8)
        {
          System.out.println("Street Scavs would be hounding this corpse to loot the gear the second they smelled blood. And within minutes her boss should have sent a drone to collect the corpse and equipment before the scavs got to this. Something is stopping both those groups from retrieving her.");
        }
        if (ace.tech > 9)
        {
          System.out.println("This is old ARIES gear. Whoever she is, she had connections to someone powerful and was hired to do something quietly. I might be able to get this off her and sell it for something good.\nYou take the gear. You don't have much use for it, but someone on the black market certainly does.");
          inventory.add("old ARIES gear");
        }
        if (ace.corp > 8)
        {
          System.out.println("She seems to be corporate of some sort. Probably DEi special ops.");
        }
        if (ace.corp > 14)
        {
          System.out.println("Definitely DEi special ops, but corporate protocol only allows for deployment in other countries and even then there is either a partner or an armed escort that follows an agent. If there’s only one here and her gear hasn’t been recovered, then this is probably not an official operation.");
        }
        if (ace.hck > 2)
        {
          System.out.println("The Helmet is still intact, and the synapstring hasn’t been cut. Might be able to pull her recent convos then can jack in.");
          // hacking game?
        }
      }

      if (isu.equalsIgnoreCase("carnival game") || isu.equalsIgnoreCase("game") || isu.equalsIgnoreCase("carnival"))
      {
        if (ace.eyes > 8)
        {
          inventory.add("handgun");
        }
        // unlock heat scope option
      }

      if (isu == "inactive security cameras" || isu == "security cameras" || isu == "cameras")
      {
        if (ace.buf > 7 || ace.qck > 7 || ace.laug || ace.remhk)
        {
          System.out.println("Jack in?");
          while (isu != "no" || isu != "yes")
          {
            if (ent.nextLine() == "no")
            {
              System.out.println("You decided not to jack in.");
            }
            else if (ent.nextLine() == "yes")
            {
              if (ace.hck > 5)
              {
                System.out.println("Cameras are active and someone is using them.");
              }
              if (ace.hck > 10)
              {
                System.out.println("Whoever is in this system with me knows what they’re doing. They’ve got a firewall already installed, so this must be a base of some sort.");
              }
              // hacking game
            }
          }
        }

        if (isu.equalsIgnoreCase("pier subsurface area") || isu.equalsIgnoreCase("subsurface area"))
        {
          System.out.println("You find a matinence door leading down below. It seems not only rusted shut, but maglocked somehow.");
          if (ace.tech > 20)
          {
            System.out.println("Manipulate maglocks to open the door?");
            while (isu != "yes" || isu != "no")
            {
              isu = ent.nextLine();
              if (isu == "yes")
              {
                System.out.println("The door is open.");
              }
              if (isu == "no")
              {
                System.out.println("You decided not to manipulate maglocks.");
              }
            }
          }
          if (ace.str > 10)
          {
            System.out.println("Break the anchors holdng the frame to the door?");
            while (isu != "yes" || isu != "no")
            {
              isu = ent.nextLine();
              if (isu == "yes")
              {
                System.out.println("The door is open.");
              }
              if (isu == "no")
              {
                System.out.println("You decided not to break the anchors.");
              }
            }
          }
          if (ace.hck > 10)
          {
            System.out.println("Jack in?");
            while (isu != "yes" || isu != "no")
            {
              isu = ent.nextLine();
              if (isu == "yes")
              {
                System.out.println("The door is open.");
                // hacking game
              }
              if (isu == "no")
              {
                System.out.println("You decided not to jack in.");
              }
            }
          }
        }

        if (isu.equalsIgnoreCase("apartments") || isu.equalsIgnoreCase("pier ruined apartments")) {
          if (ace.sts > 7)
          {
            System.out.println("This place has been in use recently. Probably squatters in some of these rooms.");
          }
          if (ace.sts > 10)
          {
            System.out.println("A place like this must be very popular among the street dwelling population here.");
          }
          if (ace.bos > 12)
          {
            System.out.println("This place must have shut down around the same time as the mall, but with the way property values on the coast have been more people should be living here unless something is keeping them away.");
          }
          System.out.println("[(Room #)___, Front Desk]");
          isu = ent.nextLine();
          if (isu.equalsIgnoreCase("122") || isu.equalsIgnoreCase("Room 122")) {
        	  System.out.println("this door has a keyboard on the floor with the wire running through the wall into the room");
          } else if (isu.equalsIgnoreCase("Front Desk")) {
        	  System.out.println("The only keys missing are numbers 138, 140, 155, 230, 231, 233, 239, 340, 345, 346, 404, 410, and 420,");
        	  if (ace.eyes > 12) {
        		  System.out.println("It seems like numbers 120, 121, 122, 123, and 124 have been glued in place.");
        	  }
          } else {
        	  System.out.println("This room has been abandoned for ages");

          }
        }

        if (isu.equalsIgnoreCase("mall") || isu.equalsIgnoreCase("abandoned mall"))
        {
          System.out.println("A gang has set up here, seemingly L34Ders. There's the sound of a patrol somewhere in the halls. Seems their base is in the food court.");
          if (ace.eyes > 8)
          {
            System.out.println("They have a lot of surveillance equipment, might be they have some data of Rhyz.");
          }
          if (ace.eyes > 12 || ace.tech > 8)
          {
            System.out.println("Their equipment is hooked into the local net, I saw a port outside I can use");
          }
          if (ace.snk > 9)
          {
            System.out.println("Staying to the shadows as you move, you’re fortunate to realize that there’s a well armed individual walking the halls on patrol who hasn’t noticed you yet.\nYou can [distract] them, [sneak] or [talk] to them.");

            isu = ent.nextLine();

            if (isu == "distract")
            {
              System.out.println("[Play] the sound of police sirens or [Trip] the motion-activated door?");

              isu = ent.nextLine();

              if(isu == "Play")
              {
                System.out.println("You pull out the speaker and play the sound of police sirens approaching. Your audio craft is masterful. Unfortunately, playing it from a speaker you're currently holding has revealed you to the patrolman, who opens fire.");
                //combat
              }
              if (isu == "Trip")
              {
                System.out.println("You send a few pulses of light at the sensor of the motion-activated door. It slides open and shut a few times, getting the attention of the patrolman while you sneak by");
              }
            }
            if (isu == "talk")
            {
              if (ace.chrm < 5)
              {
                System.out.println("You try to get a greeting out but the guard is jumpy to let you get another word out once he sees your face in his territory.");
                if (ace.qck > 8)
                {
                  System.out.println("You flee.");
                }
                if (ace.qck >= 6 && ace.qck <= 7)
                {
                  System.out.println("You dodge but can't flee.");
                }
                else
                {
                  System.out.println("Combat begins.");
                  //combat
                }
              }
            }
            if (ace.remhk || inventory.contains("saw"))
            {
              System.out.println("You jack in.");
              //hacking game

              System.out.println("The patrol is still circling, staying too long is likely to get you caught.");
              if (ace.tech > 8)
              {
                System.out.println("You rig the L34D's router to explode as a distraction.");
              }
              if (ace.hck > 5)
              {
                System.out.println("You play police sirens in the mall.");
              }
              if (ace.qck > 10)
              {
                System.out.println("You sneak out.");
              }
              if (ace.qck >= 10)
              {
                System.out.println("You successfully ran out of the mall.");
              }
              else
              {
                System.out.println("You were shot in the back.");
              }
            }
          }
      }
      }
    }
    }
    
    System.out.println("Your body trembles as your immune system begins to act up after a day of work. You try to disociate and avoid exasperating the attack as you make your way home.");
    
    
	}
	
}