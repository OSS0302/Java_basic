package ch13;

import java.util.Set;
import java.util.TreeSet;

public class ComparableTest {

	public static void main(String[] args) {
		Set<String> set = new TreeSet<String>(new MyCompare());
		set.add("aaa");
		set.add("ccc");
		set.add("bbb");
				
		System.out.println(set);
		
		TreeSet<String> set1 = new TreeSet<String>(new MyCompare());
		set1.add("park");
		set1.add("Kim");
		set1.add("Lee");
		
		System.out.println(set1);
	}

}


