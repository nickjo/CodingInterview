package Lv03;

import java.util.Scanner;

public class Ex_2741 {
	public static void disResult(int a) throws IndexOutOfBoundsException{
		for(int i=1; i <= a; i++){
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		try {
			disResult(Integer.parseInt(s.next()));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
