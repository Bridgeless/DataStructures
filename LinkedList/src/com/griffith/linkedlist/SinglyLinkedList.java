package com.griffith.linkedlist;

public class SinglyLinkedList<E> {

	// public SinglyLinkedList() {
	// }

	private static class Node<E> {
		// The data in the current node
		private E data;
		// The reference to the next node
		private Node<E> next;

		public Node(E data) {
			this(data, null);
		}

		// Alternative constructor to use in case we want to set the nodes next
		// value
		public Node(E data, Node<E> next) {
			this.data = data;
			this.next = next;
		}
	}

	// keeps track of the beginning of the list
	private Node<E> head = null;
	// keeps track of the number of nodes in the list
	private int size;

	// Appends the passed data to the end of the list
	public boolean add(E data) {
		add(size, data);
		return true;
	}

	// Add an element at a specific spot in the list
	public void add(int index, E data) {
		if (index < 0 || index > size) {
			throw new IndexOutOfBoundsException(Integer.toString(index));
		}
		if (index == 0) {
			head = new Node<E>(data, head);
			size++;
		} 
		else {
			Node<E> node = getNode(index - 1);
			node.next = new Node<E>(data, node.next);
			size++;
		}
	}

	private Node<E> getNode(int index) {
		Node<E> node = head;
		for (int i = 0; i < index && node != null; i++) {
			node = node.next;
		}
		return node;
	}
	
	public E get(int index) {
		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException(Integer.toString(index));
		}
		Node<E> node = getNode(index);
		return node.data;
	}

	public E set(int index, E newValue) {
		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException(Integer.toString(index));
		}
		Node<E> node = getNode(index);
		E result = node.data;
		node.data = newValue;
		return result;
	}
	// This is really all that is needed to set a value
	public void setter(int index, E newValue)
	{
		getNode(index).data = newValue;
	}

	public E remove(int index) {
		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException(Integer.toString(index));
		}
		Node<E> node = getNode(index - 1);
		Node<E> temp = node.next;
//		System.out.println(node.data + " || " + temp.data);
		if (index == 0) {
			if (head != null) {
				head = head.next;
			}
			if (temp != null) {
				size--;
				return temp.data;
			} 
			else {
				size--;
				return null;
			}
		} 
		else {			
			if (temp != null) {
				node.next = temp.next;
				size--;
				return temp.data;
			} else {
				return null;
			}

		}
	}

	public int size() {
		return size;
	}


}
