package ch13;

import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		TreeSet<String> treeSet = new TreeSet<String>();
		treeSet.add("김구");
		treeSet.add("이승만");
		treeSet.add("박정희");
		
		for(String str : treeSet) {
			System.out.println(str);
		}
		
	}

}
