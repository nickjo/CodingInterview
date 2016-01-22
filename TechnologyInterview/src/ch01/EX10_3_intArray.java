package ch01;

import java.util.Random;

public class EX10_3_intArray {
	private int[] intArray;
	Random r = new Random();
	
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
	
	// 임의의 수를 배열에 저장 시킨다.
	private void insertRandomNumber(int n){
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
	
	// 정렬된 배열을 임의의 횟수만큼 회전 시킨다.
	public void rotationArray() throws Exception{
		// 회전 시킬 임의의 정수를 구한다.
		int rotationNum = r.nextInt(intArray.length*2)+1;
		System.out.println("회전시킬 횟수: " + rotationNum);
		
		// 회전 시킨 배열을 임시 저장한다.
		int[] tempRotationArray = new int[intArray.length];
		
		// 회전 시키는 수는 현재의 array의 size 나머지 값 만큼 이동된다.
		int rotationValue = rotationNum % (intArray.length);
		
		// 나머지가 0이면 회전 시킬 필요가 없음
		if(rotationValue != 0){
			for(int i=0; i < intArray.length; i++){
				if(i+rotationValue > intArray.length-1){
					tempRotationArray[i+rotationValue-intArray.length] = intArray[i];
				}else if(i+rotationValue < intArray.length-1){
					tempRotationArray[i+rotationValue] = intArray[i];
				}else if(i+rotationValue == intArray.length-1){
					tempRotationArray[0] = intArray[intArray.length-1];
					tempRotationArray[intArray.length-1] = intArray[(intArray.length-1)-rotationValue];
				}
			}
			intArray = tempRotationArray;
		}
	}
	
	// 입력한 수의 인덱스를 반환
	public int searchNumber(int inputNum){
		for(int i=0; i < intArray.length; i++){
			if(inputNum == intArray[i]){
				return i;
			}
		}
		return -1;
	}
	
	// 배열 출력
	public String toString(){
		String str = "Array: [";
		
		for(int i=0; i<intArray.length; i++){
			str += intArray[i]+"";
			
			if(i < intArray.length-1){
				str += ", ";
				if(i != 0 && i % 100 == 0){
					str += "\n\t";
				}
			}
		}
		return str += "]";
	}
	
	// 버블 소트
	public void bubbleSort(){
		intArray = BubbleSort.sort(intArray);
	}
}
