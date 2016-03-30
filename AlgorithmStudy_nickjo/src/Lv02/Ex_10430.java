package Lv02;

import java.util.Scanner;

public class Ex_10430 {
	
	public static void displeyResult(int a, int b, int c) throws Exception{
		int cal1, cal2, cal3, cal4;
		
		cal1 = (a+b)%c;
		cal2 = (a%c + b%c)%c;
		cal3 = (a*b)%c;
		cal4 = (a%c * b%c)%c;
		
		System.out.println(cal1);
		System.out.println(cal2);
		System.out.println(cal3);
		System.out.println(cal4);
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String[] abc = new String[3];
		
		try {
			abc = (s.nextLine()).split("\\s");
			displeyResult(Integer.parseInt(abc[0]),
					Integer.parseInt(abc[1]),
					Integer.parseInt(abc[2])
					);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
