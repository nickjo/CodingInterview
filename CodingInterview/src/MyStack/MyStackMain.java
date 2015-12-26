package MyStack;

public class MyStackMain {
	public static void main(String[] args){
		MyStack stack = new MyStack();
		
		System.out.println("isEmpty: " + stack.isEmpty());
		//System.out.println("pop: " + stack.pop());
		
		stack.push("a");
		stack.push("b");
		stack.push(0.9);
		stack.push(1);
		stack.push(2);
		
		System.out.println(stack.toString());
		
		System.out.println("pop: " + stack.pop());
		System.out.println("pop: " + stack.pop());
		System.out.println("isEmpty: " + stack.isEmpty());
		
		System.out.println(stack.toString());
	}
}
