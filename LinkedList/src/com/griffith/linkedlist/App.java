package com.griffith.linkedlist;

public class App {

	public static SinglyLinkedList<Integer> testList;
	
	public static void main(String[] args) {
		
		testList = new SinglyLinkedList<Integer>();
		testList.add(5);
		testList.add(2);
		testList.add(3);
//		testList.setter(0, 9);
		testList.remove(2);
//		System.out.println(testList.remove(0));
//		System.out.println(testList.set(0, 9));
//		System.out.println(testList.get(0).next);
//		testList.add(1);
//		testList.add(2);
//		testList.add(3);
//		System.out.println(testList.remove(1) + " ====");
//		testList.add(4);
//		testList.add(0, 5);
//		int test = testList.get(2);
//		String testStr = Integer.toString(test);
//		System.out.println(testStr);
//		
//		System.out.println(testList.size());
//		System.out.println(testList.get(0));
					
		System.out.println("SIZE: " + testList.size());

		for(int i = 0; i < testList.size(); i++)
		{
			System.out.printf(testList.get(i) + " | ");
		}
//		
	}

}
