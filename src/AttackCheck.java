// Henry Dunn

public class AttackCheck {
	public int buff, quick, tech, hacking;
	public String attackName;
	
	AttackCheck() {
		buff = 10;
		quick = 10;
		tech = 10;
		hacking = 10;
				
	}
	
	
	AttackCheck(String attackName, int turnAC, int buff, int quick, int  tech, int  hacking) {
		this.buff = buff;
		this.quick = quick;
		this.tech = tech;
		this.hacking = hacking;
	}
	
	public int getDamage() {
		int damage = 0;
		if (attackName.equalsIgnoreCase("punch")) {
			damage = buff/4;
			
		} else if (attackName.equalsIgnoreCase("handgun")) {	
			 damage = quick/5;
			
		} else if (attackName.equalsIgnoreCase("dataknife")) {
			damage = quick/6 + hacking/6;
			
		} else if (attackName.equalsIgnoreCase("RPG (rocket propeled role playing game)")) {	
			damage = 10;
			
		} else if (attackName.equalsIgnoreCase("rifle")) {
			damage = quick/4;
			
		} else if (attackName.equalsIgnoreCase("shotgun")) {
			damage = buff/5 + quick/6;
			
		} else if (attackName.equalsIgnoreCase("smart pistol")) {
			damage = tech/3 + hacking/8;
			
		} else if (attackName.equalsIgnoreCase("smart rifle")) {
			damage = quick/5 + tech/4 + hacking/8;
			
		} else if (attackName.equalsIgnoreCase("smart shotgun")) {
			damage = buff/5 + tech/4 + hacking/8;
			
		} else if (attackName.equalsIgnoreCase("lazer drill")) {
			damage = quick/5 + tech/4;
			
		} else if (attackName.equalsIgnoreCase("wrist rocket")) {
			damage = quick/6 + tech/3;
			
		} else if (attackName.equalsIgnoreCase("armblade")) {
			damage = quick/3;
			
		} else if (attackName.equalsIgnoreCase("railgun")) {
			damage = buff/4 + quick/5 + tech/5;
			
		} else if (attackName.equalsIgnoreCase("sledge arm")) {	
			damage = buff/6 + quick/4 + tech/4;
			
		} else if (attackName.equalsIgnoreCase("grenade")) {	
			damage = tech/3;
			
		}else if (attackName.equalsIgnoreCase("emp")) {
			damage = tech/6;
			
		} else if (attackName.equalsIgnoreCase("shock bolt")) {
			damage = tech/4;
			
		} else if (attackName.equalsIgnoreCase("")) {
			
		} else if (attackName.equalsIgnoreCase("LMG")) {
			damage = buff/5 + tech/6;
			
		} else if (attackName.equalsIgnoreCase("megalaser")) {
			damage = tech/2;
			
		} else if (attackName.equalsIgnoreCase("")) {
			
		} else if (attackName.equalsIgnoreCase("Flex G558")) {
			damage = hacking/7;
			
		} else if (attackName.equalsIgnoreCase("Overheat C7")) {
			damage = hacking/5;
			
		} else if (attackName.equalsIgnoreCase("Virus D58")) {
			damage = hacking/4;
			
		} else if (attackName.equalsIgnoreCase("Hostile Reboot U629")) {	
			damage = hacking/4;
			
		} else if (attackName.equalsIgnoreCase("Fae Program D85")) {
			damage = hacking/6;
			
		} else if (attackName.equalsIgnoreCase("Daemon D85")) {
			damage = hacking/3;
			
		} else if (attackName.equalsIgnoreCase("Kill Protocol Z915")) {	
			damage = hacking/2;
			
		} else {
			damage = 0;
		}
		
		return damage;
	}
	
	public String getEffect() {
		//String effect;
		if (attackName.equalsIgnoreCase("emp")) {
			return "Temprarly disables cyberware.";
		} else if (attackName.equalsIgnoreCase("dataknife")) {
			return "ICEbreak";
			
		} else if (attackName.equalsIgnoreCase("")) {	
			return "";
			
		} else if (attackName.equalsIgnoreCase("")) {	
			return "";
			
		} else if (attackName.equalsIgnoreCase("")) {	
			return "";
			
		} else if (attackName.equalsIgnoreCase("")) {	
			return "";
			
		} else if (attackName.equalsIgnoreCase("")) {	
			return "";
			
		} else if (attackName.equalsIgnoreCase("")) {	
			return "";
			
		} else if (attackName.equalsIgnoreCase("")) {	
			return "";
			
		} else if (attackName.equalsIgnoreCase("Flex G558")) {
			return "Damage and stun";
			
		} else if (attackName.equalsIgnoreCase("Overheat C7")) {
			return "Damage";
			
		} else if (attackName.equalsIgnoreCase("Virus D58")) {
			return "Damage and stunn.";
			
		} else if (attackName.equalsIgnoreCase("Hostile Reboot U629")) {	
			return "Stun";
			
		} else if (attackName.equalsIgnoreCase("Fae Program D85")) {
      // Not sure so go back and check
			return "Stun";
			
		} else if (attackName.equalsIgnoreCase("Daemon D85")) {
			return "";
			
		} else if (attackName.equalsIgnoreCase("Kill Protocol Z915")) {	
			return "Damage";
			
		} else {
			return "your attack misses [check if you entered the name correctly]";
		}
		//return effect;
	}
	
	public String getDescription() {
		String atkDesc;
		if (attackName.equalsIgnoreCase("emp")) {
			return "";
		} else if (attackName.equalsIgnoreCase("dataknife")) {
			return "";
			
		} else if (attackName.equalsIgnoreCase("")) {	
			return "";
			
		} else if (attackName.equalsIgnoreCase("")) {	
			return "";
			
		} else if (attackName.equalsIgnoreCase("")) {	
			return "";
			
		} else if (attackName.equalsIgnoreCase("")) {	
			return "";
			
		} else if (attackName.equalsIgnoreCase("")) {	
			return "";
			
		} else if (attackName.equalsIgnoreCase("")) {	
			return "";
			
		} else if (attackName.equalsIgnoreCase("")) {	
			return "";
			
		} else if (attackName.equalsIgnoreCase("Flex G558")) {
			return "Causes the enemy to tighten up so they can't function.";
			
		} else if (attackName.equalsIgnoreCase("Overheat C7")) {
			return "Overheats the enemy.";
			
		} else if (attackName.equalsIgnoreCase("Virus D58")) {
			return "Gives the enemy a virus";
			
		} else if (attackName.equalsIgnoreCase("Hostile Reboot U629")) {	
			return "Reboots the enemy.";
			
		} else if (attackName.equalsIgnoreCase("Fae Program D85")) {
      // Not sure, go back and check
			return "Stuns the enemy.";
			
		} else if (attackName.equalsIgnoreCase("Daemon D85")) {
			return "";
			
		} else if (attackName.equalsIgnoreCase("Kill Protocol Z915")) {	
			return "Does lots of damage to the enemy.";
			
		} else {
			return "your attack misses [check if you entered the name correctly]";
		}
		//return atkDesc;
	}
	

}
