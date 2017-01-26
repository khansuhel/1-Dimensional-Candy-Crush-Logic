package com.onedirect.poc.utility;

public class ProjectUtility {
	public static Integer[] convertStringToIntArray(String input) {
		int len = input.length();
		Integer[] retArray = new Integer[len];

		for (int i = 0; i < len; i++) {
			if (!Character.isDigit(input.charAt(i))) {
		        throw new IllegalArgumentException("Contains an invalid digit");
		      }
			retArray[i] = Integer.parseInt(String.valueOf(input.charAt(i)));
		}
		
		return retArray;
	}
}
