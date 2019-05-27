package mazegame.control;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import mazegame.entity.Player;

public class CommandHandler {
	private HashMap<String, Command> availableCommands;
	private ArrayList<String> commands;
	private Parser theParser;
	
	public CommandHandler () {
		availableCommands = new HashMap<String, Command>();
		commands = new ArrayList<String>();
		setupCommands();
		theParser = new Parser(popArrayList());
	}
	
	private void setupCommands () {
		availableCommands.put("go", new MoveCommand());
		availableCommands.put("quit", new QuitCommand());
		availableCommands.put("move", new MoveCommand());
		availableCommands.put("look",  new LookCommand());
		availableCommands.put("select-shop", new SelectShopCommand());
		availableCommands.put("list-items", new ListItemCommand());
		availableCommands.put("list-shop-items", new ListShopItemCommand());
		availableCommands.put("purchase-item", new PurchaseItemCommand());
		availableCommands.put("drop-item", new DropItemCommand());
		availableCommands.put("sell-item", new SellItemCommand());
		availableCommands.put("mazestatus", new MazeStatusCommand());
		availableCommands.put("equip-item", new EquipItemCommand());
		availableCommands.put("unequip-item", new UnEquipItemCommand());
		
	}
	
	private ArrayList<String> popArrayList () {
		Set<String> set = availableCommands.keySet();
		ArrayList <String> temp = new ArrayList<String> ();
		for (String key : set) {
			temp.add(key);
		}
		return temp;
	}
	
	public CommandResponse processTurn (String userInput, Player thePlayer) {
		ParsedInput validInput = theParser.parse(userInput);
		Command theCommand = (Command) availableCommands.get(validInput.getCommand());
		if(theCommand == null) 
		{
			this.helpMenu();
			return new CommandResponse("\n\nInvalid Command");			
		}			
		return theCommand.execute(validInput, thePlayer);
	}
	
	public void helpMenu(){
		System.out.println("Available Commands");
		for(String key: this.availableCommands.keySet()){			
			System.out.println(key);
		}
	}
	// if invalid command list help menu
}