package com.onedirect.poc.service;

import com.onedirect.poc.linkedStack.LinkedStack;
import com.onedirect.poc.utility.ProjectUtility;

public class StringProcessor {
	LinkedStack stack;

	public StringProcessor() {
		this.stack = new LinkedStack();
	}

	public void processString(String input) {
		Integer[] inputArray = null;
		try {
			inputArray = ProjectUtility.convertStringToIntArray(input);
		} catch (IllegalArgumentException ex) {
			System.out.println(ex.getMessage());
		}

		int i = 0;
		if (null != inputArray) {
			while (i < inputArray.length) {
				if (inputArray[i] == stack.top()) {
					int j = i + 1;
					while (j < inputArray.length && inputArray[j] == inputArray[i]) {
						j++;
					}
					if (j > i + 1) {
						stack.pop();
						i = j;
					} else {
						stack.pop();
						i++;
					}
				} else {
					stack.push(inputArray[i]);
					i++;
				}
			}
		}
		stack.display();
	}

}
