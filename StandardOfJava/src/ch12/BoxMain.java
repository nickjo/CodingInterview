package ch12;

public class BoxMain {
	public static void main(String[] args) {
		Box<String> box = new Box<>();
		
		box.setItem("Box1");
		// ��½� ����ȯ�� ���� �ʾƵ� �ȴ�.
		System.out.println(box.getItem());
	}
}
