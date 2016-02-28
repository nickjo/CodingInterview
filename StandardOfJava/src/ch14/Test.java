package ch14;

import java.util.ArrayList;

public class Test {
	public static void main(String[] args) {
		int addResult = 0;
		int a = 1;
		int b = 2;
		
		ArrayList<Integer> al = new ArrayList<>();
		
		for(int i=1; i<=100; i++){
			
		}
		
		addResult = add(1,2);
		//addResult = (a,b) -> {a+b;};
		
		System.out.println(addResult);
		System.out.println();
		
	}
	public static int add(int a, int b){
		return a+b;
	}
}
