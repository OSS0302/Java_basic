package ch16;

public class PlayerMainTest {

	public static void main(String[] args) {
		// 초급자 테스트하
		Player player = new Player();
		player.play(1);
		// 중급자레벨 
		AdvancedLevel player2 = new AdvancedLevel();
		player.upgradeLevel(player2);
		player.play(2);
		// 고급자레벨 
		SuperLevel player3 =new SuperLevel();
		player.upgradeLevel(player3);
		player.play(4);
		
	}
		
		

}
