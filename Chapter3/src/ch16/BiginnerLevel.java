package ch16;

public class BiginnerLevel extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("천천히 달립니다. ");
	}

	@Override
	public void jump() {
		System.out.println("점프를 아직 못합니다. ");
	}

	@Override
	public void turn() {
		System.out.println("돌기를 아직 못합니다.");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("********초급자***********");
		
	}

}
