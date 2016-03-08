package ch12;

public class BoxMain {
	public static void main(String[] args) {
		Box<String> box = new Box<>();
		
		box.setItem("Box1");
		// 출력시 형변환을 하지 않아도 된다.
		System.out.println(box.getItem());
	}
}
