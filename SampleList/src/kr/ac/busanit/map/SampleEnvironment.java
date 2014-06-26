package kr.ac.busanit.map;

import java.util.Iterator;
import java.util.Map;

public class SampleEnvironment {
	public static void main(String[] args) {
		Map<String, String> env = System.getenv();
		System.out.println(env.get("JAVA_HOME"));
		System.out.println(env.get("HOMEPATH"));
		//		Iterator<String> itr = env.keySet().iterator();
		//		while(itr.hasNext()){
		//			String key = itr.next();
		//			System.out.println(key+ " : "+ env.get(key));
		//		}
	}
}


