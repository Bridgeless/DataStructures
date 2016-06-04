package com.griffith.section1;

public class ReverseString {

	public static void main(String[] args) {
		
		StringReverser test = new StringReverser();
		
		String reversedString = test.reverseSB("test is good");
		System.out.println(reversedString);
		
		String reversePrimString = test.reverseString("test is good");
		System.out.println(reversePrimString);


	}

}
