package Lv03;

import java.util.Scanner;

public class Ex_8393 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int input;
		int result = 0;
		
		try {
			input = s.nextInt();
			
			while(input > 0){
				result += input;
				input--;
			}
			
			System.out.println(result);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
