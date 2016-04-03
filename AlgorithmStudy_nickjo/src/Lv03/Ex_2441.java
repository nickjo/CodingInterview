package Lv03;

import java.util.Scanner;

public class Ex_2441 {
	public static void disResult(int a) throws Exception{
		for(int i=0; i < a; i++){
			// 칸이동
			for(int j=i; j > 0; j--){
				System.out.print(" ");
			}
				
			// 별 출력
			for(int k=(a-i); k > 0; k--){
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int input;
		
		try {
			input = s.nextInt();
			disResult(input);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
