package mazegame.control;

import mazegame.entity.Player;

public class MazeStatusCommand implements Command{
	private CommandResponse response;
	@Override
	public CommandResponse execute(ParsedInput userInput, Player thePlayer) {
		// TODO Auto-generated method stub
		this.response = new CommandResponse("error syntax: mazestatus");
		if(userInput.getArguments().size() == 0) {
			String mazeStatus = thePlayer.getCurrentLocation().getStatus();
			this.response.setMessage(mazeStatus);
		}
		return this.response;
	}
	
}
