package MyStack;

public class ThreeStacks {
	int stackSize;
	int makeStacks;	
	Object[] buffer;
	int[] stackPointer; // �� �� ���� ��ġ ������
	
	static int DEFAULT_STACK_SIZE = 5;
	static int DEFAULT_MAKE_STACKS = 3;
	
	public ThreeStacks(){
		this(DEFAULT_STACK_SIZE, DEFAULT_MAKE_STACKS);
	}
	
	public ThreeStacks(int stackSize, int makeStacks){
		this.stackSize = stackSize;
		this.makeStacks = makeStacks;
		buffer = new Object[stackSize * makeStacks];
		stackPointer = new int[makeStacks];
		
		// ���� �ʱ� ��ġ��
		for(int i=0; i < stackPointer.length; i++){
			stackPointer[i] = -1;
		}
	}
	
	public void push(int stackNum, Object value) throws Exception{
		// ���� ������ �ִ��� �˻�
		if(stackPointer[stackNum] + 1 >= stackSize){ // ������ ����
			throw new Exception("Out of space");
		}
		
		// ���� �����͸� ������Ű�� �� ����� ���� �� ����
		stackPointer[stackNum]++;
		buffer[absTopOfStack(stackNum)] = value;
	}
	
	// �ֻ��� �����͸� ������.
	public Object pop(int stackNum) throws Exception{
		if(stackPointer[stackNum] == -1){
			throw new Exception("Trying to pop an empty stack");
		}
		Object value = buffer[absTopOfStack(stackNum)]; // �� �� ����
		buffer[absTopOfStack(stackNum)] = 0; // �� �� ���� ���
		stackPointer[stackNum]--; // ���� ������ ����
		return value;
	}
	
	// �ش� ������ �ֻ��� �����͸� ���(���� �����Ϳ��� ��ȭ ����)
	public Object peek(int stackNum){
		int index = absTopOfStack(stackNum);
		return buffer[index];
	}
	
	public boolean isEmpty(int stackNum){
		return stackPointer[stackNum] == -1;
	}
	
	// stackNum�� ����Ű�� ������ �� ����� ���� ÷�� ��ȯ
	public int absTopOfStack(int stackNum){
		return stackNum * stackSize + stackPointer[stackNum];
	}
	
	// Ư�� ���� ���
	public String toString(int stackNum){
		String str = stackNum + "�� Stack: [";
		int firstSize = stackNum * stackSize; 
		
		for(int i = firstSize; i <= firstSize + stackPointer[stackNum]; i++){
		 	str += buffer[i];
		 	if(i <= firstSize + stackPointer[stackNum] - 1){
		 		str += ", ";
		 	}
		}
		return str + "]";
	}
	
	// ��� ���� ���
	public String toStringAll(){
		String str = "";
		
		for(int i = 0; i < makeStacks; i++){
			str += toString(i) + "\n";
		}
		return str;
	}
}
