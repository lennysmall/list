package kr.ac.busanit.arraylist;

import java.util.ArrayList;

//양의 정수 n을 넘겨받아서 n의 약수를 모두 저장한 ArrayList<Integer>를 반환하는 메소드를 작성하고
//ArrayList<Integer>의 모든 값을 출력하는 메소드도 작성하여 결과를 출력
public class Ex2 {
	public ArrayList<Integer> getDivisors(int n){
		ArrayList<Integer> list = new ArrayList<Integer>();	
			
		for(int i = 1; i <= n; i++){
			if(n % i == 0){
			list.add(i);
			  
				
			}
			
		}return list;
	}
	public void showList(ArrayList<Integer> list){
		for(int i : list){ //향상된 for문은 list에 반드시 집합이 와야함.
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		Ex2 ex2 = new Ex2();
		ArrayList<Integer> list = ex2.getDivisors(99);
		ex2.showList(list);


	}

}
