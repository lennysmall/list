package kr.ac.busanit.arraylist;

import java.util.ArrayList;

public class Ex1 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		int n1 = 1, n2 = 1;
		list.add(n1);
		list.add(n2);
		
		for(int i =3; i<=10; i++){
			int next = n1+n2;
			list.add(next);
			n1=n2;
			n2=next;
		}
		for(int n : list){
			System.out.println(n+" ");
		}
		System.out.println();
		
	}

}
