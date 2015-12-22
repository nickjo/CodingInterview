package ArrayList_Interview;

import ArrayList_Interview.ArrayList.ListIterator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list = new ArrayList();
		/*list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		//list.addLast("TEST");
		list.add(2, 60);
		list.add(60);
		list.add(60);
		list.addFirst(90);
		
		System.out.println("removeFirst: " + list.removeFirst() + ", removeLast: " + list.removeLast());
		System.out.println(list.get(2));		
		System.out.println("size: " + list.size());		
		System.out.println("index: " + list.indexOf(60));
		System.out.println(list.toString());*/
		
		for(int i = 0; i < 200; i++){
			list.add(i);
		}
		
		ListIterator it = list.listIterator();
		
		while(it.hasNext()){
			System.out.print(it.next() + " ");
		}
	}
}
