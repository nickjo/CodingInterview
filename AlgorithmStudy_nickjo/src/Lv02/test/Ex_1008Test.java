package Lv02.test;

import static org.junit.Assert.*;

import org.junit.Test;

import Lv02.Ex_1008;

public class Ex_1008Test {

	@Test
	public void test() throws Exception {
		Ex_1008 ex = new Ex_1008();
		
		// 예상, 실제, 허용 오차
		assertEquals(0, ex.division(1, 3), 0.4);
	}

}
