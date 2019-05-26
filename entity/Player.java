package mazegame.entity;

import java.util.HashMap;

public class Player extends Character {	
	private Location currentLocation;
	private HashMap<String, Item> items;

    public Player()
    {
    	this.items = new HashMap<>();
    }

    public Player(String name)
	{
	    super (name);
	    this.items = new HashMap<>();
	}
    
    public Location getCurrentLocation() {
		return currentLocation;
	}

	public void setCurrentLocation(Location currentLocation) {
		this.currentLocation = currentLocation;
	}

	public HashMap<String, Item> getItems() {
		return items;
	}
	
	public boolean addItem(String label, Item item) {
		if(this.items.containsKey(label)) 
			return false;
		this.items.put(label, item);
		return true;
	}

	public void setItems(HashMap<String, Item> items) {
		this.items = items;
	}
	
	public String listItems() {	
		StringBuilder returnMsg = new StringBuilder();
		for (Object label: this.items.keySet()) {
	       	returnMsg.append(label.toString() + "\n");            
	    }
//		for(Item item: this.items.values()) {
//			returnMsg.append(item.toString() + "\n");
//		}			
        return returnMsg.toString();
	}
	
	public boolean purchaseItem(String label) {
		// check if already purchased or not
		if(this.items.containsKey(label)){
			return false;
		}
		
		// check if item is available in shop or not
		if(this.currentLocation.getSelectedShop().getWeapons().containsKey(label)){
			return false;
		}
		
		// purchase Item
		this.items.put(label, this.currentLocation.getSelectedShop().getWeapons().get(label));
		return true;
	}
	
}
