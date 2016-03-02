package ch15;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ex1 {
	public static void main(String[] args) {

		try {
			FileInputStream fis = new FileInputStream("test.txt");
		/*	FileOutputStream fos = new FileOutputStream("test.txt");
			
			//BufferedInputStream bis = new BufferedInputStream(fis);
			int data =0;
			
			while((data = fis.read()) != -1){
				char c = (char)data;
				System.out.print(c);
			}
			
			System.out.println(fos.write(fis.read()));
			*/
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
