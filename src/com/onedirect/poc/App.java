package com.onedirect.poc;

import java.util.Scanner;

import com.onedirect.poc.service.StringProcessor;

public class App {

	public static void main(String[] args) {
		StringProcessor stringProcessor = new StringProcessor();
		System.out.print("Enter the Number : ");
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		sc.close();
		stringProcessor.processString(input);
	}

}
