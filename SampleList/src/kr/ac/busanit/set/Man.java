package kr.ac.busanit.set;

public class Man implements Comparable<Man>{
	int age;
	String name;
	@Override
	public boolean equals(Object obj) {
		Man man =(Man)obj;
		System.out.println(name+","+man.name+"를 비교");
		return name.equals(man.name);
	}
	@Override
	public int hashCode(){
		return name.hashCode()%3; //이름으로 나누는것. 스트링타입은 기본적으로 해시코드지원
//		return age%3;
	}
	public Man(String name, int age){
		this.name = name;
		this.age = age;
		
	}
	@Override
	public String toString() {
		return name+" : "+age;
	}
	@Override
	public int compareTo(Man man) {
		return age- man.age;
	}
}
