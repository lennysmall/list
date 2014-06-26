package kr.ac.busanit.map;

import java.util.HashMap;
import java.util.Map;

public class SampleMap {
	public static void main(String[] args) {
		Map<String, StudentScore> map = new HashMap<String, StudentScore>();

		StudentScore s1 = new StudentScore("홍길동", 70, 80, 40);
		StudentScore s2 = new StudentScore("박주영", 10, 20, 10);
		StudentScore s3 = new StudentScore("메시", 100, 90, 95);
		StudentScore s4 = new StudentScore("메시1", 100, 80, 95);


		map.put(s1.getName(), s1);
		map.put(s2.getName(), s2);
		map.put(s3.getName(), s3);
		map.put(s4.getName(), s4);

		System.out.println(map.get("메시"));
		System.out.println(map);
	}

}
