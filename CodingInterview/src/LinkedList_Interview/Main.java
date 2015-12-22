package LinkedList_Interview;

import LinkedList_Interview.LinkedList.ListIterator;

public class Main {
	public static void main(String[] args){
		LinkedList numbers = new LinkedList();
		
		numbers.addFirst(10);
		numbers.addLast(20);
		numbers.addLast(30);
		numbers.addLast(40);
		numbers.addLast(50);
		
		numbers.add(3, 90);
		
		System.out.println(numbers.toString());
		System.out.println("removeFirst: " + numbers.removeFirst());
		System.out.println(numbers.toString());
		System.out.println("remove: " + numbers.remove(2));
		System.out.println(numbers.toString());
		System.out.println("size: " + numbers.size());		
		System.out.println(numbers.get(0));
		System.out.println("index: " + numbers.indexOf(50));
		
		// Iterator로 검색하면 현재의 검색 위치의 노드를 저장 하고 있으므로 처음부터 검색할 필요가 없다.
		// get 메소드로 찾으면 해당 노드의 데이터를 찾는데 처음부터 다시 검색을 해야함.
		ListIterator lt = numbers.listIterator();
		
		while(lt.hasNext()){
			System.out.print(lt.next() + " ");
		}
	}
}
