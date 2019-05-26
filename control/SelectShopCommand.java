package mazegame.control;

import mazegame.entity.Exit;
import mazegame.entity.Player;
import mazegame.entity.Shop;

public class SelectShopCommand implements Command{
	private CommandResponse response;
	@Override
	public CommandResponse execute(ParsedInput userInput, Player thePlayer) {
		this.response = new CommandResponse("Select shop command : select-shop <shopname>");		
		if(userInput.getArguments().size() == 1){
			String shopName = userInput.getArguments().get(0).toString();
			System.out.println(thePlayer.getCurrentLocation().getShop(shopName));
			if(thePlayer.getCurrentLocation().containsShop(shopName)){				
				Shop shop = thePlayer.getCurrentLocation().getShop(shopName);
				if(shop != null){
					thePlayer.getCurrentLocation().setSelectedShop(shop);
					response.setMessage("Shop Selected "+shopName);
					return response;
				}				
			}
		}					
		return response;
	}

}
