package com.ttdandjunit;
public class Java_Junit_democlass_Testing {
	Java_Junit_demo_class obj=new Java_Junit_demo_class();
	@SuppressWarnings("static-access")
	@Test
	public void test() {
		assertEquals(obj.To_Remove_A("ABCD"),"BCD");
		assertEquals(obj.To_Remove_A("AACD"),"CD");
		assertEquals(obj.To_Remove_A("BACD"),"BCD");
		assertEquals(obj.To_Remove_A("BBAA"),"BBAA");
	    assertEquals(obj.To_Remove_A("AABAA"),"BAA");
	}
	private void assertEquals(String to_Remove_A, String string) {
		// TODO Auto-generated method stub
		
	}
}