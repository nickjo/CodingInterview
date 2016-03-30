package Lv02.test;

import java.util.Scanner;

public class Ex_10869 {
	public static int add(int a, int b){
		return a+b;
	}
	
	public static int subtract(int a, int b){
		return a-b;
	}
	
	public static int multiply(int a, int b){
		return a*b;
	}
	
	public static int division(int a, int b) throws Exception{
		return a/b;
	}
	
	public static int other(int a, int b){
		return a%b;
	}
	
	public static void facadeMethod(int a, int b) throws Exception{
		System.out.println(add(a,b));
		System.out.println(subtract(a,b));
		System.out.println(multiply(a, b));
		System.out.println(division(a, b));
		System.out.println(other(a, b));
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String[] ab = new String[2];
		
		try {
			ab = (s.nextLine()).split("\\s");
			facadeMethod(Integer.parseInt(ab[0]), Integer.parseInt(ab[1]));
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
