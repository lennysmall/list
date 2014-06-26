package kr.ac.busanit.set;

import java.util.TreeSet;

public class SampleTreeSet {
	public static void main(String[] args) {
		TreeSet<Man> tree = new TreeSet<Man>();
		
		for(int i=0; i<10;i++){
			String name = "홍길동"+i;
			tree.add(new Man(name,i));
		}
		SampleSet.show(tree);
	}
}
	