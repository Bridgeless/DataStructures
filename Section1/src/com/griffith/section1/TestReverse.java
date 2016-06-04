package com.griffith.section1;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestReverse {

	@Test
	public void testString() {
		StringReverser testing = new StringReverser();
		String reversePrimString = testing.reverseString("test");
		assertEquals("tset", reversePrimString);
	}
	
	@Test
	public void testEmptyString() {
		StringReverser testing = new StringReverser();
		String reversePrimString = testing.reverseString("");
		assertEquals("", reversePrimString);
	}
	
	@Test
	public void testSB() {
		StringReverser testing = new StringReverser();
		String reversePrimString = testing.reverseSB("test");
		assertEquals("tset", reversePrimString);
	}
	
	

}
