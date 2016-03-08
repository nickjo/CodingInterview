
public class DGBTest {
	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer("UP");
		StringBuffer sb2 = new StringBuffer("DOWN");
		
		check(sb1, sb2);
		
		System.out.println("sb1: " + sb1 + ", sb2: " + sb2);
	}
	
	public static void check(StringBuffer sb1, StringBuffer sb2){
		sb1.insert(0, "t");
		sb2 = sb1;
	}
}
