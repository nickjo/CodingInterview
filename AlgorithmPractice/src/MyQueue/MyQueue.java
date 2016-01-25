package MyQueue;

public class MyQueue {
	Object[] queue;
	int queueSize;
	int rear, front;
	static int DEFAULT_QUEUE_SIZE = 10;
	
	public MyQueue(){
		this(DEFAULT_QUEUE_SIZE);
	}
	public MyQueue(int size){
		queue = new Object[size];
		queueSize = size;
		front = rear = 0;
	}
	
	// front && rear�� ���� �ε��� ���. ���� ť�� ��
	int next(int a){
		return (a+1) % queueSize;
	}
	
	// ť�� ������ ����
	public void enqueue(Object x)throws Exception{
		// OverFlow
		if(front == next(rear)){
			throw new Exception("Queue OverFlow");
		}
		
		queue[rear] = x;
		rear = next(rear);
	}
	
	// ť���� ������ ���
	public Object dequeue()throws Exception{
		if(rear == front){
			throw new Exception("Queue UnderFlow");
		}
		
		Object x = queue[front];
		queue[front] = null;
		front = next(front);
		
		return x;
	}
	
	public String toString(){
		String s = "";
		s = "Queue=[";
		
		for(int i=front; i != rear; i=next(i)){
			s += queue[i];
			if(i != rear-1){
				s += ", ";
			}
		}
		
		return s + "], front=" + front + ", rear=" + rear;
	}
}
