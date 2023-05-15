package com.examples.j2se.Functions;

import java.util.Scanner;

public class factorial {
public static void main(String[] args) {
	System.out.println("Enter a number :");
	Scanner sc = new Scanner(System.in);
	int num = sc.nextInt();
	int fact = factorial(num);
	System.out.println("fazctorial of the number is :"+fact);
	
}

private static int factorial(int num) {
	if (num==0) {
		return 1;
	}
	// TODO Auto-generated method stub
	return num * factorial(num-1);
}
}
