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
		
		// Iterator�� �˻��ϸ� ������ �˻� ��ġ�� ��带 ���� �ϰ� �����Ƿ� ó������ �˻��� �ʿ䰡 ����.
		// get �޼ҵ�� ã���� �ش� ����� �����͸� ã�µ� ó������ �ٽ� �˻��� �ؾ���.
		ListIterator lt = numbers.listIterator();
		
		while(lt.hasNext()){
			System.out.print(lt.next() + " ");
		}
	}
}
