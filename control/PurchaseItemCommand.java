package mazegame.control;

import mazegame.entity.Player;

public class PurchaseItemCommand implements Command{
	private CommandResponse response;
	
	@Override
	public CommandResponse execute(ParsedInput userInput, Player thePlayer) {
		this.response = new CommandResponse("error syntax: purchase <itemname>");
		
		if(userInput.getArguments().size() == 1){
			// check if player entered into the shop or not 
			if(thePlayer.getCurrentLocation().getSelectedShop() == null){
				this.response.setMessage("Please select a shop first");
				return this.response;
			}				
			
			// if not empty purchase item from shop
			thePlayer.purchaseItem(userInput.getArguments().get(0).toString());
			
			response.setMessage("New Item purchased : "+ userInput.getArguments().get(0).toString());			
		}
		
		return response;
	}	
}
