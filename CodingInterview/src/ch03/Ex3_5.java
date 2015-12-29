package ch03;

import MyQueue.TwoStacksQueue;

public class Ex3_5 {
	public static void main(String[] args){
		TwoStacksQueue twoStacksQueue = new TwoStacksQueue(5);
		
		try {
			twoStacksQueue.push(0);
			twoStacksQueue.push(1);
			twoStacksQueue.push(2);
			twoStacksQueue.push(3);
			twoStacksQueue.push(4);
			
			System.out.println("peek: " + twoStacksQueue.peek());
			//System.out.println("pop: " + twoStacksQueue.pop());
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
