package kr.ac.busanit.arraylist;

import java.util.ArrayList;

public class StudentScore implements Comparable<StudentScore>{
	String name;
	int kor;
	int eng;
	int math;
	public StudentScore(String name,int kor,int eng,int math){
		this.name=name;
		this.kor=kor;
		this.eng=eng;
		this.math=math;
	}
	public int getSum(){
		return kor+eng+math;
	}
	public int getAvg(){
		return getSum()/3;
	}
	@Override
	public String toString(){
		return name+ "- 국어: "+kor+
				" 영어:"+eng+
				" 수학:"+math+
				" 총점:"+getSum();
	}
	@Override
	public boolean equals(Object obj){
		StudentScore ss = (StudentScore)obj;
		return name.equals(ss.name);
	}
	@Override
	public int compareTo(StudentScore o) {
		//return name.compareTo(o.name);//작으면 음수, 같으면 0, 크면 양수 반환 		
		int total1 =getSum();
		int total2 = o.getSum();
		//주석
		return total1>total2?1:total1<total2?-1:0;
		
		
		
//		if(total1>total2){
//			return 1;
//		}else if(total1<total2){
//			return -1;
//		}else{
//			return 0;
//		}
	}
	
}
