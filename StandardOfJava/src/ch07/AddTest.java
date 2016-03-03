package ch07;

public class AddTest implements AddInterface{
	public static void main(String[] args) {
		AddInterface t1 = new AddTest();
		
		//System.out.println(AddInterface.add(10, 20));
		System.out.println(t1.add(40, 20));
	}
}
