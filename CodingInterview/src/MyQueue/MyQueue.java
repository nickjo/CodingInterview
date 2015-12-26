package MyQueue;

public class MyQueue {
	Object[] queue;
	int queueSize; // 큐 크기
	int front;
	int rear; // 큐의 리어(리어 다음의 요소를 가리킴)
	
	// 큐의 기본 크기
	static int DEFAULT_QUEUE_SIZE = 100;
	
	public MyQueue(){
		this(DEFAULT_QUEUE_SIZE);
	}
	
	public MyQueue(int size){
		queueSize = size;
		queue = new Object[size];
		front = rear = 0;
	}
	
	// 에러처리
	private void error(String s){
		System.err.println(s);
		System.exit(1);
	}
	
	// 다음 요소의 첨자를 구함
	private int next(int a) {
		return (a+1) % queueSize;
	}
	
	// 큐를 비운다
	public void clear(){
		// 전체 큐 초기화
		for(int i=front; i != rear; i=next(i)){
			queue[i] = null;
		}
		
		front = rear = 0;
	}
	
	// 큐에 데이터를 넣음
	public void enqueue(Object x){
		// over flow
		if(next(rear) == front){
			error("이 이상 큐에 요소를 추가할 수 없습니다.");
		}
		queue[rear] = x;
		rear = next(rear);
	}
	
	// 큐에서 데이터를 꺼냄
	public Object dequeue(){
		if(front == rear){
			// under flow
			error("큐가 비어있기 때문에 요소를 꺼낼 수 없습니다.");
		}
		Object x = queue[front];
		front = next(front);
		return x;
	}
	
	// 큐가 비어있는지 조사
	public boolean isEmpty(){
		return front == rear;
	}
	
	// 큐의 내용을 문자열로 표시
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
