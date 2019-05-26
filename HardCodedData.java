package mazegame;

import mazegame.boundary.IMazeData;
import mazegame.entity.Exit;
import mazegame.entity.Item;
import mazegame.entity.Location;
import mazegame.entity.Shop;

public class HardCodedData implements IMazeData {
	private Location startUp;
	
	public HardCodedData()
	{
		createLocations();
	}
	
	public Location getStartingLocation()
	{
		return startUp;
	}
	
	public String getWelcomeMessage()
	{
		return "Welcome to the Mount Helanous";
	}
	
	private void createLocations () 
	{
		startUp = new Location ("an office with paper strewn everywhere, how anyone can work here effectively is a mystery", "Julies Office");
		Location lounge = new Location ("an open space containing comfortable looking couches and artwork", "Airport Lounge");
		Location t127 = new Location ("a lecture theatre", "T127");
		Location gregsOffice = new Location ("a spinning vortex of terror", "Greg's Office");
		
		// Connect Locations
		startUp.addExit("south",  new Exit ("you see an open space to the south", lounge));
		lounge.addExit("north", new Exit("you see a mound of paper to the north", startUp));

        startUp.addExit("west", new Exit("you see a terrifying office to the west", gregsOffice));
        gregsOffice.addExit("east", new Exit("you see a mound of paper to the east", startUp));

        t127.addExit("south", new Exit("you see a mound of paper to the south", startUp));
        startUp.addExit("north", new Exit("you see a bleak place to the north", t127));

        lounge.addExit("northwest", new Exit("you see a terrifying office to the northwest", gregsOffice));
        gregsOffice.addExit("southeast", new Exit("you see an open space to the southeast", lounge));
        
        // add shots to the locations
        startUp.addShop("shop1",new Shop("Shop1"));
        startUp.addShop("shop2",new Shop("Shop2"));
        startUp.addShop("shop3",new Shop("Shop3"));
        
        
        lounge.addShop("shop4",new Shop("Shop4"));
        lounge.addShop("shop5",new Shop("Shop5"));
        lounge.addShop("shop6",new Shop("Shop6"));
        
        t127.addShop("shop7",new Shop("shop7"));
        t127.addShop("shop8",new Shop("shop8"));
        t127.addShop("shop9",new Shop("shop9"));
        
        gregsOffice.addShop("shop10",new Shop("shop10"));
        gregsOffice.addShop("shop11",new Shop("shop11"));
        gregsOffice.addShop("shop12",new Shop("shop12"));
        gregsOffice.addShop("shop13",new Shop("shop13"));
                
        // add items 
        startUp.addItem("dagger", new Item("Dagger", "", 1, 2));
        startUp.addItem("nunchaku", new Item("Nunchaku", "", 2, 2));
        startUp.addItem("greatclub", new Item("Greatclub", "", 5, 10));        
        startUp.addItem("longspear", new Item("Longspear", "", 5, 9));
        startUp.addItem("handaxe", new Item("Handaxe", "", 6, 5));
        
        lounge.addItem("axe, throwing", new Item("Axe, throwing", "", 8, 4));
        lounge.addItem("flail, light", new Item("Flail, light", "", 8, 5));
        lounge.addItem("glaive", new Item("Glaive", "", 8, 15));
        lounge.addItem("guisarme", new Item("Guisarme", "", 9, 15));
        lounge.addItem("sword, short", new Item("Sword, short", "", 10, 3));
        
        t127.addItem("battleaxe", new Item("Battleaxe", "", 10, 7));
        t127.addItem("halberd", new Item("Halberd", "", 10, 15));
        t127.addItem("ranseur", new Item("Ranseur", "", 10, 15));
        t127.addItem("warhammer", new Item("Warhammer", "", 12, 8));
        t127.addItem("longsword", new Item("Longsword", "", 15, 4));
        t127.addItem("scimitar", new Item("Scimitar", "", 15, 4));
        t127.addItem("Trident", new Item("Trident", "", 15, 5));
        t127.addItem("flail, heavy", new Item("Flail, heavy", "", 15, 20));
        
        gregsOffice.addItem("scythe", new Item("Scythe", "", 18, 12));
        gregsOffice.addItem("rapier", new Item("Rapier", "", 30, 3));
        gregsOffice.addItem("greataxe", new Item("Greataxe", "", 20, 20));
        gregsOffice.addItem("waraxe, dwarven", new Item("Waraxe, dwarven", "", 30, 15));
        gregsOffice.addItem("sword, bastard", new Item("Sword, bastard", "", 35, 10));
        gregsOffice.addItem("greatsword", new Item("Greatsword", "", 50, 15));
        gregsOffice.addItem("Falchion", new Item("Flail, heavy", "", 75, 16));
        gregsOffice.addItem("Sword, two-bladed", new Item("Flail, heavy", "", 100, 15));
       			
	}
}
