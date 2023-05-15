package com.examples.j2se.Functions;

import java.util.Scanner;

public class armfun {
	public static void main(String[] args) {
		System.out.println("Enter a number :");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if(armstrong(num)) {
			System.out.println("armstrong number");
			
		}
		else {
			System.out.println("Not armstrong");
		}
		
	}
	static boolean armstrong(int n ) {
		int dig = digits(n);
		int t= n, rem, av =0;
		while(t!=0) {
			
		}
	}
	
	
	static int power(int x, int p) {
		int res=1;
		while(p!=o) {
			res*=x;
			p--;
		}
		return res;
		
		
	}
	static int digits(int num ) {
		int d= 0;
		while(num!=o) {
			num/=10;
			d++;
			
		}
		return d;
	}
}
