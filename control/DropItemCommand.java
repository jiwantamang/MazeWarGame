package mazegame.control;

import mazegame.entity.Player;

public class DropItemCommand implements Command{
	private CommandResponse response;
	@Override
	public CommandResponse execute(ParsedInput userInput, Player thePlayer) {
		response = new CommandResponse("Syntax Error : drop-item <itemname>");
		if(userInput.getArguments().size() == 1){
			String dropItemName = userInput.getArguments().get(0).toString();
			if(thePlayer.dropItem(dropItemName)){
				response.setMessage("Item dropped: "+dropItemName);
			}else{
				response.setMessage("You does not have this item: "+dropItemName);
			}		
		}
		return response;
	}

}
