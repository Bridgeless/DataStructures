package com.griffith.dupchecker;

public class App {
	
	
	public static void main(String[] args)
	{
		DupChecker newString = new DupChecker();
		boolean tOrF = newString.doesContainDupChar("This may be.");
		System.out.println(tOrF);
	}

}
