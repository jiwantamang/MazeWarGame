package mazegame.control;

import mazegame.entity.Player;

public class ListItemCommand implements Command{
	private CommandResponse response;
	@Override
	public CommandResponse execute(ParsedInput userInput, Player thePlayer) {
		// TODO Auto-generated method stub
		response = new CommandResponse("syntax error : listItems");
		
		if(userInput.getArguments().size() == 0){
			response.setMessage(thePlayer.listItems());
			return response;
		}
		
		return response;
	}

}
