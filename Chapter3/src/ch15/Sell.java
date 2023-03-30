package ch15;

public interface Sell {
	
	void sell(); // 팔다.
	
	default void order() {
		System.out.println("sell order");
	}

}
