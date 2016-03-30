package Ex_1001.test;

import static org.junit.Assert.*;

import org.junit.Test;

import Lv01.Ex_1001;

public class Ex_1001Test {

	@Test
	public void test() {
		Ex_1001 ex = new Ex_1001();
		
		assertEquals(3, ex.subtract(4, 1));
	}
}
