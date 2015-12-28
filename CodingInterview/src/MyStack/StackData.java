package MyStack;

/*
 * StackData�� �� ���ÿ� ���� �����͸� �����ϴ� ������ Ŭ������.
 * ���ÿ� �����Ǵ� ���� �����ʹ� �����ϰų� �������� �ʴ´�.
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
		 * ����: ������ Ŀ���ٺ��� ������ �ֻ���� start �������� �̵��� �� �ִ�.
		 * ���� �׷� ��츦 (wrapping) ����ؾ� �Ѵ�.
		 * 
		 * */
		if(start <= index && index < start + capacity){
			// wrapping�� �߻����� ���� ���
			return true;
		}else if(start + capacity > total_size && 
				index < (start + capacity) % total_size){
			// wrapping�� �߻��� ���
			return true;
		}
		
		return false;
	}
}
