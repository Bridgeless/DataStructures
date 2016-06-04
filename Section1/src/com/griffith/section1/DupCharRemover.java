package com.griffith.section1;

public class DupCharRemover {

	private char[] str;

	public DupCharRemover(){}
	public DupCharRemover(char[] str)
	{
		this.str = str;
	}
	
	
	public String remove(String inputStr)
	{
		if(inputStr == null) return inputStr;
		if(inputStr.length() < 2) return inputStr;
		
		StringBuilder outputStr = new StringBuilder();
		boolean asciiList[] = new boolean[256];
		
		for(int i = 0; i < inputStr.length(); i++)
		{
			char curChar = inputStr.charAt(i);
			
			for(int x = 0; x < inputStr.length(); x++)
			{
				if(curChar == inputStr.charAt(x) && asciiList[inputStr.charAt(i)] == false)
				{
					outputStr.append(curChar);
					asciiList[inputStr.charAt(i)] = true;
				}
			}
		}
		return outputStr.toString();
	}
	
	
	public void removeDupsNoArray()
	{
		if(str == null) return;
		int len = str.length;
		if(len < 2) return;
		int tail = 1;
		
		for(int i = 0; i < len; ++i)
		{
			int j;
			for(j = 0; j < tail; ++j)
			{
				if(str[i] == str[j]) break;
			}
			if(j == tail)
			{
				str[tail] = str[i];
				++tail;
			}
		}
		str[tail] = 0;
		System.out.println(str[0]);
		System.out.println(str[1]);
		System.out.println(str[2]);
		System.out.println(str[3]);
		System.out.println(str[4]);
		
	}
	
	public char[] getStr() {
		return str;
	}
}
