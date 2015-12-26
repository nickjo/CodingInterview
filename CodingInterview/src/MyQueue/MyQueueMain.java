package MyQueue;

public class MyQueueMain {
	public static void main(String[] agrs){
		MyQueue queue = new MyQueue(7);
		
		queue.enqueue("a");
		queue.enqueue("b");
		queue.enqueue("c");
		queue.enqueue(1);
		queue.enqueue("c");
		queue.enqueue("c");
		queue.dequeue();
		queue.enqueue("c");
		
		System.out.println(queue.toString());
		
		System.out.println("dequeue: " + queue.dequeue());
		
		System.out.println(queue.toString());
		
		queue.clear();
		System.out.println(queue.toString());
		
	}
}
