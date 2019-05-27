package mazegame.entity;

import java.util.ArrayList;
import java.util.HashMap;

public class Shop {
	private String name;
	private HashMap<String,Item> weapons;
	
	public Shop(String name){
		this.name = name;
		this.weapons = new HashMap<String, Item>();
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public HashMap<String,Item> getWeapons() {
		return this.weapons;
	}
	public void setWeapons(HashMap<String,Item> weapons) {
		this.weapons = weapons;
	}
	
	public boolean addWeapon(String label,Item weapon){
		if(this.weapons.containsKey(label)){
			return false;
		}
		this.weapons.put(label, weapon);
		return true;
	}	
	
	public Item getWeapon(String label) {
		return this.weapons.get(label);
	}
	public String listWeapon(){
		StringBuilder returnMsg = new StringBuilder();
		for(Item item: this.weapons.values()) {
			returnMsg.append(item.toString() + "\n");
		}			
        return returnMsg.toString();
	}
	
	public void sellItem(String item) {		
	}
	
	public String toString() {
		return new String(name);
	}
}
