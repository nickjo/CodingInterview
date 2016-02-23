package ch14;

public class Ex2 {
	public static void main(String[] args) {
		MyFunction f = new MyFunction() {
			
			@Override
			public int max(int a, int b) {
				// TODO Auto-generated method stub
				return a > b?a:b;
			}
		};
		
		System.out.println(f.max(2, 5));
		
		MyFunction f1 = (int a, int b) -> a > b ? a:b;
		
		System.out.println(f1.max(5, 10));
		
	} 
}
