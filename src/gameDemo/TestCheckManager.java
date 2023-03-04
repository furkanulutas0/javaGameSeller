package gameDemo;

public class TestCheckManager implements IPlayerCheckService{

	@Override
	public boolean check(Player player) {
		System.out.println("Test check calisti");
		return true;
	}

}
