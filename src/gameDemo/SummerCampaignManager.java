package gameDemo;

public class SummerCampaignManager extends CampaignManager{
	
	@Override
	public void add(Game game, Campaign campaign) {
		game.setPrice(game.getPrice()*campaign.discount/100);
		 
	}

	@Override
	public void update(Campaign campaign) {
		// TODO Auto-generated method stub
		
	}

}
