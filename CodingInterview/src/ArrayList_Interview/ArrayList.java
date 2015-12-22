package ArrayList_Interview;

public class ArrayList {
	private int size = 0;
	private Object[] elementData = new Object[100];	
	
	// 데이터를 마지막 위치에 추가
	public boolean add(Object element){
		elementData[size] = element;
		size++;;
		return true;
	}
	
	// 데이터를 중간에 추가하는 로직
	public boolean add(int index, Object element){
		// 엘러먼트 중간에 데이터를 추가하기 위해서는 끝의 엘러먼트부터 index의 노드까지 뒤로 한칸씩 이동시켜야함.
		for(int i = size - 1; i >= index; i--){
			elementData[i+1] = elementData[i];
		}
		
		// index에 노드 추가
		elementData[index] = element;
		size++;
		
		return true;
	}
	
	// 데이터를 처음에 추가
	public boolean addFirst(Object element){
		return add(0, element);
	}
	
	// 데이터 확인
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
	
	// 데이터 삭제
	public Object remove(int index){
		Object removed = elementData[index];
		
		for(int i = index + 1; i <= size; i++){
			elementData[i-1] = elementData[i];
		}
				
		elementData[size] = null;
		size--;
		
		return removed;
	}
	
	// 첫번째 데이터 삭제
	public Object removeFirst(){
		return remove(0);
	}
	
	// 마지막 데이터 삭제
	public Object removeLast(){
		return remove(size - 1);
	}
	
	// 데이터 가져옴
	public Object get(int index){
		return elementData[index];
	}
	
	// 엘러먼트 크기 출력
	public int size(){
		return size;
	}
	
	// 특정 값을 가진 엘리먼트의 인덱스 검색
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
		// 현재 탐색하고 있는 순서를 가르키는 인덱스 값
		private int nextIndex = 0;
		private int previousIndex = size;
		
		// next 메소드를 호출할 수 있는지 체크합니다.
		public boolean hasNext(){
			// nextIndex가 엘리먼트의 숫자보다 적다면 next를 이용해서 탐색할 엘리먼트가 존재하는 것이기 대문에
			// true를 리턴합니다.
			return nextIndex < size();
		}
		
		// 순차적으로 엘리먼트를 탐색해서 리턴합니다.
		public Object next(){
			// nextIndex에 해당하는 엘리먼트를 리턴하고 nextIndex의 값을 1 증가
			return elementData[nextIndex++];
		}
		
		// previous 메소드를 호출해도 되는지를 체크합니다.
		public boolean hasPrevious(){
			// nextIndex가 0보다 크다면 이전 엘리먼트가 존재한다는 의미입니다.
			return previousIndex > 0;
		}
		
		// 순차적으로 이전 노드를 리턴합니다.
		public Object previous(){
			// 이전 엘리먼트를 리턴하고 nextIndex의 값을 1감소합니다.
			return elementData[--previousIndex];
		}
		
		// 현재 엘리먼트를 추가
		public void add(Object element){
			ArrayList.this.add(nextIndex++,element);
		}
		
		// 현재 엘리먼트를 삭제
		public void remove(){
			ArrayList.this.remove(nextIndex-1);
			nextIndex--;
		}
	}
}


















