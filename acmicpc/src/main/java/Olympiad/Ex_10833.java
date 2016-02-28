package Olympiad;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Ex_10833 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		HashMap<Integer, Integer> s3 = new HashMap<Integer, Integer>();
		int s1,s2;
		int totalSc = Integer.parseInt(s.next());
		int restApple = 0;
		
		while((totalSc--) > 0){
			s1 = Integer.parseInt(s.next());
			s2 = Integer.parseInt(s.next());
			
			// 맵에 학생수와 과일수를 저장
			s3.put(s1, s2);
		}
		
		
		Set<Entry<Integer, Integer>> set = s3.entrySet();
		Iterator<Entry<Integer, Integer>> it = set.iterator();
		
		while(it.hasNext()){
			Map.Entry<Integer, Integer> e = (Map.Entry<Integer, Integer>)it.next();
			restApple += e.getValue() % e.getKey();
		}
		System.out.println(restApple);
	}
}
