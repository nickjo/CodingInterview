package ArrayList_Interview;

public class ArrayList {
	private int size = 0;
	private Object[] elementData = new Object[100];	
	
	// �����͸� ������ ��ġ�� �߰�
	public boolean add(Object element){
		elementData[size] = element;
		size++;;
		return true;
	}
	
	// �����͸� �߰��� �߰��ϴ� ����
	public boolean add(int index, Object element){
		// ������Ʈ �߰��� �����͸� �߰��ϱ� ���ؼ��� ���� ������Ʈ���� index�� ������ �ڷ� ��ĭ�� �̵����Ѿ���.
		for(int i = size - 1; i >= index; i--){
			elementData[i+1] = elementData[i];
		}
		
		// index�� ��� �߰�
		elementData[index] = element;
		size++;
		
		return true;
	}
	
	// �����͸� ó���� �߰�
	public boolean addFirst(Object element){
		return add(0, element);
	}
	
	// ������ Ȯ��
	public String toString(){
		String str = "[";
		
		for(int i = 0; i < size; i++){
			str += elementData[i];
			if(i < size - 1){
				str += ", ";
			}
		}
		
		return str + "]";
	}
	
	// ������ ����
	public Object remove(int index){
		Object removed = elementData[index];
		
		for(int i = index + 1; i <= size; i++){
			elementData[i-1] = elementData[i];
		}
				
		elementData[size] = null;
		size--;
		
		return removed;
	}
	
	// ù��° ������ ����
	public Object removeFirst(){
		return remove(0);
	}
	
	// ������ ������ ����
	public Object removeLast(){
		return remove(size - 1);
	}
	
	// ������ ������
	public Object get(int index){
		return elementData[index];
	}
	
	// ������Ʈ ũ�� ���
	public int size(){
		return size;
	}
	
	// Ư�� ���� ���� ������Ʈ�� �ε��� �˻�
	public Object indexOf(Object o){
		
		for(int i = 0; i < size; i++){
			if(o.equals(elementData[i])){
				return i;
			}
		}
		return -1;
	}
	
	public ListIterator listIterator(){
		return new ListIterator();
	}
	
	class ListIterator{
		// ���� Ž���ϰ� �ִ� ������ ����Ű�� �ε��� ��
		private int nextIndex = 0;
		private int previousIndex = size;
		
		// next �޼ҵ带 ȣ���� �� �ִ��� üũ�մϴ�.
		public boolean hasNext(){
			// nextIndex�� ������Ʈ�� ���ں��� ���ٸ� next�� �̿��ؼ� Ž���� ������Ʈ�� �����ϴ� ���̱� �빮��
			// true�� �����մϴ�.
			return nextIndex < size();
		}
		
		// ���������� ������Ʈ�� Ž���ؼ� �����մϴ�.
		public Object next(){
			// nextIndex�� �ش��ϴ� ������Ʈ�� �����ϰ� nextIndex�� ���� 1 ����
			return elementData[nextIndex++];
		}
		
		// previous �޼ҵ带 ȣ���ص� �Ǵ����� üũ�մϴ�.
		public boolean hasPrevious(){
			// nextIndex�� 0���� ũ�ٸ� ���� ������Ʈ�� �����Ѵٴ� �ǹ��Դϴ�.
			return previousIndex > 0;
		}
		
		// ���������� ���� ��带 �����մϴ�.
		public Object previous(){
			// ���� ������Ʈ�� �����ϰ� nextIndex�� ���� 1�����մϴ�.
			return elementData[--previousIndex];
		}
		
		// ���� ������Ʈ�� �߰�
		public void add(Object element){
			ArrayList.this.add(nextIndex++,element);
		}
		
		// ���� ������Ʈ�� ����
		public void remove(){
			ArrayList.this.remove(nextIndex-1);
			nextIndex--;
		}
	}
}


















