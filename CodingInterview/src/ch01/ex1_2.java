package ch01;

import java.util.Arrays;

public class ex1_2 {
	
	
	public void checkString(String temp1, String temp2){
		String[] arrTemp1 = new String[temp1.length()];
		String[] arrTemp2 = new String[temp2.length()];
		
		if(temp1.length() != temp2.length()){
			System.out.println("두 문자는 순열이 아닙니다.");
			return;
		}
		
		for(int i = 0; i < temp1.length(); i ++){
			arrTemp1[i] = temp1.charAt(i) + "";			
		}
		
		for(int i = 0; i < temp2.length(); i ++){
			arrTemp2[i] = temp2.charAt(i) + "";			
		}
		
		Arrays.sort(arrTemp1);
		Arrays.sort(arrTemp2);
		
		if(Arrays.equals(arrTemp1, arrTemp2)){
			System.out.println("두 문자는 순열 입니다.");
			return;
		}else{
			System.out.println("두 문자는 순열이 아닙니다.");
			return;
		}
	}
	
	
	public static void main(String[] args){
		String temp1 = "gfdsa1234";
		String temp2 = "4321asdfg";
		
		ex1_2 ex1 = new ex1_2();
		
		ex1.checkString(temp1, temp2);
	}
}
