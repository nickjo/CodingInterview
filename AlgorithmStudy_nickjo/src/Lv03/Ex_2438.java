package Lv03;

import java.util.Scanner;

public class Ex_2438 {
	public static void disResult(int a)throws Exception{
		for(int i=1; i <= a; i++){
			for(int j=i; j >= 1; j--){
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
