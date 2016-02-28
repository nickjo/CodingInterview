package ch14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Ex1 {
	public static void main(String[] args) {
		int[] arr = new int[5];
		ArrayList arrList = new ArrayList<>();
		
		Arrays.setAll(arr, a -> (int)(Math.random()*5)+1);
		
		Collections.addAll(arrList, arr);
		
		arrList.forEach(i -> {System.out.println(i);});
		
		//for(int a: arr) System.out.print(a + " ");
		
	
	}
}
