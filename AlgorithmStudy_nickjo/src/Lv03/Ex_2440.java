package Lv03;

import java.util.Scanner;

public class Ex_2440 {
	public static void disResult(int a) throws Exception{
		for(int i=0; i < a; i++){
			for(int j=1; j <= a-i; j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		try {
			disResult(s.nextInt());
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
