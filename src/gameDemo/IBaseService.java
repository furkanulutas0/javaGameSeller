package gameDemo;

public interface IBaseService {
	 void register(Player player, int id, String firstName, String lastName, String birthYear, String nationalityId);
	 void register(Game game, int id, String gameName, String company, Campaign campaign, int price);
	 void update(Player player, String name);
	 void update(Game game, String name);
}
