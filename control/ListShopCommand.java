package mazegame.control;

import mazegame.entity.Player;

public class ListShopCommand implements Command{
	private CommandResponse response;
	@Override
	public CommandResponse execute(ParsedInput userInput, Player thePlayer) {
		this.response = new CommandResponse("Unknown Command");
		
		if(userInput.getArguments().size() == 0){
			response.setMessage(thePlayer.getCurrentLocation().availableShops());
		}
		return response;
	}

}
