package MyQueue;

public class MyQueue {
	Object[] queue;
	int queueSize; // ť ũ��
	int front;
	int rear; // ť�� ����(���� ������ ��Ҹ� ����Ŵ)
	
	// ť�� �⺻ ũ��
	static int DEFAULT_QUEUE_SIZE = 100;
	
	public MyQueue(){
		this(DEFAULT_QUEUE_SIZE);
	}
	
	public MyQueue(int size){
		queueSize = size;
		queue = new Object[size];
		front = rear = 0;
	}
	
	// ����ó��
	private void error(String s){
		System.err.println(s);
		System.exit(1);
	}
	
	// ���� ����� ÷�ڸ� ����
	private int next(int a) {
		return (a+1) % queueSize;
	}
	
	// ť�� ����
	public void clear(){
		// ��ü ť �ʱ�ȭ
		for(int i=front; i != rear; i=next(i)){
			queue[i] = null;
		}
		
		front = rear = 0;
	}
	
	// ť�� �����͸� ����
	public void enqueue(Object x){
		// over flow
		if(next(rear) == front){
			error("�� �̻� ť�� ��Ҹ� �߰��� �� �����ϴ�.");
		}
		queue[rear] = x;
		rear = next(rear);
	}
	
	// ť���� �����͸� ����
	public Object dequeue(){
		if(front == rear){
			// under flow
			error("ť�� ����ֱ� ������ ��Ҹ� ���� �� �����ϴ�.");
		}
		Object x = queue[front];
		front = next(front);
		return x;
	}
	
	// ť�� ����ִ��� ����
	public boolean isEmpty(){
		return front == rear;
	}
	
	// ť�� ������ ���ڿ��� ǥ��
	public String toString(){
		String s;
		
		s = "MyQueue=[";
		for(int i=front; i !=rear; i=next(i)){
			s += queue[i];
			
			if(i < rear-1){
				s += ",";
			}
		}
		s += "], front=" + front + ", rear=" + rear;
		return s;
	}
}
