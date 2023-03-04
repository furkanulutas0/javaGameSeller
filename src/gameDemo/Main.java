package gameDemo;

public class Main {
	public static void main(String[] args) {
		
	BaseManager baseManager = new BaseManager();

	Player player = new Player(0, "Furkan", "Ulutas", "2001", "123123");
	Campaign campaign1 = new Campaign(0, "Winter Campaign", 50);	
	
	Game game = new Game();
	baseManager.register(game, 0, "L4D2", "Valve", campaign1, 1000);
	Player player2 = new Player();
	baseManager.register(player2, 0, "Muhammed", "Cihan", "1999", "123123");
	
	baseManager.update(game, "L4D3");
	baseManager.update(player2, "XYZ");
	
	CampaignManager campaignManager = new SummerCampaignManager();
	
	GameManager gameManager = new GameManager();
	gameManager.sell(player2, game, campaignManager);
	
 
	}
}

