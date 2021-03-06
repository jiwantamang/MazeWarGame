package mazegame.entity;

import java.util.ArrayList;
import java.util.HashMap;

public class Location {
	private HashMap exits;
	private String description;
	private String label;
	private HashMap<String, Shop> shops;
	private Shop selectShop;
	private HashMap<String, Item> items;
	
	public Location () { }
	
	public Location (String description, String label)
	{
		this.setDescription(description);
		this.setLabel(label);
		exits = new HashMap();
		// initialize a weapon list
		this.shops = new HashMap<>();	
		this.items = new HashMap<>();
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
	
	public boolean addShop(String label, Shop shop) {
		if(this.shops.containsKey(shop.getName())){
			return false;
		}
		
		this.shops.put(label, shop);		
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
	
	public String getStatus() {
		StringBuilder returnMsg = new StringBuilder();
		returnMsg.append("\n Location = "+ this.label);
		if(this.selectShop != null)
			returnMsg.append("\n Shop = "+ this.selectShop.getName());
		else 
			returnMsg.append("\n Shop = Not selected yet");
		return new String(returnMsg);
	}
	
	public void setSelectedShop(Shop shop) {
		this.selectShop = shop;
	}
	
	public Shop getSelectedShop(){
		return this.selectShop;
	}
		
	public HashMap<String, Item> getItems() {
		return items;
	}
	
	public boolean addItem(String label, Item item) {
		if(this.items.containsKey(label)){
			return false;
		}
		this.items.put(label,  item);
		return true;
	}

	public void setItems(HashMap<String, Item> items) {
		this.items = items;
	}
	
	public String listItems() {	
		StringBuilder returnMsg = new StringBuilder();
		for(Item item: this.items.values()) {
			returnMsg.append(item.toString() + "\n");
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
