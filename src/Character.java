import java.util.*;

public class Character {
  private int moves, buff, quick, tech, hacking, booksmarts, streetsmarts, dealing, cool, hpMAX;
int baseAC;
  private String name;
  private String[][] leveledAttackList;
  Random rand = new Random();


	//constructor
	Character() {

	}
	
	Character(String name, int moves, int buff, int quick, int  tech, int  hacking, int  booksmarts, int  streetsmarts, int  dealing, int  cool, int hpMAX, String[][] leveledAttackList, int baseAC) {
	this.moves = moves;
    this.buff = buff;
    this.quick = quick;
    this.tech = tech;
    this.hacking = hacking;
    this.booksmarts = booksmarts;
    this.streetsmarts = streetsmarts;
    this.dealing = dealing;
    this.cool = cool;
    this.hpMAX = hpMAX;
    this.baseAC = quick/2;
    
	}
	
	public int getBuff() {
		return buff;
	}
	public int getQuick() {
		return quick;
	}
	public int getTech() {
		return tech;
	}
	public int getHacking() {
		return hacking;
	}
	public int getStreetsmarts() {
		return streetsmarts;
	}
  public int getBooksmarts() {
		return booksmarts;
	}
	public int getDealing() {
		return dealing;
	}
  public int getCool() {
		return cool;
	}
	public int getHPMAX() {
		return hpMAX;
	}
  /*
  public int getHPNOW() {
		return hpNOW;
	}
  */
  
}
