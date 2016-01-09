package ch10_sort;

import java.util.Random;

public class EX10_3_intArray {
	private int[] intArray;
	
	static int DEFAULT_ARRAY_SIZE = 12;
	
	public EX10_3_intArray(){
		this(DEFAULT_ARRAY_SIZE);
	}
	
	public EX10_3_intArray(int size){
		// Array size 초기화
		intArray = new int[size];
		
		// 배열에 랜덤한 수를 삽입한다.
		insertRandomNumber(size);
	}
	
	private void insertRandomNumber(int n){
		Random r = new Random();
		
		// insert random number
		for(int i=0; i<intArray.length; i++){
			// 0 ~ n*2 사이의 수를 등록한다.
			intArray[i] = r.nextInt(n*2);
			
			// 중복 제거
			for(int j=0; j<i; j++){
				if(intArray[i] == intArray[j]){
					i = i-1;
					break;
				}
			}
		}
	}
	
	public String toString(){
		String str = "Array: [";
		
		for(int i=0; i<intArray.length; i++){
			str += intArray[i]+"";
			
			if(i < intArray.length-1){
				str += ", ";
			}
		}
		return str += "]";
	}
}
