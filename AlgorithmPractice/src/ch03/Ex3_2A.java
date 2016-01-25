package ch03;

import java.util.Iterator;
import java.util.Stack;

/*
 * 스택이 커지면, 각 원소마다 min을 기록하느라 공간이 많이 낭비되는 단점이 있다.
 * */

class StackWithMin extends Stack<NodeWithMin>{
	public void push(int value){
		int newMin = Math.min(value, min());
		super.push(new NodeWithMin(value, newMin));
	}
	
	public int min(){
		if(this.isEmpty()){
			return Integer.MAX_VALUE;
		}else{
			return peek().min;
		}
	}
}

class NodeWithMin{
	public int value;
	public int min;
	public NodeWithMin(int v, int min) {
		value = v;
		this.min = min;
	}
}

public class Ex3_2A {
	public static void main(String[] args) {
		StackWithMin stack = new StackWithMin();
		
		stack.push(6);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		stack.push(1);
		
		Iterator it = stack.iterator();
		
		while(it.hasNext()){
			NodeWithMin n = (NodeWithMin)it.next();
			System.out.println("value=" + n.value + ", min=" + n.min);
		}
		
		stack.pop();
		System.out.println();
		
		it = stack.iterator();
		
		while(it.hasNext()){
			NodeWithMin n = (NodeWithMin)it.next();
			System.out.println("value=" + n.value + ", min=" + n.min);
		}
	}
}
