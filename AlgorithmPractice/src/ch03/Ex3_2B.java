package ch03;

import java.util.Iterator;
import java.util.Stack;

class StackWithMin2 extends Stack<Integer>{
	Stack<Integer> s2;
	
	public StackWithMin2() {
		// TODO Auto-generated constructor stub
		s2 = new Stack<Integer>(); 
	}
	
	public void push(int value){
		if(value <= min()){
			s2.push(value);
		}
		super.push(value);
	}
	
	public Integer pop(){
		int value = super.pop();
		if(value == min()){
			s2.pop();
		}
		return value;
	}
	
	int min(){
		if(this.isEmpty()){
			return Integer.MAX_VALUE;
		}
		return s2.peek();
	}
}

public class Ex3_2B {
	public static void main(String[] args) {
		StackWithMin2 stack = new StackWithMin2();
		
		stack.push(6);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		stack.push(1);
		
		Iterator it = stack.iterator();
		
		while(it.hasNext()){
			System.out.println("min= " + stack.s2.peek() + ", value=" + it.next());
		}
		
	}
}
