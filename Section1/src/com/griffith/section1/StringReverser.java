package com.griffith.section1;

public class StringReverser {

	public StringReverser(){}
	
	public String reverseSB(String inputString)
	{
		StringBuilder outputString = new StringBuilder();
		for(int i = inputString.length()-1; i >= 0; i--)
		{
			char curChar = inputString.charAt(i);
			outputString.append(curChar);
		}
		return outputString.toString();
	}
	
	public String reverseString(String inputString)
	{
		String outputString = "";
		for(int i = inputString.length()-1; i >= 0; i--)
		{
			char curChar = inputString.charAt(i);
			String curStringChar = String.valueOf(curChar);
			outputString = outputString.concat(curStringChar);
		}
		return outputString;
	}
}
