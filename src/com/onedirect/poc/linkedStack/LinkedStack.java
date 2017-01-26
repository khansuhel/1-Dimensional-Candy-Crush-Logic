package com.onedirect.poc.linkedStack;

import com.onedirect.poc.exceptions.NoSuchElementException;

/*  Class linkedStack  */
public class LinkedStack {
	private Node top;
	private int size;

	/* Constructor */
	public LinkedStack() {
		top = null;
		size = 0;
	}

	/* Function to check if stack is empty */
	public boolean isEmpty() {
		return top == null;
	}

	/* Function to get the size of the stack */
	public int getSize() {
		return size;
	}

	/* Function to push an element to the stack */
	public void push(int data) {
		Node nptr = new Node(data, null);
		if (top == null)
			top = nptr;
		else {
			nptr.setNext(top);
			top = nptr;
		}
		size++;
	}

	/* Function to pop an element from the stack */
	public int pop() {
		if (isEmpty())
			throw new NoSuchElementException("Underflow Exception");
		Node ptr = top;
		top = ptr.getNext();
		size--;
		return ptr.getData();
	}

	/* Function to check the top element of the stack */
	public int top() {
		if (isEmpty())
			return -1;
			//throw new NoSuchElementException("Underflow Exception");
		return top.getData();
	}

	/* Function to display the status of the stack */
	public void display() {
		System.out.print("\nStack = ");
		if (size == 0) {
			System.out.print("Empty\n");
			return;
		}
		Node ptr = top;
		while (ptr != null) {
			System.out.print(ptr.getData() + " ");
			ptr = ptr.getNext();
		}
		System.out.println();
	}
}