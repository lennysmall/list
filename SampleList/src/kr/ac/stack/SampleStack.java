package kr.ac.stack;

import java.util.Iterator;
import java.util.Stack;

public class SampleStack {
	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		stack.push("First");
		stack.push("Second");
		stack.push("Third");

		//		while(!stack.isEmpty()){
		//			System.out.println(stack.pop());
		Iterator<String> itr = stack.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		System.out.println(stack.size());
	}

}

