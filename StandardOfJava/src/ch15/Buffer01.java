package ch15;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Buffer01 {
	public static void main(String[] args) throws IOException {
		
		try {
			FileOutputStream fos = new FileOutputStream("test.txt");
			BufferedOutputStream bos = new BufferedOutputStream(fos,5);
			
			for(int i='1'; i <= '9'; i++){
				bos.write(i);
			}
			
			bos.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
