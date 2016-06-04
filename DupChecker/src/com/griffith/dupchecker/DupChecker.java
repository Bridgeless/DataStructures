package com.griffith.dupchecker;

public class DupChecker {
	
	
	public DupChecker(){}
	
	public boolean doesContainDupChar(String inputString)
	{
		if(inputString.length() > 256) return false;
		boolean[] char_set = new boolean[256];
		for(int i = 0; i < inputString.length(); i++)
		{
			int asciiVal = inputString.charAt(i);
			if(char_set[asciiVal]) return false;
			char_set[asciiVal] = true;
			System.out.println(char_set[i]);
		}
		
		return true;
		
		
	}

}
