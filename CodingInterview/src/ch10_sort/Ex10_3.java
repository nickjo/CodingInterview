package ch10_sort;

public class Ex10_3 {
	public static void main(String[] args){
		EX10_3_intArray exArray = new EX10_3_intArray(5000);

		exArray.bubbleSort(); // ���� ��Ʈ		
		//exArray.selectSort(); // ���� ��Ʈ
		//exArray.insertionSort();// ���� ��Ʈ
		
		System.out.println(exArray.toString());		
	}
}
