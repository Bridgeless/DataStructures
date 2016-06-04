package com.griffith.linkedlist;

public class SinglyLinkedList {
	// keeps track of the number of nodes in the list
	private static int counter;
	// keeps track of the beginning of the list
	private Node head;

	public SinglyLinkedList() {
	}

	// Appends the passed data to the end of the list
	public void add(Object data) {
		if (head == null) {
			head = new Node(data);
		}

		Node tempNode = new Node(data);
		Node currentNode = head;

		if (currentNode != null) {
			while (currentNode.getNext() != null) {
				currentNode = currentNode.getNext();
			}
			currentNode.setNext(tempNode);
		}
		incrementCounter();
	}
	// Add an element at a specific spot in the list
	public void add(Object data, int index)
	{
		Node tempNode = new Node(data);
		Node currentNode = head;
		// Check for null first before starting to traverse the list
		if(currentNode != null)
		{
			//Crawl over the list until you find the requested insertion spot or the end of the list
			for(int i = 0; i < index && currentNode.getNext() != null; i++)
				currentNode = currentNode.getNext();
		}
		tempNode.setNext(currentNode.getNext());
		currentNode.setNext(tempNode);
		incrementCounter();
	}

	public int size() {
		return getCounter();
	}

	private int getCounter() {
		return counter;
	}

	private void incrementCounter() {
		counter++;
	}

	private void decrementCounter() {
		counter--;
	}

	public Object get(int index) {
		if (index <= 0) {
			return null;
		}
		Node currentNode = null;
		if (head != null) {
			currentNode = head.getNext();
			for (int i = 0; i < index; i++) {
				if (currentNode.getNext() == null) {
					return null;
				}
				currentNode = currentNode.getNext();
			}
			return currentNode.getData();
		}
		return currentNode;
	}
	
//	public boolean remove(int index)
//	{
//		if(index < 1 || index >size())
//		{
//			return false;
//		}
//		
//		
//		
//	}

	private class Node {
		// The reference to the next node
		Node next;
		// The data in the current node
		Object data;

		public Node(Object dataValue) {
			next = null;
			data = dataValue;
		}

		// Alternative constructor to use in case we want to set the nodes next value
		@SuppressWarnings("unused")
		public Node(Object dataValue, Node nextValue) {
			data = dataValue;
			next = nextValue;
		}

		public Object getData() {
			return data;
		}

		@SuppressWarnings("unused")
		public void setData(Object dataValue) {
			data = dataValue;
		}

		public Node getNext() {
			return next;
		}

		public void setNext(Node nextValue) {
			next = nextValue;
		}
	}
}