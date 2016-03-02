package ch15;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileCopy {
	public static void main(String[] args) {
		try {
			FileInputStream input = new FileInputStream("TEST");
			FileOutputStream output = new FileOutputStream("1234");
			
			int data = 0;
			while((data = input.read()) != -1){
				output.write(data);
			}
			
			System.out.println(output);
			
			input.close();
			output.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
