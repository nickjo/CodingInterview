package MyStack;

/*
 * StackData는 각 스택에 대한 데이터를 관리하는 간단한 클래스다.
 * 스택에 보관되는 실제 데이터는 보관하거나 관리하지 않는다.
 *  
 * */
public class StackData {
	public int start;
	public int pointer;
	public int size = 0;
	public int capacity;
	
	public StackData(int start, int capacity){
		this.start = start;
		this.pointer = start - 1;
		this.capacity = capacity;
	}
	
	public boolean isWithinStack(int index, int total_size){
		/*
		 * 주의: 스택이 커지다보면 스택의 최상단이 start 왼쪽으로 이동할 수 있다.
		 * 따라서 그런 경우를 (wrapping) 고려해야 한다.
		 * 
		 * */
		if(start <= index && index < start + capacity){
			// wrapping이 발생하지 않은 경우
			return true;
		}else if(start + capacity > total_size && 
				index < (start + capacity) % total_size){
			// wrapping이 발생한 경우
			return true;
		}
		
		return false;
	}
}
