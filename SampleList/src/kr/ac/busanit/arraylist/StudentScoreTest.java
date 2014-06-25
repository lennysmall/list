
package kr.ac.busanit.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentScoreTest {

	public static void main(String[] args) {
		ArrayList<StudentScore> list = new ArrayList<>();

		list.add(new StudentScore("홍길동", 90, 80, 70));
		list.add(new StudentScore("수지", 90, 80, 70));
		list.add(new StudentScore("2pm", 90, 80, 70));
		list.add(new StudentScore("2am", 90, 80, 70));
		list.add(new StudentScore("김기동", 90, 80, 70));
		//주석
		ShowList(list);
		//내림차순으로 정렬하려면 스튜던트스코어세서 컴페어두 리턴에 -를 붙여주거나
		//스투턴스코어테스트 컬렉션.sort(list, Collections.reversOrder());하자
		Collections.sort(list);
		System.out.println(list);
		
	}
	
	public static <T> void ShowList(List<T> list){
		for(T element : list){
			System.out.println(element);
		}
	}

}
