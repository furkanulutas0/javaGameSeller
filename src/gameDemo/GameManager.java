package gameDemo;

public class GameManager extends BaseManager{
	CampaignManager campaignManager;
	
	@Override
	public void register(Game game, int id, String gameName, String company, Campaign campaign, int price) {
		game.setId(id);
		game.setGameName(gameName);
		game.setCompany(company);
		game.setCampaign(campaign);
		game.setPrice(price);
		System.out.println("Game kayit edildi " + game.getGameName());
	}
	
	@Override 
	public void update(Game game, String gameName) {
		game.setGameName(gameName);
		System.out.println("Game guncellendi " + game.getGameName());
	}
	
	public void sell(Player player, Game game, CampaignManager campaignManager) {
		this.campaignManager = campaignManager;
		campaignManager.add(game, game.getCampaign());
		System.out.println(player.getFirstName() + " adli oyuncu " + game.getGameName() + " adli oyunu " + game.price + " TL'ye satti!");
	}
	
}
