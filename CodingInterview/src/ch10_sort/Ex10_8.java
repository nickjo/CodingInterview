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
				System.out.print("찾은 숫자를 입력하시오(\"p\"를 입력하면 종료합니다.) => ");
				BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
				
				inputNum = in.readLine(); 
				if(inputNum.equals("p") || inputNum.equals("P")){
					System.out.println("프로그램을 종료합니다.");
					break;
				}
				
				System.out.println("x보다 같거나 작은수의 개수(" + inputNum + ")= " + exArray.binaraySearch(Integer.parseInt(inputNum)));
			}
				
		}catch(Exception e){
			e.getMessage();
			e.printStackTrace();
		}
	}
}
