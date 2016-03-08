import java.util.Arrays;

public class DGBTest1 {
	public static void main(String[] args) {
		int[] test = {1,2,3,4,5,6};
		int[] test1;
		
		test1 = Arrays.copyOfRange(test, 2,10);
		
		for(int a:test1) System.out.print(a + " ");
	}
}
