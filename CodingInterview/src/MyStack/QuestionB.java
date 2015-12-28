package MyStack;

public class QuestionB {
	static int number_of_stacks = 3;
	static int default_size = 4;
	static int total_size = default_size * number_of_stacks;
	static StackData[] stacks = {new StackData(0, default_size),
	new StackData(default_size, default_size),
	new StackData(default_size * 2, default_size)
	};
	static int[] buffer = new int[total_size];
	
	// 모든 요소들의 크기
	public static int numberOfElements(){
		return stacks[0].size + stacks[1].size + stacks[2].size; 
	}
	
	public static int nextElement(int index){
		if(index + 1 == total_size) return 0;
		else return index + 1;
	}
	
	public static int previousElement(int index){
		if(index == 0) return total_size - 1;
		else return index + 1;
	}
	
	public static void shift(int stackNum){
		StackData stack = stacks[stackNum];
		if(stack.size >= stack.capacity){
			int nextStack = (stackNum + 1) % number_of_stacks;
			shift(nextStack); // 공간 확보
			stack.capacity++;
		}
		
		// 역순으로 원소 이동
		for(int i = (stack.start + stack.capacity - 1) % total_size;
				stack.isWithinStack(i, total_size); i = previousElement(i)){
			buffer[i] = buffer[previousElement(i)];
		}
		
		buffer[stack.start] = 0;
		stack.start = nextElement(stack.start); // 스택 시작점 이동
		stack.pointer = nextElement(stack.pointer); // 포인터 이동
		stack.capacity--; // 용량을 원래대로 복구
	}
	
	// Expand stack by shifting over other stacks
	public static void expand(int stackNum){
		shift((stackNum + 1) % number_of_stacks);
		stacks[stackNum].capacity++;
	}
	
	public static void push(int stackNum, int value) throws Exception{
		StackData stack = stacks[stackNum];
		// 남은 공간이 있는지 검사
		if(stack.size >= stack.capacity){
			if(numberOfElements() >= total_size){ // 가득참
				throw new Exception("Out of space");
			}else{ // just need to shift things around
				expand(stackNum);
			}
		}
		stack.size++;
		stack.pointer = nextElement(stack.pointer);
		buffer[stack.pointer] = value;
	}
	
	public static int pop(int stackNum) throws Exception{
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
	
	public static int peek(int stackNum){
		StackData stack = stacks[stackNum];
		return buffer[stack.pointer];
	}
	
	public static boolean isEmpty(int stackNum){
		StackData stack = stacks[stackNum];
		return stack.size == 0;
	}
}
