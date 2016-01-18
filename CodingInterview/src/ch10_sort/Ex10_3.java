package ch10_sort;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex10_3 {
	public static void main(String[] args){
		EX10_3_intArray exArray = new EX10_3_intArray(20);
		
		try {
			exArray.quickSort();
			System.out.println("Sorted " + exArray.toString());
			exArray.rotationArray();
			System.out.println("rotated " + exArray.toString());
			
			System.out.print("찾은 숫자를 입력하시오 => ");
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			System.out.println(exArray.searchNumber(Integer.parseInt(in.readLine())));
			
		} catch (Exception e) {
			// TODO: handle exception
			e.getMessage();
			e.printStackTrace();
		}
	}
}
