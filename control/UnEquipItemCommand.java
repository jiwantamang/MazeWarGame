package mazegame.control;

import mazegame.entity.Player;

public class UnEquipItemCommand implements Command{
	private CommandResponse response;
	@Override
	public CommandResponse execute(ParsedInput userInput, Player thePlayer) {
		// TODO Auto-generated method stub
		this.response = new CommandResponse("syntax error: unequip-item");
		
		if(userInput.getArguments().size() == 0){
			thePlayer.setUnequipedItem();
			this.response.setMessage("Item Unequiped");
		}
		return response;
	}
}
