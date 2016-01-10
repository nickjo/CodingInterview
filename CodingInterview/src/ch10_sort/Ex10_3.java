package ch10_sort;

public class Ex10_3 {
	public static void main(String[] args){
		EX10_3_intArray exArray = new EX10_3_intArray(5000);

		exArray.bubbleSort(); // 버블 소트		
		//exArray.selectSort(); // 선택 소트
		//exArray.insertionSort();// 삽입 소트
		
		System.out.println(exArray.toString());		
	}
}
