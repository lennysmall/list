package kr.ac.busanit.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SampleMapClass {
	public static void main(String[] args) {
		Map<String, String> student1 = new HashMap<String, String>();
		student1.put("name", "홍길동");
		student1.put("kor", "90");
		student1.put("eng", "70");
		student1.put("math", "50");

		List<String> values =(List<String>) student1.values(); //데이버만 가지고 옴
//		student1.entrySet(); //키와 밸류가 한덩어리로 묶여서 나옴
		
		List<Map<String, String>> list = new ArrayList<>();
		list.add(student1);
		
		//키에 키를 부르는 법 // 키를 묶어서 클래스를 만듬
	}
}
