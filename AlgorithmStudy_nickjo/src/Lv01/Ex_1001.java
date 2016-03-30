package Lv01;

import java.util.Scanner;

public class Ex_1001 {
	
	public static int subtract(int a, int b){
		return a-b;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String[] ab = new String[2];
		
		try {
			String input = s.nextLine();
			ab = input.split("\\s");
			
			System.out.println(subtract(Integer.parseInt(ab[0]), Integer.parseInt(ab[1])));
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
}
