package gameDemo;

public class MernisCheckManager implements IPlayerCheckService{

	@Override
	public boolean check(Player player) {
		boolean key;
		if (player.getFirstName() == "Sena") {
			key = true;
		}
		else {
			key = false;
		}	
		return key; 
	}

}
