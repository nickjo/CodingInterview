package MyStack;

public class MyStack {
	Object[] stack;
	int sp = 0; // 스택 포인트
	private static int DEFAULT_STACK_SIZE = 10;
	
	public MyStack(){
		this(DEFAULT_STACK_SIZE);
	}
	
	public MyStack(int stackSize){
		stack = new Object[stackSize];
	}
	
	public void push(Object inputNum) throws Exception{
		if(sp >= stack.length){
			throw new Exception("Stack OverFlow");
		}
		stack[sp++] = inputNum;
	}
	
	public Object pop()throws Exception{
		if(isEmpty()){
			throw new Exception("Stack UnderFlow");
		}
		return "pop: " + stack[--sp];
	}
	public Boolean isEmpty(){
		if(sp <= 0) return true;
		return false;
	}
	
	public String toString(){
		String s = "Stack=[";
		
		for(int i=0; i < sp; i++){
			s += stack[i];
			if(i < sp-1){
				s += ", ";
			}
		}
		return s + "]";
	}
	public void clear(){
		for(int i=0; i < sp; i++){
			stack[i] = null;
		}
		sp = 0;
	}
}
