package Main;
import MyStack.MyStack;

public class StackMain {
	public static void main(String[] args) {
		MyStack stack = new MyStack();
		
		try {
			stack.push("1");
			stack.push("2");
			stack.push("3");
			stack.push("4");
			stack.push("5");
			
			System.out.println(stack.toString());
			
			System.out.println(stack.pop());
			System.out.println(stack.toString());
			
			stack.clear();
			System.out.println(stack.toString());
			
		} catch (Exception e) {
			// TODO: handle exception
			e.getMessage();
			e.printStackTrace();
		}
	}
}
