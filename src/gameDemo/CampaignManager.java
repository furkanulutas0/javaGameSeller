package gameDemo;

public abstract class CampaignManager implements ICampaignService{

	@Override
	public abstract void add(Game game, Campaign campaign);

	@Override
	public abstract void update(Campaign campaign);

}
