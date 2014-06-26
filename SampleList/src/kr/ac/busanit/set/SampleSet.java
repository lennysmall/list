package kr.ac.busanit.set;

import java.util.HashSet;
import java.util.Set;

public class SampleSet {
	public static void main(String[] args) {
		HashSet<Man> set = new HashSet<Man>();
		for(int i=0; i<10; i++){
			String name = "홍길동"+i;
			set.add(new Man(name,i));
		}
		HashSet<Man> another = new HashSet<Man>();
		another.add(new Man("홍길동10",10));
		another.add(new Man("홍길동8",8));
		another.add(new Man("홍길동7",7));
		
		set.addAll(another);
//		set.add(new Man("홍길동8", 7)); // 이렇게하면 7살짜리8살짜리 홍길동7이 존재하게됨.
		//해쉬코드 이름이 다르면 다르게 인식함. 가급적이면 이름으로 해시코드를 만들어야함.
		set.removeAll(another);
		//교집함구하기
		// a 교집합 b = a+b-(a-b)-(b-a)
		//집합연산
		
		
		show(set);
	
	}
	public static <T> void show(Set<T> set){ //set은 hashset의 슈퍼클래스
		for(T element : set){
			System.out.println(element);
			//나머지가 같은것끼리 비교중
		}
	}
}
