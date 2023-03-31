package ch16;

public class Player { 
	private PlayerLevel level;
	
	public Player(){
		level = new BiginnerLevel();
		level.showLevelMessage();
	}
	public PlayerLevel getLevel() {
		return level; //레벨 반환 
		
	}
	public void upgradeLevel(PlayerLevel  level) {
		this.level =level;
		level.showLevelMessage();
	}
	
	public void play(int count) { 
		level.go(count);
	}
}
