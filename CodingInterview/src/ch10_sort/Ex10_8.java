package ch10_sort;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex10_8 {
	public static void main(String[] agrs){
		EX10_3_intArray exArray = new EX10_3_intArray(20);
		String inputNum = "";
		
		try{
			exArray.quickSort();
			System.out.println("Sorted " + exArray.toString());
			
			while(true){
				System.out.print("ã�� ���ڸ� �Է��Ͻÿ�(\"p\"�� �Է��ϸ� �����մϴ�.) => ");
				BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
				
				inputNum = in.readLine(); 
				if(inputNum.equals("p") || inputNum.equals("P")){
					System.out.println("���α׷��� �����մϴ�.");
					break;
				}
				
				System.out.println("x���� ���ų� �������� ����(" + inputNum + ")= " + exArray.binaraySearch(Integer.parseInt(inputNum)));
			}
				
		}catch(Exception e){
			e.getMessage();
			e.printStackTrace();
		}
	}
}
