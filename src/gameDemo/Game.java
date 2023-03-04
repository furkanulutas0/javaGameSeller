package gameDemo;

public class Game {
	int id;
	String gameName;
	String company;
	Campaign campaign; 
	int price;
	
	public Game() {
		
	}
	
	
	public Game(int id, String gameName, String company, Campaign campaign,int price) {
		super();
		this.id = id;
		this.gameName = gameName;
		this.company = company;
		this.campaign = campaign; 
		this.price = price;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getGameName() {
		return gameName;
	}


	public void setGameName(String gameName) {
		this.gameName = gameName;
	}


	public String getCompany() {
		return company;
	}


	public void setCompany(String company) {
		this.company = company;
	}


	public Campaign getCampaign() {
		return campaign;
	}


	public void setCampaign(Campaign campaign) {
		this.campaign = campaign;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}

}
