package ch03;

import MyStack.QuestionB;

public class Ex3_1_2 {
	public static void main(String[] agrs){
		QuestionB stack = new QuestionB();
		
		try {
			stack.push(0, 0);	
			stack.push(0, 1);	
			stack.push(0, 2);
			stack.push(0, 3);
			stack.push(0, 7);
			
			stack.push(1, 4);	
			stack.push(1, 5);	
			stack.push(1, 6);
			//stack.push(1, 7);
			
			stack.push(2, 8);	
			stack.push(2, 9);	
			stack.push(2, 10);
			stack.push(2, 11);
			
			System.out.println(stack.peek(0));
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		
		
	}
}
