package Lv02;

import java.util.Scanner;

public class Ex_1008 {
	public static double division(double a, double b) throws Exception{
		return a/b;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String[] ab = new String[2];
		double result = 0;
		
		try {
			ab = (s.nextLine()).split("\\s");
			
			result = division(Double.parseDouble(ab[0]), Double.parseDouble(ab[1]));
			System.out.println(result); 
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
