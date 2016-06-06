package com.griffith.stacklinkedlist;

public class App {

	public static void main(String[] args) {
		LinkedStack testStack = new LinkedStack<Integer>();
		
		testStack.push(5);
		int temp = (int) testStack.peek();
		System.out.println(temp);
	}

}
