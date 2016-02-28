package ch14;

import ch14.Outter.Inner;

public class Ex6 {
	public static void main(String[] args) {
		Outter o = new Outter();
		Inner o1 = o.new Inner();
		
		o1.method(100);
	}
}
