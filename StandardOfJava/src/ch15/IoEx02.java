package ch15;

import java.util.Scanner;

public class IoEx02 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		// ���ڰ� �Է� �ȴٸ� true
		while(s.hasNextInt()){
			System.out.println(s.nextInt() * 100);
		}
		s.close();
	}
}
