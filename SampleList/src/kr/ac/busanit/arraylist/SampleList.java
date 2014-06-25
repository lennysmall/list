package kr.ac.busanit.arraylist;

import java.util.ArrayList;

public class SampleList {
	public static void main(String[] args){
		ArrayList<String> list = new ArrayList<String>(); // 1.7은 <String> 안씀 뒤에꺼

		list.add("First");
		list.add("Second");
		list.add("Third");
		list.add("Second");

		showList(list);

		System.out.println("===========================");
		//		list.remove(2);
		if(list.remove("Second")){ //먼저나오는 것 하나만 지워짐
			System.out.println("지워졌다");
		}else{
			System.out.println("지울게없다.");
		}
		if(list.remove(1)!=null){ //null이 아닐경우 지워라
			System.out.println("지워임");
		}else{
			System.out.println("안지워짐");
		}
		System.out.println(list.size()+"개 남았다");
				
		for(int i=0; i<list.size();i++){
			System.out.println(list.get(i));
		}

		showList(list);
	}	
	public static void showList(ArrayList<String> list){
		for(String str : list){ //향상된 for문은 list에 반드시 집합이 와야함.
			System.out.println(str);
		}

	}

}
