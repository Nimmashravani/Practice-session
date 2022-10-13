package CollectionsDemo;

import java.util.ArrayDeque;

public class ArrayDequeueDemo {

	public static void main(String[] args) {
		ArrayDeque<Integer>myqueue = new ArrayDeque<>();
		
		myqueue.add(10);
		myqueue.add(20);
		myqueue.add(30);
		myqueue.addFirst(40);
		
		System.out.println(myqueue);
		
		myqueue.removeFirst();
		myqueue.removeLast();
		
		System.out.println(myqueue);
	}
}