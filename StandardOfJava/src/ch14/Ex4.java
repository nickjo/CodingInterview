package ch14;

public class Ex4 {
	public static void main(String[] args) {
		MyFunction1 f = () -> System.out.println("myMethod()");
		aMethod(f);
		MyFunction1 f1 = () -> System.out.println("람다");
		f1.myMethod();
	}
	
	static void aMethod(MyFunction1 f){
		f.myMethod();
	}
}
