package mazegame.control;

import mazegame.entity.Player;

public class SellItemCommand implements Command{
	private CommandResponse response;
	@Override
	public CommandResponse execute(ParsedInput userInput, Player thePlayer) {
		response = new CommandResponse("syntax error: sell-item <itemname>");
		
		if(userInput.getArguments().size() == 1){
			String sellItemName = userInput.getArguments().get(0).toString();
			
			if(thePlayer.getCurrentLocation().getSelectedShop() == null){
				this.response.setMessage("Please select a shop first");
				return this.response;
			}				
						
			thePlayer.sellItem(sellItemName);
			this.response.setMessage("Item Sold :"+sellItemName);
		}
		return response;
	}

}
