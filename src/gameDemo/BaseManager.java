package gameDemo;

public class BaseManager implements IBaseService{
 
	@Override
	public void register(Player player, int id, String firstName, String lastName, String birthYear, String nationalityId) {
		PlayerManager playerManager = new PlayerManager(new TestCheckManager());
		playerManager.register(player);
				
	}

	@Override
	public void register(Game game, int id, String gameName, String company, Campaign campaign, int price) {
		GameManager gameManager = new GameManager();
		gameManager.register(game, id, gameName, company, campaign, price);
				
	}

	@Override
	public void update(Player player, String name) {
		PlayerManager playerManager = new PlayerManager(new TestCheckManager());
		playerManager.update(player, name);
	}

	@Override
	public void update(Game game, String name) {
		GameManager gameManager = new GameManager();
		gameManager.update(game, name);;
		
		
	}

}
