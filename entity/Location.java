package mazegame.entity;

import java.util.ArrayList;
import java.util.HashMap;

public class Location {
	private HashMap exits;
	private String description;
	private String label;
	private HashMap shops;
	
	public Location () { }
	
	public Location (String description, String label)
	{
		this.setDescription(description);
		this.setLabel(label);
		exits = new HashMap();
		// initialize a weapon list
		this.shops = new HashMap<>();
	}
	
	public boolean addExit (String exitLabel, Exit theExit)
	{
		if (exits.containsKey(exitLabel))
			return false;
		exits.put(exitLabel, theExit);
		return true;
	}
	
	public Exit getExit(String exitLabel) {
		return (Exit) exits.get(exitLabel);
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}
	
	public boolean containsExit(String exitLabel) {
		return exits.containsKey(exitLabel);
    }
	
	public String availableExits() {
        StringBuilder returnMsg = new StringBuilder();
        for (Object label: this.exits.keySet()) {
            returnMsg.append("[" + label.toString() + "] ");
        }
        return returnMsg.toString();
	}
	
	public boolean addShop(Shop shop) {
		if(this.shops.containsKey(shop.getName())){
			return false;
		}
		
		this.shops.put(shop.getName(), shop);
		return true;
	}
	
	public HashMap<String, Shop> getShops() {
		return this.shops;
	}
	
	public boolean containsShop(String label) {
		return this.shops.containsKey(label);
	}
	
	public Shop getShop(String label) {
		return (Shop)this.shops.get(label);
	}
	
	public String availableShops(){
		StringBuilder returnMsg = new StringBuilder();
        for (Object label: this.shops.keySet()) {
        	returnMsg.append("[" + label.toString() + "] ");            
        }
        return returnMsg.toString();
	}
		
	public String toString() {
	        return "**********\n" + this.label + "\n**********\n"
	            + "Exits found :: " + availableExits() + "\n**********\n"
	            + "Shops found :: " + availableShops() + "\n**********\n"
	            + this.description + "\n**********\n";
	}	
}
