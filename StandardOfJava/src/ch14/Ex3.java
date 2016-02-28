package ch14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Ex3 {
	public static void main(String[] args) {
		List<String> arr = Arrays.asList("ddd","ccc","aaa","bbb");
		
		/*Collections.sort(arr, new Comparable<String>() {

			public int compareTo(String s1, String s2) {
				// TODO Auto-generated method stub
				return s2.compareTo(s1);
			}
		});*/
		
		Collections.sort(arr, (s1,s2) -> s1.compareTo(s2));
		
		Iterator<String> it = arr.iterator();
		
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
}
