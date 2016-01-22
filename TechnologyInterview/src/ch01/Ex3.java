package ch01;

public class Ex3 {
	public static void main(String[] args) {
		EX10_3_intArray ex3Array = new EX10_3_intArray(8);
		
		try {
			ex3Array.bubbleSort();
			System.out.println(ex3Array.toString());
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			e.getMessage();
		}
	}
}
