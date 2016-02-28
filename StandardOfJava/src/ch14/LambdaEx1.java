package ch14;

public class LambdaEx1 {
	static void execute(MyFunction2 f){ // 매계변수의 타입이 MyFunction인 메서드
		f.run();
	}
	
	static MyFunction2 getMyFunction(){ // 반환 타입이  MyFunction2 인 메서드
		MyFunction2 f = () -> System.out.println("f3.run()");
		return f;
	}
}
