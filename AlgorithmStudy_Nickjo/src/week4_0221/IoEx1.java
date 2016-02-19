package week4_0221;

public class IoEx1 {
	public static void main(String[] args) {
		try {
			int input = 0;
			
			while((input=System.in.read()) != -1){
				System.out.println("input: " + input + ", (char)input: " + (char)input);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
