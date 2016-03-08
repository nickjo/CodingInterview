package ch15;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class IoEx03 {
	public static void main(String[] args) {
		String filePath = "test.txt";
		
		try {
			File fi = new File(filePath);
			Scanner sc = new Scanner(fi);
			
			while(sc.hasNext()){
				System.out.print(sc.next());
			}
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
