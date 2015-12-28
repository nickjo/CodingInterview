package MyStack;

public class ThreeStacks {
	int stackSize;
	int makeStacks;	
	Object[] buffer;
	int[] stackPointer; // 맨 윗 원소 위치 추적용
	
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
		
		// 원소 초기 위치값
		for(int i=0; i < stackPointer.length; i++){
			stackPointer[i] = -1;
		}
	}
	
	public void push(int stackNum, Object value) throws Exception{
		// 여유 공간이 있는지 검사
		if(stackPointer[stackNum] + 1 >= stackSize){ // 마지막 원소
			throw new Exception("Out of space");
		}
		
		// 스택 포인터를 증가시키고 맨 꼭대기 원소 값 변경
		stackPointer[stackNum]++;
		buffer[absTopOfStack(stackNum)] = value;
	}
	
	// 최상위 데이터를 꺼낸다.
	public Object pop(int stackNum) throws Exception{
		if(stackPointer[stackNum] == -1){
			throw new Exception("Trying to pop an empty stack");
		}
		Object value = buffer[absTopOfStack(stackNum)]; // 맨 윗 원소
		buffer[absTopOfStack(stackNum)] = 0; // 맨 윗 원소 비움
		stackPointer[stackNum]--; // 스택 포인터 감소
		return value;
	}
	
	// 해당 스택의 최상위 데이터를 출력(스택 데이터에는 변화 없음)
	public Object peek(int stackNum){
		int index = absTopOfStack(stackNum);
		return buffer[index];
	}
	
	public boolean isEmpty(int stackNum){
		return stackPointer[stackNum] == -1;
	}
	
	// stackNum이 가리키는 스택의 맨 꼭대기 원소 첨자 반환
	public int absTopOfStack(int stackNum){
		return stackNum * stackSize + stackPointer[stackNum];
	}
	
	// 특정 스택 출력
	public String toString(int stackNum){
		String str = stackNum + "번 Stack: [";
		int firstSize = stackNum * stackSize; 
		
		for(int i = firstSize; i <= firstSize + stackPointer[stackNum]; i++){
		 	str += buffer[i];
		 	if(i <= firstSize + stackPointer[stackNum] - 1){
		 		str += ", ";
		 	}
		}
		return str + "]";
	}
	
	// 모든 스택 출력
	public String toStringAll(){
		String str = "";
		
		for(int i = 0; i < makeStacks; i++){
			str += toString(i) + "\n";
		}
		return str;
	}
}
