package ch03;

import MyStack.ThreeStacks;

/*
 * 3.1 하나의 배열을 사용해 세 개의 스택을 구현하는 방법을 설명하라.
 * 
 * */
public class Ex3_1_1 {
	public static void main(String[] args){
		ThreeStacks stacks = new ThreeStacks();
		ThreeStacks stacks1 = new ThreeStacks(5, 5);
		
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
			
			System.out.println(stacks.toString(0) + "\n");
			System.out.println(stacks.toStringAll());
			
			System.out.println("======================================");
			
			stacks1.push(0, "A");
			stacks1.push(0, "A");
			stacks1.push(0, "A");
			
			stacks1.push(1, "B");
			stacks1.push(1, "B");
			stacks1.push(1, "B");
			
			stacks1.push(2, "C");
			stacks1.push(2, "C");
			stacks1.push(2, "C");
			
			stacks1.push(3, "D");
			stacks1.push(3, "D");
			stacks1.push(3, "D");
			
			stacks1.push(4, "E");
			stacks1.push(4, "E");
			stacks1.push(4, "E");
			
			System.out.println(stacks1.toStringAll());
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		
	}
}
