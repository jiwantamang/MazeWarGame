package mazegame.entity;

import java.util.ArrayList;

public class Shop {
	private String name;
	private ArrayList<Weapon> weapons;
	
	public Shop(String name){
		this.name = name;
		this.weapons = new ArrayList<>();
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ArrayList<Weapon> getWeapons() {
		return weapons;
	}
	public void setWeapons(ArrayList<Weapon> weapons) {
		this.weapons = weapons;
	}
	
	public void addWeapon(Weapon weapon){
		this.weapons.add(weapon);
	}	
	public void listWeapon(){
		for(Weapon w: this.weapons) {
			System.out.print(w);
		}
	}
	
	public String toString() {
		return new String(name);
	}
}
