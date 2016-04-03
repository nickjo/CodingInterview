package Lv03;

import java.util.Scanner;

public class Ex_2739 {
	public static void disResult(int a) throws Exception{
		for(int i=1; i < 10; i++){
			System.out.println(a + " * " + i + " = " + (a*i));
		}
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		try {
			disResult(Integer.parseInt(s.next()));
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
