package MyQueue;

public class TwoStacksQueue{
	Object[] stack1;
	Object[] stack2;
	int stackSize;
	int sp1,sp2;

	static int DEFAULT_STACK_SIZE = 5;
	static int STACK1 = 1;
	static int STACK2 = 2;

	public TwoStacksQueue(){
		this(DEFAULT_STACK_SIZE);
	}

	public TwoStacksQueue(int size){
		stack1 = new Object[size];
		stack2 = new Object[size];
		stackSize = size;
		sp1 = sp2 = 0;
	}

	public void push(Object x) throws Exception{
		if(sp1 >= stackSize){
			throw new Exception("Stack Overflow");
		}
		
		stack1[sp1++] = x;
	}
	
	/*
	 * stack1의 데이터를 stack2로 옮긴후 stack2의 sp2 삭제 후 다시 stack1으로 옮김
	 * */
	public Object pop() throws Exception{
		stackDataMove();
		Object popResult = stack2[sp2];
		stack2[sp2--] = null;
		stackDataRemove();
		
		return popResult;
	}

	/* 
	 * stack2에 데이터가 없다면 stack1에 데이터를 push
	 * 데이터가 있다면 stack2의 peek 값을 반환
	 * */
	public Object peek() throws Exception{
		if(sp2 == 0){
			stackDataMove();
		}
		
		System.out.println("sp2: " + sp2);
		
		return stack2[sp2];
	}
	
	public boolean isEmpty(){
		return sp1 == 0;
	}
	
	// stack1의 데이터를 stack2로 이동
	public void stackDataMove() throws Exception{
		// stack2에 데이터가 있다면 초기화 시킨다.
		if(sp2 > 0){
			clear(STACK2);
		}
		
		for(int i=sp1; i < 0; i--){
			stack2[sp2++] = stack1[i];
		}
		
		sp2 = sp1;
	}
	
	// stack2의 데이터를 stack1로 옮김
	public void stackDataRemove() throws Exception{
		// stack2에 데이터가 있다면 초기화 시킨다.
		if(sp1 > 0){
			clear(STACK1);
		}
		
		for(int i=sp2; i < 0; i--){
			stack1[sp1++] = stack2[i];
		}
	}
	
	// 전체 스택 초기화
	public void clear(){
		// 스택 포인터 초기화
		sp1=sp2=0;
		
		for(int i=0; i < stack1.length; i++){
			stack1[i] = null;
		}
		
		for(int i=0; i < stack2.length; i++){
			stack2[i] = null;
		}
	}
	
	// 특정 스택 초기화
	public void clear(int stackNum) throws Exception{
		switch (stackNum) {
		case 1:
			sp1 = 0;
			for(int i=0; i < stack1.length; i++){
				stack1[i] = null;
			}
			break;
		case 2:
			sp2 = 0;
			for(int i=0; i < stack2.length; i++){
				stack2[i] = null;
			}
			break;

		default:
			throw new Exception("Wrong Stack Number");			
		}
	}
	
	// 전체 스택 초기화
	public void clear(int stackNum,int stackNum1){
		clear();
	}
}
