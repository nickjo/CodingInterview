package ch14;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;


public class StreamEx1 {
	public static void main(String[] args) {
		String[] strArr = {"aaa","ccc","bbb","aaa"};
		
		List<String> list = Arrays.asList(strArr);
		
		//Collections.sort(list);
		
		//for(String temp: list) System.out.println(temp);
		
		Stream<String> stream = list.stream();
		Stream<String> stream1 = Arrays.asList(strArr).stream();
		
		stream.sorted().forEach(System.out::println);
		stream.sorted().forEach(System.out::println);
		System.out.println();
		stream1.distinct().forEach((str) -> System.out.println(str));
		
		
 	}
}
