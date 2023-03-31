package ch16;

public abstract class PlayerLevel {
	
	public abstract void run(); // 달리기
	public abstract void jump();// 점프
	public abstract void turn();// 돌기
	public abstract void showLevelMessage(); // 레벨메시지
	
	
	public void go(int count){
		run();
		for(int i =0; i<count; i++) {
			jump();
		}
		turn();
		
	}
}
