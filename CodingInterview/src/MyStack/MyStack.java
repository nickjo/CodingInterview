package MyStack;

public class MyStack {
	Object[] stack; // ������ ��ü
	int stackSize; // ������ ũ��
	int sp; // ���� ������
	
	static int DEFAULT_STACK_SIZE = 100; // �⺻ ���� ũ��
	
	// ���� ����
	public MyStack(){
		this(DEFAULT_STACK_SIZE);
	}
	
	// ũ��  ���� ���� ����
	public MyStack(int size){
		stack = new Object[size];
		stackSize = size;
		sp = 0;
	}
	
	// ����ó��
	private void error(String s){
		System.err.println(s);
		System.exit(1);
	}
	
	// ������ ������ ��� ����
	public void clear(){
		sp = 0;
	}
	
	// ���ÿ� �����͸� ����
	public void push(Object x){
		if(sp >= stackSize){
			error("Stack overflow");
		}
		stack[sp++] = x;
	}
	
	// ���ÿ��� �����͸� ����
	public Object pop(){
		if(sp <= 0){
			error("Stack underflow");
		}
		return stack[--sp];
	}
	
	// ������ ����ִ��� ����
	public boolean isEmpty(){
		return sp == 0;
	}
	
	// ���� ������ ���ڿ��� ��ȯ
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
