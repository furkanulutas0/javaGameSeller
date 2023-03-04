package gameDemo;

public class PlayerManager extends BaseManager{
	private IPlayerCheckService playerCheckService;
	
	
	
	public PlayerManager(IPlayerCheckService playerCheckService) {
		this.playerCheckService = playerCheckService;
	}
	
	public void register(Player player) {
		if (this.playerCheckService.check(player)) {
			System.out.println("Sisteme Kayit Edildi! " + player.getFirstName());
		} else {
			System.out.println("Sisteme girilen bilgiler veritabani ile eslesmedi");
		}
		

	} 
	@Override
	public void update(Player player, String name) {
		player.setFirstName(name);
		System.out.println("Player updated, new name: " + player.getFirstName());
	}
	public void delete(Player player) {
		
	}

}
