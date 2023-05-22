import java.util.ArrayList;
import java.util.List;

// Henry Dunn


class Combat {

  static void combatMethod(Character enemy, int aBuff, int aQuick, int aTech, int aHacking, int aEyes, int aSneak, int aDodge, int aHackEffect, int aHackLvl, List<String> hackList, int aBaseAC) {
    System.out.println(enemy.getBuff());
    int enemyACnow = enemy.baseAC;
    int aACnow = aBaseAC;
    
    //reset then set stats (*temporary buffs*, etc)
    
    //include non-attack moves (assess, talk, dodge, flee, trip, grapple, breakICE, )
    //ie
    /*
    if movechoice.equalsignorecase"assess" {
    if aEyes > 5 {
    println(weakPoint1)
      if enemy.buff < aBuff {
      enemyName + "'s appears very physically weak'"
      }
    } if aEyes > 10 {
    println(weakPoint2)
    } if aEyes > 15 {
    println(weakPoint3)
    } if aEyes > 20 {
    println(weakPoint4)
    }
    }
    
    if movechoice.equalsignorecase"grapple" {
    if aBuff > enemy.Buff {
    "you pin " enemyName "in your hold"
    current enemy AC = current enemy AC - aBuff;
    
    
    } else {
    enemy.name + "breaks out of your hold"
    }
    }
    */
    
    //have a CLASS for attackCheck
    
  //[1am all-nighter stress comment] Seriously, did you think this was finished??? Theres no way we can use this in its current state. I know i said i would fill in the move details but there still needs to be the actuall COMBAT those moves occur in.
    //I tried finding a way to put this in but Ive got 7 hours before this needs to be presented and I cant code the whole combat system AND get enough sleep to safely drive to school in that time.

    if (moveChoice.equals("assess")) {
      if (aEyes < 5 ) {
        System.out.println(weakPoint1);
      } else if (aEyes < 10) {
        System.out.println(weakPoint2);
      } else if (aEyes < 15) {
        System.out.println(weakPoint3);
      } else {
        System.out.println(weakPoint4);
      }
    } else if (moveChoice.equals(talk)) {
      int anger = enemy.hpMAX - hp;
      if (anger < 10 || anger > 25) {
        System.out.println("Success!");
      } else {
        System.out.println("Fail");
        enemy.Buff += 5;
      }
    } else if(moveChoice.equals("dodge")) {
      aACnow = aBaseAC + aDodge/2;
    } else if(moveChoice.equals("Flee")){
      if(aSneak < 8) {
        System.out.println("Fail");
      } else {
        System.out.println("Success!");
      }
    } else if (moveChoice.equals("Trip")) {
      if () {}
    } else if (moveChoice.equals("Grapple")) {
      
    } else if (moveChoice.equal("breakICE")) {
      
    }
    
  }
  
  public static void main(String[] args) {
    System.out.println("Hello world!");

    //this is JUST a placeholder. We will have an instance of the character class for Ace to hold his stats.
    
    int AceACbonus = 0;
    
    
    int aBuff = 15;
    int aQuick = 15;
    int aTech = 15;
    int aHacking = 15;
    int aBookSmarts = 15;
    int aStreetSmarts = 15;
    int aDealing = 15;
    int aCool = 15;
    //Ace SUB stats (see chart)
    int aCyberTolerance = 15;
    int aSneak = 15;
    int aDodge = 15;
    int aEyes = 15;
    int aInsight = 15;
    int aBarter = 15;
    int aBribing = 15;
    int aCharm = 15;
    int aIntimidate = 15;
    int aLie = 15;
    //Ace Hackstats
    int aHackEffect = 5;
    //Hack Number
    int aHackNum = 3;
    //Hack Level
    int aHackLvl = 5;
    
    int aBaseAC = 8 + (aQuick-10)*2 + AceACbonus;
    



//    combatMethod(Rhyz, aBuff, aQuick, aTech, aHacking, aEyes, aSneak, aDodge, aHackEffect, aHackLvl, hackList);
//    combatMethod(Abutens, aBuff, aQuick, aTech, aHacking, aEyes, aSneak, aDodge, aHackEffect, aHackLvl, hackList);

    
  }
}
