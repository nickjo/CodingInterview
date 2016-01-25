package Main;

import MyQueue.MyQueue;

public class QueueMain {
	public static void main(String[] args) {
		MyQueue queue = new MyQueue();
		
		try {
			queue.enqueue("1");
			queue.enqueue("2");
			queue.enqueue("3");
			queue.enqueue("4");
			queue.enqueue("5");
			
			System.out.println(queue.dequeue());
			System.out.println(queue.toString());
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}
