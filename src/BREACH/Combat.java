import java.util.ArrayList;
import java.util.List;

// Henry Dunn

class Combat {

  static int combatMethod(Character enemy, int aBuff, int aQuick, int aTech, int aHacking, int aEyes, int aSneak,
      int aDodge, int aHackEffect, int aHackLvl, List<String> hackList, int aBaseAC, int aHP) {
    System.out.println(enemy.getBuff());
    int enemyACnow = enemy.baseAC;
    int aACnow = aBaseAC;

    // reset then set stats (*temporary buffs*, etc)

    // include non-attack moves (assess, talk, dodge, flee, trip, grapple, breakICE,
    // )
    // ie
    /*
     * if movechoice.equalsignorecase"assess" {
     * if aEyes > 5 {
     * println(weakPoint1)
     * if enemy.buff < aBuff {
     * enemyName + "'s appears very physically weak'"
     * }
     * } if aEyes > 10 {
     * println(weakPoint2)
     * } if aEyes > 15 {
     * println(weakPoint3)
     * } if aEyes > 20 {
     * println(weakPoint4)
     * }
     * }
     * 
     * if movechoice.equalsignorecase"grapple" {
     * if aBuff > enemy.Buff {
     * "you pin " enemyName "in your hold"
     * current enemy AC = current enemy AC - aBuff;
     * 
     * 
     * } else {
     * enemy.name + "breaks out of your hold"
     * }
     * }
     */

    // have a CLASS for attackCheck

    // Method Start

    boolean play = true;
    String move = "ace";
    int aMoves = aQuick/5;
    int eMoves = enemy.getQuick/5;
    int moves = 0;
    String moveChoice = "";

    while (play == true) {
      if (move = "ace") {
        if (moveChoice.equals("assess")) {
          moves++;
          if (aEyes < 5) {
            System.out.println(weakPoint1);
          } else if (aEyes < 10) {
            System.out.println(weakPoint2);
          } else if (aEyes < 15) {
            System.out.println(weakPoint3);
          } else {
            System.out.println(weakPoint4);
          }
        } else if (moveChoice.equals("talk")) {
          moves++;
          int anger = enemy.hpMAX - hp;
          if (anger < 10 || anger > 25) {
            System.out.println("Success!");
          } else {
            System.out.println("Fail");
            enemy.Buff += 5;
          }
        } else if (moveChoice.equals("dodge")) {
          moves++;
          aACnow = aBaseAC + aDodge / 2;
        } else if (moveChoice.equals("Flee")) {
          moves++;
          if (aQuick < enemy.getQuick) {
            System.out.println("Fail");
          } else {
            System.out.println("Success!");
          }
        } else if (moveChoice.equals("Trip")) {
          moves++;
          if (aQuick + aBuff < enemy.getQuick + enemy.getBuff) {
          }
        } else if (moveChoice.equals("Grapple")) {
          moves++;

        } else if (moveChoice.equal("breakICE")) {
          moves++;

        }
        
        if(moves>aMoves){
          move = "enemy";
          moves = 0;
        }


      } else if (move = "enemy") {
        double h = enemyACnow/enemy.baseAC;
        if (h) {}
        if (moves>eMoves) {
          move = "ace";
          moves = 0;
        }
      } 
      
      
      if (aHP < 1) {
        play = false;
      } else if (enemyACnow < 1) {
        play = false;
        
      }
    }
    return aHP;
  }
  // Method End


  
  public static void main(String[] args) {
    System.out.println("Hello world!");

    // this is JUST a placeholder. We will have an instance of the character class
    // for Ace to hold his stats.

    int AceACbonus = 0;

    int aBuff = 15;
    int aQuick = 15;
    int aTech = 15;
    int aHacking = 15;
    int aBookSmarts = 15;
    int aStreetSmarts = 15;
    int aDealing = 15;
    int aCool = 15;
    // Ace SUB stats (see chart)
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
    // Ace Hackstats
    int aHackEffect = 5;
    // Hack Number
    int aHackNum = 3;
    // Hack Level
    int aHackLvl = 5;

    int aBaseAC = 8 + (aQuick - 10) * 2 + AceACbonus;

    // combatMethod(Rhyz, aBuff, aQuick, aTech, aHacking, aEyes, aSneak, aDodge,
    // aHackEffect, aHackLvl, hackList);
    // combatMethod(Abutens, aBuff, aQuick, aTech, aHacking, aEyes, aSneak, aDodge,
    // aHackEffect, aHackLvl, hackList);

  }
}
