package mazegame.control;

import mazegame.entity.Player;

public class DropItemCommand implements Command{
	private CommandResponse response;
	@Override
	public CommandResponse execute(ParsedInput userInput, Player thePlayer) {
		response = new CommandResponse("Syntax Error : drop-item <itemname>");
		return null;
	}

}
