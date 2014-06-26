package kr.ac.busanit.queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class SampleQueue {
	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<String>();
		queue.offer("First");
		queue.offer("Second");
		queue.offer("Third");

		while(!queue.isEmpty()){
			System.out.println(queue.poll());

			Iterator<String> itr = queue.iterator();
			while(itr.hasNext()){
				System.out.println(itr.next());
			}
			System.out.println(queue.size());
		}
	}
}