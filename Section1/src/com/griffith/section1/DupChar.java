package com.griffith.section1;

public class DupChar {

	
	public static void main(String[] args)
	{
		DupCharRemover test = new DupCharRemover();
		String testing = test.remove("");
		System.out.println(testing);
		
		char[] str = new char[5];
		str[0] = 97;
		str[1] = 99;
		str[2] = 97;
		str[3] = 98;
		str[4] = 98;
		
		DupCharRemover testNoArray = new DupCharRemover(str);
		testNoArray.removeDupsNoArray();
		char[] charPrint = testNoArray.getStr();
		String print = charPrint.toString();
//		String p = str.toString();
		System.out.println(print);
		
	}
}
