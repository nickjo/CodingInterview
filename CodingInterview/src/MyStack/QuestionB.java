package MyStack;

public class QuestionB {
	static int number_of_stacks = 3;
	static int default_size = 4;
	static int total_size = default_size * number_of_stacks;
	StackData[] stacks = {new StackData(0, default_size),
	new StackData(default_size, default_size),
	new StackData(default_size * 2, default_size)
	};
	 int[] buffer = new int[total_size];
	
	// ��� ��ҵ��� ũ��
	public int numberOfElements(){
		return stacks[0].size + stacks[1].size + stacks[2].size; 
	}
	
	public int nextElement(int index){
		if(index + 1 == total_size) return 0;
		else return index + 1;
	}
	
	public int previousElement(int index){
		if(index == 0) return total_size - 1;
		else return index + 1;
	}
	
	public void shift(int stackNum){
		StackData stack = stacks[stackNum];
		if(stack.size >= stack.capacity){
			int nextStack = (stackNum + 1) % number_of_stacks;
			shift(nextStack); // ���� Ȯ��
			stack.capacity++;
		}
		
		// �������� ���� �̵�
		for(int i = (stack.start + stack.capacity - 1) % total_size;
				stack.isWithinStack(i, total_size); i = previousElement(i)){
			buffer[i] = buffer[previousElement(i)];
		}
		
		buffer[stack.start] = 0;
		stack.start = nextElement(stack.start); // ���� ������ �̵�
		stack.pointer = nextElement(stack.pointer); // ������ �̵�
		stack.capacity--; // �뷮�� ������� ����
	}
	
	// Expand stack by shifting over other stacks
	public void expand(int stackNum){
		shift((stackNum + 1) % number_of_stacks);
		stacks[stackNum].capacity++;
	}
	
	public void push(int stackNum, int value) throws Exception{
		StackData stack = stacks[stackNum];
		// ���� ������ �ִ��� �˻�
		if(stack.size >= stack.capacity){
			if(numberOfElements() >= total_size){ // ������
				throw new Exception("Out of space");
			}else{ // just need to shift things around
				expand(stackNum);
			}
		}
		stack.size++;
		stack.pointer = nextElement(stack.pointer);
		buffer[stack.pointer] = value;
	}
	
	public int pop(int stackNum) throws Exception{
		StackData stack = stacks[stackNum];
		if(stack.size == 0){
			throw new Exception("Trying to pop an empty stack");
		}
		int value = buffer[stack.pointer];
		buffer[stack.pointer] = 0;
		stack.pointer = previousElement(stack.pointer);
		stack.size--;
		return value;
	}
	
	public int peek(int stackNum){
		StackData stack = stacks[stackNum];
		return buffer[stack.pointer];
	}
	
	public boolean isEmpty(int stackNum){
		StackData stack = stacks[stackNum];
		return stack.size == 0;
	}
}
