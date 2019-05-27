package mazegame.control;

import mazegame.entity.Player;

public class EquipItemCommand implements Command{
	private CommandResponse response;
	@Override
	public CommandResponse execute(ParsedInput userInput, Player thePlayer) {
		// TODO Auto-generated method stub
		this.response = new CommandResponse("syntax error: equip-item <itemname>");
		
		if(userInput.getArguments().size() == 1){
			String itemName = userInput.getArguments().get(0).toString();
			if(!thePlayer.isItemAvailable(itemName)){
				this.response.setMessage("Item Not available");
			}else{
				thePlayer.setEquipedItem(itemName);
				this.response.setMessage("Item Equiped : "+itemName);
			}
		}
		return response;
	}

}
