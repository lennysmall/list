
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
		
		ShowList(list);
		
		Collections.sort(list);
		System.out.println(list);
		
	}
	
	public static <T> void ShowList(List<T> list){
		for(T element : list){
			System.out.println(element);
		}
	}

}
