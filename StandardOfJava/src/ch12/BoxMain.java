package ch12;

public class BoxMain {
	public static void main(String[] args) {
		Box<String> box = new Box<>();
		
		box.setItem("쿠팡");
		box.setItem("티몬");
		
		System.out.println(box.getItem());
	}
}
