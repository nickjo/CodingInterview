package MyStack;

public class ThreeStacks {
	int stackSize = 5;
	int makeStacks = 3;
	int[] buffer = new int[stackSize * makeStacks];
	int[] stackPointer = {-1, -1, -1}; // �� �� ���� ��ġ ������
	
	public void push(int stackNum, int value) throws Exception{
		// ���� ������ �ִ��� �˻�
		if(stackPointer[stackNum] + 1 >= stackSize){ // ������ ����
			throw new Exception("Out of space");
		}
		
		// ���� �����͸� ������Ű�� �� ����� ���� �� ����
		stackPointer[stackNum]++;
		buffer[absTopOfStack(stackNum)] = value;
	}
	
	// �ֻ��� �����͸� ������.
	public int pop(int stackNum) throws Exception{
		if(stackPointer[stackNum] == -1){
			throw new Exception("Trying to pop an empty stack");
		}
		int value = buffer[absTopOfStack(stackNum)]; // �� �� ����
		buffer[absTopOfStack(stackNum)] = 0; // �� �� ���� ���
		stackPointer[stackNum]--; // ���� ������ ����
		return value;
	}
	
	// �ش� ������ �ֻ��� �����͸� ���(���� �����Ϳ��� ��ȭ ����)
	public int peek(int stackNum){
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
	
	public String tostring(int stackNum){
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
	
	public String tostringAll(){
		String str = "";
		
		for(int i = 0; i < makeStacks; i++){
			str += tostring(i) + "\n";
		}
		return str;
	}
}
