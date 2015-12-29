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
	 * stack1�� �����͸� stack2�� �ű��� stack2�� sp2 ���� �� �ٽ� stack1���� �ű�
	 * */
	public Object pop() throws Exception{
		stackDataMove();
		Object popResult = stack2[sp2];
		stack2[sp2--] = null;
		stackDataRemove();
		
		return popResult;
	}

	/* 
	 * stack2�� �����Ͱ� ���ٸ� stack1�� �����͸� push
	 * �����Ͱ� �ִٸ� stack2�� peek ���� ��ȯ
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
	
	// stack1�� �����͸� stack2�� �̵�
	public void stackDataMove() throws Exception{
		// stack2�� �����Ͱ� �ִٸ� �ʱ�ȭ ��Ų��.
		if(sp2 > 0){
			clear(STACK2);
		}
		
		for(int i=sp1; i < 0; i--){
			stack2[sp2++] = stack1[i];
		}
		
		sp2 = sp1;
	}
	
	// stack2�� �����͸� stack1�� �ű�
	public void stackDataRemove() throws Exception{
		// stack2�� �����Ͱ� �ִٸ� �ʱ�ȭ ��Ų��.
		if(sp1 > 0){
			clear(STACK1);
		}
		
		for(int i=sp2; i < 0; i--){
			stack1[sp1++] = stack2[i];
		}
	}
	
	// ��ü ���� �ʱ�ȭ
	public void clear(){
		// ���� ������ �ʱ�ȭ
		sp1=sp2=0;
		
		for(int i=0; i < stack1.length; i++){
			stack1[i] = null;
		}
		
		for(int i=0; i < stack2.length; i++){
			stack2[i] = null;
		}
	}
	
	// Ư�� ���� �ʱ�ȭ
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
	
	// ��ü ���� �ʱ�ȭ
	public void clear(int stackNum,int stackNum1){
		clear();
	}
}
