package MyStack;

public class MyStack {
	Object[] stack; // 스택의 본체
	int stackSize; // 스택의 크기
	int sp; // 스택 포인터
	
	static int DEFAULT_STACK_SIZE = 100; // 기본 스택 크기
	
	// 스택 생성
	public MyStack(){
		this(DEFAULT_STACK_SIZE);
	}
	
	// 크기  지정 스택 생성
	public MyStack(int size){
		stack = new Object[size];
		stackSize = size;
		sp = 0;
	}
	
	// 에러처리
	private void error(String s){
		System.err.println(s);
		System.exit(1);
	}
	
	// 스택의 내용을 모두 버림
	public void clear(){
		sp = 0;
	}
	
	// 스택에 데이터를 쌓음
	public void push(Object x){
		if(sp >= stackSize){
			error("Stack overflow");
		}
		stack[sp++] = x;
	}
	
	// 스택에서 데이터를 꺼냄
	public Object pop(){
		if(sp <= 0){
			error("Stack underflow");
		}
		return stack[--sp];
	}
	
	// 스택이 비어있는지 조사
	public boolean isEmpty(){
		return sp == 0;
	}
	
	// 스택 내용을 문자열로 반환
	public String toString(){
		String s;
		
		s = "MyStack=[";
		for(int i=0; i < sp; i++){
			s = s + stack[i];
			if(i < sp - 1){
				s = s + ",";
			}
		}
		s = s + "]";
		return s;
	}
}
