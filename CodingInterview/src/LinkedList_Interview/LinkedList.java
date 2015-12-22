package LinkedList_Interview;

public class LinkedList {
	// ù��° ��带 ����Ű�� �ʵ�
	private Node head;
	private Node tail;
	private int size = 0;
	
	// Node Ŭ������ �ܺο��� �����Ҽ� ������
	private class Node{		
		private Object data; // �����Ͱ� ����� �ʵ�
		private Node next; // ���� ��带 ����Ű�� �ʵ�
		
		public Node(Object input){
			this.data = input;
			this.next = null;
		}
		
		// ����� ������ ���� ����ؼ� Ȯ���غ� �� �ִ� ���
		public String toString(){
			return String.valueOf(this.data);
		}
	}
	
	// Node�� ù��°�� �߰�
	public void addFirst(Object input){
		Node newNode = new Node(input); // ��� ����
		newNode.next = head; // ���ο� ����� ���� ���� ��带 �����մϴ�.
		head = newNode; // ���� ���ο� ��带 �����մϴ�.
		size++;
		if(head.next == null){
			tail = head;
		}
	}
	
	// Node�� �������� �߰�
	public void addLast(Object input){
		Node newNode = new Node(input); // ��� ����
		
		if(size == 0){ // ����Ʈ�� ��尡 ���ٸ� ù��° ��带 �߰��ϴ� �޼ҵ带 ����Ѵ�.
			addFirst(input);
		}else{
			tail.next = newNode; // ������ ����� ���� ���� ������ ��带 �����Ѵ�.
			tail = newNode; // ������ ��� ����
			size++;
		}
	}
	
	// Node�� Ư�� ��ġ�� �߰�
	public void add(int k, Object input){
		// ���� k�� 0�̶�� ù��° ��忡 �߰��ϴ� ���̱� �빮�� addFirst�� ���
		if(k == 0){
			addFirst(input);
		}else{
			Node temp1 = node(k-1); // �߰��� ��ġ�� �� ��带 ã��
			Node temp2 = temp1.next; // k��° ��带 temp2�� ����
			Node newNode = new Node(input); // ���ο� ��� ����
			
			temp1.next = newNode;// temp1�� ���� ���� ���ο� ��� ����
			newNode.next = temp2; // ���ο� ����� ���� ���� temp2�� ����
			size++;
			
			// ���ο� ����� ���� ��尡 ���ٸ� ���ο� ��尡 ������ ����̹Ƿ� tail�� ����
			if(newNode.next == null){
				tail = newNode;
			}
		}
	}
	
	// Ư�� ��ġ�� ��� ã��
	Node node(int index){
		Node x = head;
		
		for(int i=0; i < index; i++){
			x = x.next;
		}
		return x;
	}
	
	// ������ ���
	public String toString(){
		// ��尡 ���ٸ� []�� ����
		if(head == null){
			return "[]";
		}
		
		// Ž�� ����
		Node temp = head;
		String str = "[";
		
		// ���� ��尡 ���� ������ �ݺ����� ����
		// ������ ���� ���� ��尡 ���� ������ �Ʒ��� ������ ������ ���� ����
		while(temp.next != null){
			str += temp.data + ",";
			temp = temp.next;
		}
		
		// ������ ��带 ��°���� ����
		str += temp.data;
		
		return str + "]";
	}
	
	// ù��° Node ����
	public Object removeFirst(){
		// ù��° ��带 temp�� �����ϰ� head�� ���� �ι�° ���� ����
		Node temp = head;
		head = temp.next;
		
		// �����͸� �����ϱ� ���� ������ ���� �ӽ� ������ ����
		Object returnData = temp.data;
		temp = null; 
		size--;
		return returnData;
	}
	
	// �߰��� Node ����
	public Object remove(int k){
		if(k == 0){
			removeFirst();
		}
		
		// k-1��° ��带 temp�� ������ ����
		Node temp = node(k-1);
		
		// ���� ��带 todoDelete�� ����� �Ӵϴ�.
		// ���� ��带 ���� �����ϸ� ���� �� ���� ���� �� ��带 ������ �� ����
		Node todoDeleted = temp.next;
		temp.next = temp.next.next; // ���� �� ����� ���� ���� ���� �� ��带 ����
		Object returnData = todoDeleted.data; // ������ �����͸� �����ϱ� ���ؼ� returnData�� ������
		
		if(todoDeleted == tail){
			tail = temp;
		}
		
		todoDeleted = null;
		size--;
		return returnData;
	}
	
	// ������Ʈ size 
	public int size(){
		return size;
	}
	
	// ������Ʈ ��������
	public Object get(int k){
		Node temp = node(k);
		return temp.data;
	}
	
	// Ž��
	public int indexOf(Object data){
		Node temp = head; // Ž�� ����� �Ǵ� ��带 temp�� ����
		int index = 0; // Ž�� ����� ���° ������Ʈ�� �մ����� �ǹ��ϴ� ������ index�� ���
		
		// Ž�� ���� Ž�� ����� ���� ��
		while(temp.data != data){
			temp = temp.next;
			index++;
			
			// temp�� ���� null�̶�� ���� �� �̻� Ž�� ����� ���ٴ� ���� �ǹ�
			if(temp == null){
				return -1;
			}
		}
		return index;
	}
	
	public ListIterator listIterator(){
		return new ListIterator();
	}
	
	
	// ListIterator ���� Ŭ����
	public class ListIterator{
		private Node lastReturned;
		private Node next;
		private int nextIndex;
		
		public ListIterator() {
			next = head;
			nextIndex = 0;
		}
		
		// �� �޼ҵ带 ȣ���ϸ� cursor�� �������� ���� cursor.next�� ����
		public Object next(){
			lastReturned = next;
			next = next.next;
			nextIndex++;
			return lastReturned.data;
		}	
		
		public boolean hasNext(){
			return nextIndex < size;
		}
		
		public void add(Object input){
			Node newNode = new Node(input);
			if(lastReturned == null){
				head = newNode;
				newNode = next;
			}else{
				lastReturned.next = newNode;
				newNode.next = next;
			}
			lastReturned = newNode;
			nextIndex++;
			size++;
		}
	}
}















