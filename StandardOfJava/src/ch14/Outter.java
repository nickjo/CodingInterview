package ch14;

class Outter {
	int val = 10;
	
	class Inner{
		int val = 20;
		
		void method(int i){
			int val = 30;
			//i = 100;
			
			MyFunction3 f = () -> {
				System.out.println("i: " + i);
				System.out.println("val: " + val);
			};
			
			f.myMethod();
		}
	}
}
