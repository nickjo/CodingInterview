package ch03;

import MyStack.ThreeStacks;

/*
 * 3.1 하나의 배열을 사용해 세 개의 스택을 구현하는 방법을 설명하라.
 * 
 * */
public class Ex3_1_1 {
	public static void main(String[] args){
		ThreeStacks stacks = new ThreeStacks();
		
		try {
			stacks.push(0, 0);
			stacks.push(0, 1);
			stacks.push(0, 2);
			stacks.push(0, 3);
			stacks.push(0, 4);
			
			stacks.push(1, 5);
			stacks.push(1, 6);
			stacks.push(1, 7);
			stacks.push(1, 8);
			stacks.push(1, 9);
			
			stacks.push(2, 10);
			stacks.push(2, 11);
			stacks.push(2, 12);
			stacks.push(2, 13);
			stacks.push(2, 14);
			
			System.out.println("1번 Stack peek: " + stacks.peek(1));
			System.out.println("2번 Stack pop: " + stacks.pop(2));
			
			System.out.println(stacks.tostring(0) + "\n");
			System.out.println(stacks.tostringAll());
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		
		
	}
}
