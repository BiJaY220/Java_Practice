package com.examples.j2se.Functions;

public class functions {
	public static void main(String[] args) {
		int a = 7 , b = 5 , sum;
		sum = add(a,b);
		System.out.println("sum: "+sum);
		subtract(a,b);
		float phi = pi();
		System.out.println();
		
	}
	static int add(int a , int b){
		int c = a+ b;
		return c;
	}
	static void subtract(int a , int b) {
		int res = a-b;
		System.out.println("result :"+res);
	}
	static float pi() {
		return 3.1415f;
	}
}
