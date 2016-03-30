package Lv02;

import java.util.Scanner;

public class Ex_10998 {
	public static int muiltiply(int a, int b){
		return a*b;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String[] ab = new String[2];
		
		try {
			ab = (s.nextLine()).split("\\s");
			System.out.println(muiltiply(Integer.parseInt(ab[0]), Integer.parseInt(ab[1])));
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
