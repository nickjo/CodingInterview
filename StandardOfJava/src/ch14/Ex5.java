package ch14;

public class Ex5 {
	
	
	public static void main(String[] args) {
		MyFunction2 f1 = () -> System.out.println("f1.run()");
		f1.run();
		
		MyFunction2 f2 = new MyFunction2() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("f2.run()");
			}
		};
		f2.run();
		
		MyFunction2 f3 = LambdaEx1.getMyFunction();
		f3.run();
		LambdaEx1.execute(f1);
	}
}