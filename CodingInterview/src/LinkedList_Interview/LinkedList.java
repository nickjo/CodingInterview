package LinkedList_Interview;

public class LinkedList {
	// 첫번째 노드를 가리키는 필드
	private Node head;
	private Node tail;
	private int size = 0;
	
	// Node 클래스는 외부에서 접근할수 없음ㄴ
	private class Node{		
		private Object data; // 데이터가 저장될 필드
		private Node next; // 다음 노드를 가리키는 필드
		
		public Node(Object input){
			this.data = input;
			this.next = null;
		}
		
		// 노드의 내용을 쉽게 출력해서 확인해볼 수 있는 기분
		public String toString(){
			return String.valueOf(this.data);
		}
	}
	
	// Node를 첫번째에 추가
	public void addFirst(Object input){
		Node newNode = new Node(input); // 노드 생성
		newNode.next = head; // 새로운 노드의 다음 노드로 헤드를 지정합니다.
		head = newNode; // 헤드로 새로운 노드를 지정합니다.
		size++;
		if(head.next == null){
			tail = head;
		}
	}
	
	// Node를 마지막에 추가
	public void addLast(Object input){
		Node newNode = new Node(input); // 노드 생성
		
		if(size == 0){ // 리스트의 노드가 없다면 첫번째 노드를 추가하는 메소드를 사용한다.
			addFirst(input);
		}else{
			tail.next = newNode; // 마지막 노드의 다음 노드로 생성한 노드를 지정한다.
			tail = newNode; // 마지막 노드 갱신
			size++;
		}
	}
	
	// Node를 특정 위치에 추가
	public void add(int k, Object input){
		// 만약 k가 0이라면 첫번째 노드에 추가하는 것이기 대문에 addFirst를 사용
		if(k == 0){
			addFirst(input);
		}else{
			Node temp1 = node(k-1); // 추가할 위치의 전 노드를 찾음
			Node temp2 = temp1.next; // k번째 노드를 temp2로 지정
			Node newNode = new Node(input); // 새로운 노드 생성
			
			temp1.next = newNode;// temp1의 다음 노드로 새로운 노드 지정
			newNode.next = temp2; // 새로운 노드의 다음 노드로 temp2를 지정
			size++;
			
			// 새로운 노드의 다음 노드가 없다면 새로운 노드가 마지막 노드이므로 tail로 지정
			if(newNode.next == null){
				tail = newNode;
			}
		}
	}
	
	// 특정 위치의 노드 찾기
	Node node(int index){
		Node x = head;
		
		for(int i=0; i < index; i++){
			x = x.next;
		}
		return x;
	}
	
	// 데이터 출력
	public String toString(){
		// 노드가 없다면 []를 리턴
		if(head == null){
			return "[]";
		}
		
		// 탐색 시작
		Node temp = head;
		String str = "[";
		
		// 다음 노드가 없을 때까지 반복문을 실행
		// 마지막 노드는 다음 노드가 없기 때문에 아래의 구문은 마지막 노드는 제외
		while(temp.next != null){
			str += temp.data + ",";
			temp = temp.next;
		}
		
		// 마지막 노드를 출력결과에 포함
		str += temp.data;
		
		return str + "]";
	}
	
	// 첫번째 Node 삭제
	public Object removeFirst(){
		// 첫번째 노드를 temp로 지정하고 head의 값을 두번째 노드로 변경
		Node temp = head;
		head = temp.next;
		
		// 데이터를 삭제하기 전에 리턴할 값을 임시 변수에 담음
		Object returnData = temp.data;
		temp = null; 
		size--;
		return returnData;
	}
	
	// 중간의 Node 삭제
	public Object remove(int k){
		if(k == 0){
			removeFirst();
		}
		
		// k-1번째 노드를 temp의 값으로 지정
		Node temp = node(k-1);
		
		// 삭제 노드를 todoDelete에 기록해 둡니다.
		// 삭제 노드를 지금 제거하면 삭제 앞 노드와 삭제 뒤 노드를 연결할 수 없음
		Node todoDeleted = temp.next;
		temp.next = temp.next.next; // 삭제 앞 노드의 다음 노드로 삭제 뒤 노드를 지정
		Object returnData = todoDeleted.data; // 삭제된 데이터를 리턴하기 위해서 returnData에 저ㅏㅇ
		
		if(todoDeleted == tail){
			tail = temp;
		}
		
		todoDeleted = null;
		size--;
		return returnData;
	}
	
	// 엘리먼트 size 
	public int size(){
		return size;
	}
	
	// 엘리먼트 가져오기
	public Object get(int k){
		Node temp = node(k);
		return temp.data;
	}
	
	// 탐색
	public int indexOf(Object data){
		Node temp = head; // 탐색 대상이 되는 노드를 temp로 지정
		int index = 0; // 탐색 대상이 몇번째 엘리먼트에 잇는지를 의미하는 변수로 index를 사용
		
		// 탐색 값과 탐색 대상의 값을 비교
		while(temp.data != data){
			temp = temp.next;
			index++;
			
			// temp의 값이 null이라는 것은 더 이상 탐색 대싱이 없다는 것을 의미
			if(temp == null){
				return -1;
			}
		}
		return index;
	}
	
	public ListIterator listIterator(){
		return new ListIterator();
	}
	
	
	// ListIterator 내부 클래스
	public class ListIterator{
		private Node lastReturned;
		private Node next;
		private int nextIndex;
		
		public ListIterator() {
			next = head;
			nextIndex = 0;
		}
		
		// 본 메소드를 호출하면 cursor의 참조값이 기존 cursor.next로 변경
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















